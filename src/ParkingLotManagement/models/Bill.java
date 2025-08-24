package ParkingLotManagement.models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseClass{
    Ticket ticket;
    Date exitTime;
    Double amount;
    Gate gate;
    Operator operator;
    BillStatus billStatus;
    List<Payment> payments;
}
