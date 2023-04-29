package com.example.bookmyshow.exceptions;

public class SeatUnavailableException extends RuntimeException {
    public SeatUnavailableException(Long seatId) {
        super(seatId.toString());
    }
}
