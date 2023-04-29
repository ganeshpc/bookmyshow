package com.example.bookmyshow.services;

import com.example.bookmyshow.enums.SeatStatus;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.repositories.ShowSeatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ShowSeatService {

    private ShowSeatRepository showSeatRepository;

    public List<ShowSeat> getSeats(List<Long> showSeatIds) {
        return showSeatRepository.findAllById(showSeatIds);
    }

    public void lockSeats(List<ShowSeat> showSeats) {
        for (ShowSeat showSeat: showSeats) {
            showSeat.setStatus(SeatStatus.LOCKED);
        }
        showSeatRepository.saveAll(showSeats);
    }
}
