package com.example.bookmyshow.models;

import lombok.Getter;

import java.util.Date;

@Getter
public class User extends BaseModel {
    private String email;

    public User(long id, Date createdAt, Date updatedAt, String email) {
        super(id, createdAt, updatedAt);
        this.email = email;
    }
}
