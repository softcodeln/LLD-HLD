package ParkingLotManagement.Repository;

import ParkingLotManagement.models.Gate;
import ParkingLotManagement.models.ParkingLot;

import java.util.Date;
import java.util.TreeMap;

public class ParkingLotRepository {
    TreeMap<Long, ParkingLot> parkingLotStore = new TreeMap<>();
    Long previousId = 0l;

    public ParkingLot save(ParkingLot parkingLot) {
        parkingLot.setId(previousId++);
        parkingLot.setCreatedAt(new Date());
        parkingLot.setUpdatedAt(new Date());
        parkingLotStore.put(parkingLot.getId(), parkingLot);
        return parkingLot;
    }

    public ParkingLot getParkingLotByGate(Gate gate) {
        return gate.getParkingLot();
    }

//    public ParkingLot getParkingLotByName(String name);\
//    public ParkingLot getParkingLotById(Long id);
}
