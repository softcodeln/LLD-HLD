package ParkingLotManagement.strategies;

import ParkingLotManagement.Repository.ParkingLotRepository;
import ParkingLotManagement.models.SlotAllocatinStrategyType;

public class SlotAllocationStrategyFactory {
    public static SlotAllocationStrategy getStrategy(SlotAllocatinStrategyType type, ParkingLotRepository parkingLotRepository) {
        if (type.equals(type.RANDOM)) {
            return new RandomSlotAllocation(parkingLotRepository);
        }
        throw new RuntimeException("Invalid slot allocation type");
    }
}
