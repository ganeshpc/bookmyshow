package com.example.bookmyshow.services;

import com.example.bookmyshow.dtos.CreateUserDTO;
import com.example.bookmyshow.models.User;
import com.example.bookmyshow.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class UserService {

    public UserRepository userRepository;
    public User getUser(Long id) {
        System.out.println("Fetching user with id: " + id);
        return null;
    }

    public User createUser(CreateUserDTO createUserDTO) {
        User user = new User(12, new Date(), new Date(), createUserDTO.getEmail());
        return userRepository.save(user);
    }
}
