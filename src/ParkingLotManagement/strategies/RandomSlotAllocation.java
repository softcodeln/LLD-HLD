package ParkingLotManagement.strategies;

import ParkingLotManagement.Repository.ParkingLotRepository;
import ParkingLotManagement.models.*;

import java.util.List;
import java.util.Optional;

public class RandomSlotAllocation implements SlotAllocationStrategy{
    ParkingLotRepository parkingLotRepository;

    public RandomSlotAllocation(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    @Override
    public Optional<ParkingSlot> allocateSlot(ParkingLot parkingLot, VehicleType vehicleType) {
        // List Floors and assign where we have available.
        if (parkingLot.getStatus().equals(ParkingLotStatus.FULL)) {
            return Optional.empty();
        }
        List<ParkingFloor> floors = parkingLot.getParkingFloors();

        for (ParkingFloor floor : floors) {
            if (floor.getParkingFloorStatus().equals(ParkingFloorStatus.FULL)) {
                continue;
            }
            for (ParkingSlot slot : floor.getParkingSlots()) {
                if (slot.getStatus().equals(ParkingSlotStatus.AVAILABLE)) {
                    for (AllowedVehicle vehicle : slot.getAllowedVehicles()) {
                        if (vehicle.getVehicleType().equals(vehicleType)) {
                            slot.setStatus(ParkingSlotStatus.OCCUPIED);
                            // ParkingSlotRepository.update(slot)
                            return Optional.of(slot);
                        }
                    }
                }
            }
        }

        return Optional.empty();
    }
}
