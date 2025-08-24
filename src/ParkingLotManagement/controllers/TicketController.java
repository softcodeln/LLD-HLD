package ParkingLotManagement.controllers;

import ParkingLotManagement.models.*;
import ParkingLotManagement.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto createTicket(IssueTicketRequestDto requestDTO) {
        IssueTicketResponseDto responseDTO;
        try{
            Ticket ticket = ticketService.createTicket(requestDTO.getGateId() ,requestDTO.getRegNumber(), requestDTO.getOwnerName(), requestDTO.getOwnerContact(), requestDTO.getVehicleType());
            responseDTO = new IssueTicketResponseDto(ticket.getNumber(), ticket.getEntryTime(), ticket.getParkingSlot().getNumber());
            responseDTO.setResponseMessage("Ticket created successfully");
            responseDTO.setStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            // Handle exception, log error, etc.
            System.out.println("Error occurred in ticket creation: " + e.getMessage());
            responseDTO = new IssueTicketResponseDto();
            responseDTO.setResponseMessage("Failed to create ticket: " + e.getMessage());
            responseDTO.setStatus(ResponseStatus.FAILURE);
        }
        return responseDTO;
    }
}
