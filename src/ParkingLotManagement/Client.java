package ParkingLotManagement;

import ParkingLotManagement.Repository.GateRepository;
import ParkingLotManagement.Repository.ParkingLotRepository;
import ParkingLotManagement.Repository.VehicleRepository;
import ParkingLotManagement.controllers.TicketController;
import ParkingLotManagement.models.*;
import ParkingLotManagement.services.TicketService;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        System.out.println("Welcome to the Parking Lot Management System!");
        // Create controller
        // Create service
        // Create repository

        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

        TicketService ticketService = new TicketService(gateRepository, vehicleRepository, parkingLotRepository);

        TicketController ticketController = new TicketController(ticketService);

        ParkingLot parkingLot = new ParkingLot("Phoenix Parking Yard", ParkingLotStatus.OPEN);
        // Generate some pre data
        // some gates, a parking lot, parking slots
        Operator operator = new Operator("Akash", "G01395681");
        Gate gateEntry1 = new Gate("1", operator, GateStatus.OPEN, GateType.ENTRY, parkingLot);
        Gate gateEntry2 = new Gate("2", operator, GateStatus.OPEN, GateType.ENTRY, parkingLot);
        Gate gateExit1 = new Gate("3", operator, GateStatus.OPEN, GateType.EXIT, parkingLot);
        Gate gateExit2 = new Gate("4", operator, GateStatus.OPEN, GateType.EXIT, parkingLot);

        // Entry gates
        List<Gate> entryGates = new ArrayList<>();
        entryGates.add(gateEntry1);
        entryGates.add(gateEntry2);
        parkingLot.setEntryGates(entryGates);
        //Exit gates
        List<Gate> exitGates = new ArrayList<>();
        exitGates.add(gateExit1);
        exitGates.add(gateExit2);
        parkingLot.setExitGates(exitGates);

        // Allocation strategy
        parkingLot.setSlotAllocType(SlotAllocatinStrategyType.RANDOM);

        // parking lot Id
        parkingLot.setId(1234567891L);

        // Parking floor
        ParkingFloor parkingFloor = new ParkingFloor();
        parkingFloor.setFloorNumber(1);
        parkingFloor.setParkingFloorStatus(ParkingFloorStatus.OPEN);

        List<ParkingSlot> parkingSlots = new ArrayList<>();
        List<AllowedVehicle> av1List = new ArrayList<>();
        av1List.add(new AllowedVehicle(VehicleType.BIKE, 1));
        List<AllowedVehicle> av2List = new ArrayList<>();
        av2List.add(new AllowedVehicle(VehicleType.BIKE, 1));
        List<AllowedVehicle> av3List = new ArrayList<>();
        av1List.add(new AllowedVehicle(VehicleType.CAR, 1));
        List<AllowedVehicle> av4List = new ArrayList<>();
        av1List.add(new AllowedVehicle(VehicleType.BIKE, 1));
        parkingSlots.add(new ParkingSlot("1", ParkingSlotStatus.AVAILABLE, av1List));
        parkingSlots.add(new ParkingSlot("2", ParkingSlotStatus.AVAILABLE, av2List));
        parkingSlots.add(new ParkingSlot("3", ParkingSlotStatus.AVAILABLE, av3List));
        parkingSlots.add(new ParkingSlot("4", ParkingSlotStatus.AVAILABLE, av4List));
        parkingFloor.setParkingSlots(parkingSlots);

        List<ParkingFloor> parkingFloorList = new ArrayList<>();
        parkingFloorList.add(parkingFloor);

        parkingLot.setParkingFloors(parkingFloorList);
        gateEntry1.setParkingLot(parkingLot);
        gateEntry2.setParkingLot(parkingLot);
        gateExit1.setParkingLot(parkingLot);
        gateExit2.setParkingLot(parkingLot);

        gateRepository.save(gateEntry1);
        gateRepository.save(gateEntry2);
        gateRepository.save(gateExit1);
        gateRepository.save(gateExit2);

        parkingLotRepository.save(parkingLot);

        IssueTicketRequestDto requestDTO = new IssueTicketRequestDto();
        requestDTO.setGateId(1l);
        requestDTO.setRegNumber("RJ36CA7054");
        requestDTO.setOwnerName("Rohan");
        requestDTO.setOwnerContact("9522505598");
        requestDTO.setVehicleType(VehicleType.CAR);

        IssueTicketResponseDto responseDTO = ticketController.createTicket(requestDTO);
        if (responseDTO.getStatus().equals(ResponseStatus.SUCCESS)) {
            System.out.println(responseDTO.getResponseMessage());
            System.out.println("Ticket :" + responseDTO.getTicketNumber() + " at slot : " + responseDTO.getSlotNumber());
        } else {
            System.out.println(responseDTO.getResponseMessage());
        }

        IssueTicketRequestDto requestDTO2 = new IssueTicketRequestDto();
        requestDTO2.setGateId(1l);
        requestDTO2.setRegNumber("RJ36CA7055");
        requestDTO2.setOwnerName("Roohii");
        requestDTO2.setOwnerContact("9522505599");
        requestDTO2.setVehicleType(VehicleType.CAR);

        responseDTO = ticketController.createTicket(requestDTO2);
        if (responseDTO.getStatus().equals(ResponseStatus.SUCCESS)) {
            System.out.println(responseDTO.getResponseMessage());
            System.out.println("Ticket :" + responseDTO.getTicketNumber() + " at slot : " + responseDTO.getSlotNumber());
        } else {
            System.out.println(responseDTO.getResponseMessage());
        }

    }
}