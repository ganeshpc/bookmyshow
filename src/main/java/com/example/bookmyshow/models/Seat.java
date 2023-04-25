package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.SeatType;
import lombok.Getter;

import java.util.Date;

@Getter
public class Seat extends BaseModel {
    private final Integer row;
    private final Integer column;

    private final SeatType type;

    public Seat(long id, Date createdAt, Date updatedAt, Integer row, Integer column, SeatType type) {
        super(id, createdAt, updatedAt);
        this.row = row;
        this.column = column;
        this.type = type;
    }
}
