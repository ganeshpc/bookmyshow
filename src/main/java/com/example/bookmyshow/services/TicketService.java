package com.example.bookmyshow.services;

import com.example.bookmyshow.dtos.CreateTicketDTO;
import com.example.bookmyshow.enums.SeatStatus;
import com.example.bookmyshow.enums.TicketStatus;
import com.example.bookmyshow.exceptions.SeatUnavailableException;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.models.Ticket;
import com.example.bookmyshow.repositories.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TicketService {
    private UserService userService;
    private ShowSeatService showSeatService;
    private ShowService showService;
    private TicketRepository ticketRepository;

    public Ticket createTicket(CreateTicketDTO createTicketDTO) {
        // check for seat availability
        List<ShowSeat> showSeats = showSeatService.getSeats(createTicketDTO.getShowSeatIds());

        seatAvailability(showSeats);

        // Mark system as blocked
        showSeatService.lockSeats(showSeats);

        // create and persist seats
        Ticket ticket = new Ticket();

        ticket.setStatus(TicketStatus.PENDING);
        ticket.setUser(userService.getUser(createTicketDTO.getUserId()));
        ticket.setShow(showService.getShow(createTicketDTO.getShowId()));
        ticket.setShowSeats(showSeats);

        ticketRepository.save(ticket);

        return ticket;
    }

    private void seatAvailability(List<ShowSeat> showSeats) {
        for (ShowSeat showSeat : showSeats) {
            if (showSeat.getStatus() != SeatStatus.AVAILABLE) {
                throw new SeatUnavailableException(showSeat.getId());
            }
        }
    }
}
