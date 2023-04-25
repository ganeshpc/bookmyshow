package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.Language;
import com.example.bookmyshow.enums.MovieFeature;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
public class Movie extends BaseModel {
    private String name;
    private Integer duration;
    private Double rating;

    private List<Language> languages = new ArrayList<>();

    private List<MovieFeature> features = new ArrayList<>();

    public Movie(long id, Date createdAt, Date updatedAt, String name, Integer duration, Double rating, List<Language> languages, List<MovieFeature> features) {
        super(id, createdAt, updatedAt);
        this.name = name;
        this.duration = duration;
        this.rating = rating;
        this.languages = languages;
        this.features = features;
    }
}
