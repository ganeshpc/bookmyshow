package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.security.PublicKey;
import java.util.Date;

@Getter
@Entity
@Setter
public class User extends BaseModel {
    private String email;

    public User(long id, Date createdAt, Date updatedAt, String email) {
        super(id, createdAt, updatedAt);
        this.email = email;
    }


}
