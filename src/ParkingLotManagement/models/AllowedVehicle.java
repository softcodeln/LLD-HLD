package ParkingLotManagement.models;

public class AllowedVehicle extends BaseClass{
    VehicleType vehicleType;
    Integer capacity;

    public AllowedVehicle(VehicleType vehicleType, Integer capacity) {
        this.vehicleType = vehicleType;
        this.capacity = capacity;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
