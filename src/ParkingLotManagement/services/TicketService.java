package ParkingLotManagement.services;

import ParkingLotManagement.Repository.GateRepository;
import ParkingLotManagement.Repository.ParkingLotRepository;
import ParkingLotManagement.Repository.VehicleRepository;
import ParkingLotManagement.models.*;
import ParkingLotManagement.strategies.SlotAllocationStrategyFactory;

import java.time.LocalDateTime;
import java.util.Optional;

public class TicketService {
    GateRepository gateRepository;
    VehicleRepository vehicleRepository;
    ParkingLotRepository parkingLotRepository;

    // constructor for dependency injection

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepository parkingLotRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
    }

    public Ticket createTicket(Long gateId, String regNumber, String ownerName, String ownerContact, VehicleType vehicleType) {
        //1. We want to create ticket with all required details.
        // Get Gate - getGateById - in memory Db
        Optional<Gate> gateOptional = gateRepository.getGateById(gateId);
        if (gateOptional.isEmpty()) {
            throw new RuntimeException("Invalid Gate");
        }
        Gate gate = gateOptional.get();
        Ticket ticket = new Ticket();
        ticket.setNumber("123654");
        // Add entryTime
        ticket.setEntryTime(LocalDateTime.now());
        // Get Operator - getOperatorByGateId
        ticket.setOperator(gate.getOperator());
        // Get Vehicle - findOrCreateVehicle - in memory Db
        Vehicle vehicle = vehicleRepository.findOrCreateVehicle(regNumber, ownerName, ownerContact, vehicleType);
        ticket.setVehicle(vehicle);

        //2. Allocate a slot to the ticket
            // Slot allocation strategy
            // Fetch Parking Lot - getParkingLotByGateId
        ParkingLot parkingLot = gate.getParkingLot();
        // Call the slot allocation with parking lot - get the strategy from factory.
        Optional<ParkingSlot> parkingSlotOptional = SlotAllocationStrategyFactory
                .getStrategy(parkingLot.getSlotAllocType(), parkingLotRepository)
                .allocateSlot(parkingLot, vehicle.getVehicleType());
        if (parkingSlotOptional.isEmpty()) {
            throw new RuntimeException("Parking Lot is Full.");
        }
        ticket.setParkingSlot(parkingSlotOptional.get());
        return ticket;
    }
}
