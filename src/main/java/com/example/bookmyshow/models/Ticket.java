package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.TicketStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket extends BaseModel {

    @ManyToOne
    private Show show;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<ShowSeat> showSeats = new ArrayList<>();

    private Double amount;

    @Enumerated
    private TicketStatus status;
}
