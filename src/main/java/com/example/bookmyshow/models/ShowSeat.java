package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.SeatStatus;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

import java.util.Date;

@Getter
public class ShowSeat extends BaseModel {
    private Double price;

    @Enumerated
    private SeatStatus status;

    @ManyToOne
    private Seat seat;

    @ManyToOne
    private Show show;

    public ShowSeat(long id, Date createdAt, Date updatedAt, Double price, SeatStatus status, Seat seat, Show show) {
        super(id, createdAt, updatedAt);
        this.price = price;
        this.status = status;
        this.seat = seat;
        this.show = show;
    }
}
