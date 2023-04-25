package com.example.bookmyshow.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
public class City extends BaseModel {

    private String name;

    private List<Theatre> theatres = new ArrayList<>();

    public City(Long id, Date createdAt, Date updatedAt, String name) {
        super(id, createdAt, updatedAt);

        this.name = name;
    }
}
