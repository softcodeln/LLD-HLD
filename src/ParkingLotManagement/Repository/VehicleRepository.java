package ParkingLotManagement.Repository;

import ParkingLotManagement.models.Vehicle;
import ParkingLotManagement.models.VehicleType;

import java.util.Date;
import java.util.TreeMap;

public class VehicleRepository {
    TreeMap<String, Vehicle> vehicleStore = new TreeMap<>();
    Long previousId = 0l;

    public Vehicle save(Vehicle vehicle) {
        // Logic to save vehicle to the database
        vehicle.setId(previousId++);
        vehicle.setCreatedAt(new Date());
        vehicle.setUpdatedAt(new Date());
        vehicleStore.put(vehicle.getRegNumber(), vehicle);
        return vehicle;
    }

    public Vehicle findOrCreateVehicle(String regNumber, String ownerName, String ownerContact, VehicleType vehicleType) {
        // Not search by ID, need to search by regNumber
        if (vehicleStore.containsKey(regNumber)) {
            return vehicleStore.get(regNumber);
        }
        Vehicle vehicle = new Vehicle(regNumber, ownerName, ownerContact, vehicleType);
        return save(vehicle);
    }
}
