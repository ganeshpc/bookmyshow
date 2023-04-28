package com.example.bookmyshow.controllers;

import com.example.bookmyshow.dtos.CreateUserDTO;
import com.example.bookmyshow.exceptions.InvalidEmailException;
import com.example.bookmyshow.models.User;
import com.example.bookmyshow.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
       return userService.getUser(id);
    }

    @PostMapping("/")
    public User createUser(@RequestBody CreateUserDTO createUserDTO) {
        if (createUserDTO.getEmail() == null) {
            throw new InvalidEmailException("Email is null");
        }

        return userService.createUser(createUserDTO);
    }
}


//
// 1.     Constructor injection
//          1. Adding RestController annotation will make it a component
//          2. Since we are having all args constructor spring will see the UserService as the constructor
//              parameter and will fetch the bean of UserService which is also a component
// 2.    Setter injection
//      public void setUserService(UserService userService) { this.userService = userService; }
// 3.     Field injection using autowire
//         @Autowire
//         private UserService userService;