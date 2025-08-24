package ParkingLotManagement.models;

public class Gate extends BaseClass{
    String number;
    Operator operator;
    GateStatus gateStatus;
    GateType gateType;
    ParkingLot parkingLot;

    public Gate(String number, Operator operator, GateStatus gateStatus, GateType gateType, ParkingLot parkingLot) {
        this.number = number;
        this.operator = operator;
        this.gateStatus = gateStatus;
        this.gateType = gateType;
        this.parkingLot = parkingLot;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
}
