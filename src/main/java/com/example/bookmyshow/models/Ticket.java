package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.TicketStatus;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
public class Ticket extends BaseModel {

    @ManyToOne
    private Show show;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<ShowSeat> showSeats = new ArrayList<>();

    private Double amount;

    @Enumerated
    private final TicketStatus status;

    public Ticket(long id, Date createdAt, Date updatedAt, Show show, User user, List<ShowSeat> showSeats, Double amount, TicketStatus status) {
        super(id, createdAt, updatedAt);
        this.show = show;
        this.user = user;
        this.showSeats = showSeats;
        this.amount = amount;
        this.status = status;
    }
}
