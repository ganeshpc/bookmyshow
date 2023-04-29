package com.example.bookmyshow.controllers;

import com.example.bookmyshow.dtos.CreateTicketDTO;
import com.example.bookmyshow.models.Ticket;
import com.example.bookmyshow.services.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/ticket")
public class TicketController {
    private TicketService ticketService;

    @PostMapping("/")
    public Ticket createTicket(@RequestBody CreateTicketDTO createTicketDTO) {
        return ticketService.createTicket(createTicketDTO);
    }
}
