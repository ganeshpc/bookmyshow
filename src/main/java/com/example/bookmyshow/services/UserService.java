package com.example.bookmyshow.services;

import com.example.bookmyshow.dtos.CreateUserDTO;
import com.example.bookmyshow.models.User;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {
    public User getUser(String id) {
        System.out.println("Fetching user with id: " + id);
        return null;
    }

    public User createUser(CreateUserDTO createUserDTO) {
        User user = new User(12, new Date(), new Date(), createUserDTO.getEmail());
        return user;
    }
}
