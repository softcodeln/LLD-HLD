package ParkingLotManagement.models;

public class Vehicle extends BaseClass{
    String regNumber;
    String ownerName;
    String ownerContact;
    VehicleType vehicleType;

    public Vehicle(String regNumber, String ownerName, String ownerContact, VehicleType vehicleType) {
        this.regNumber = regNumber;
        this.ownerName = ownerName;
        this.ownerContact = ownerContact;
        this.vehicleType = vehicleType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerContact() {
        return ownerContact;
    }

    public void setOwnerContact(String ownerContact) {
        this.ownerContact = ownerContact;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
