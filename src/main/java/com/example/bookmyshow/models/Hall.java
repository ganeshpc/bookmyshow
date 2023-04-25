package com.example.bookmyshow.models;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
public class Hall extends BaseModel {

    private Integer hallNumber;

    @Builder.Default
    private List<Seat> seats = new ArrayList<>();

    public Hall(long id, Date createdAt, Date updatedAt, Integer hallNumber, List<Seat> seats) {
        super(id, createdAt, updatedAt);
        this.hallNumber = hallNumber;
        this.seats = seats;
    }
}
