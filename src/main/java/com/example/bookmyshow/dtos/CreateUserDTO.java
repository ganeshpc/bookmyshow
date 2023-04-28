package com.example.bookmyshow.dtos;

import com.example.bookmyshow.models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CreateUserDTO {
    private String email;
}
