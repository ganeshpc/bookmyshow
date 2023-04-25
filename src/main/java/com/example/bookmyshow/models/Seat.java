package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;

import java.util.Date;

@Getter
@Entity
public class Seat extends BaseModel {
    private final Integer row;
    private final Integer column;

    @Enumerated
    private final SeatType type;

    public Seat(long id, Date createdAt, Date updatedAt, Integer row, Integer column, SeatType type) {
        super(id, createdAt, updatedAt);
        this.row = row;
        this.column = column;
        this.type = type;
    }
}
