package com.example.bookmyshow.dtos;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class CreateTicketDTO {
    private Long userId;
    private Long showId;
    private List<Long> showSeatIds = new ArrayList<>();
}
