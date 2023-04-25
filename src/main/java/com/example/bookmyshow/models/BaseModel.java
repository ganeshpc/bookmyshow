package com.example.bookmyshow.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class BaseModel {

    private  long id;

    private Date createdAt;

    private Date updatedAt;
}
