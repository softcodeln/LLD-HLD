package ParkingLotManagement.models;

public class Operator extends BaseClass{
    String name;
    Gate gate;
    String empId;

    public Operator(String name, String empId) {
        this.name = name;
        this.empId = empId;
    }
}
