package com.example.bookmyshow.services;

import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.repositories.ShowRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Service
public class ShowService {

    private ShowRepository showRepository;

    public Show getShow(Long id) {
        return showRepository.getReferenceById(id);
    }
}
