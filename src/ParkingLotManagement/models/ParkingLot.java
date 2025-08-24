package ParkingLotManagement.models;

import java.util.List;

public class ParkingLot extends BaseClass{
    String name;
    List<ParkingFloor> parkingFloors;
    List<AllowedVehicle> allowedVehicles;
    ParkingLotStatus status;
    List<Gate> entryGates;
    List<Gate> exitGates;
    FeeCalcType feeCalcType;
    SlotAllocatinStrategyType slotAllocType;

    public ParkingLot(String name, ParkingLotStatus status) {
        this.name = name;
        this.status = status;
    }

    public ParkingLot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<AllowedVehicle> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(List<AllowedVehicle> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }

    public List<Gate> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<Gate> entryGates) {
        this.entryGates = entryGates;
    }

    public List<Gate> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<Gate> exitGates) {
        this.exitGates = exitGates;
    }

    public FeeCalcType getFeeCalcType() {
        return feeCalcType;
    }

    public void setFeeCalcType(FeeCalcType feeCalcType) {
        this.feeCalcType = feeCalcType;
    }

    public SlotAllocatinStrategyType getSlotAllocType() {
        return slotAllocType;
    }

    public void setSlotAllocType(SlotAllocatinStrategyType slotAllocType) {
        this.slotAllocType = slotAllocType;
    }
}
