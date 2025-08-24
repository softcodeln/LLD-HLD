package ParkingLotManagement.models;

import java.time.LocalDateTime;

public class IssueTicketResponseDto {
    String ticketNumber;
    LocalDateTime entryTime;
    String slotNumber;
    String responseMessage;
    ResponseStatus status;

    public IssueTicketResponseDto(String ticketNumber, LocalDateTime entryTime, String slotNumber) {
        this.ticketNumber = ticketNumber;
        this.entryTime = entryTime;
        this.slotNumber = slotNumber;
    }

    public IssueTicketResponseDto() {
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public String getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(String slotNumber) {
        this.slotNumber = slotNumber;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }
}
