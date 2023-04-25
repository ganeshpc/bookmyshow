package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.TicketStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ticket extends BaseModel {
    private Show show;
    private User user;
    private List<ShowSeat> showSeats = new ArrayList<>();

    private Double amount;

    private TicketStatus status;

    private Payment payment;

    public Ticket(long id, Date createdAt, Date updatedAt, Show show, User user, List<ShowSeat> showSeats, Double amount, TicketStatus status, Payment payment) {
        super(id, createdAt, updatedAt);
        this.show = show;
        this.user = user;
        this.showSeats = showSeats;
        this.amount = amount;
        this.status = status;
        this.payment = payment;
    }
}
