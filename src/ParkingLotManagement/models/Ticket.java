package ParkingLotManagement.models;

import java.time.LocalDateTime;

public class Ticket extends BaseClass{
    String number;
    LocalDateTime entryTime;
    Gate gate;
    Operator operator;
    ParkingSlot parkingSlot;
    Vehicle vehicle;

    public Ticket(String number, LocalDateTime entryTime, Gate gate, Operator operator, ParkingSlot parkingSlot, Vehicle vehicle) {
        this.number = number;
        this.entryTime = entryTime;
        this.gate = gate;
        this.operator = operator;
        this.parkingSlot = parkingSlot;
        this.vehicle = vehicle;
    }

    public Ticket() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
