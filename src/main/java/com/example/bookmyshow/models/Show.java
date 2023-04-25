package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.Language;
import com.example.bookmyshow.enums.MovieFeature;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
public class Show extends BaseModel {

    @ManyToOne
    private Movie movie;

    @Enumerated
    private Language language;

    private Date startTime;

    private Date endTime;

    @ManyToOne
    private Hall hall;

    @Builder.Default
    @ElementCollection
    @Enumerated
    private List<MovieFeature> movieFeatures = new ArrayList<>();

    @Builder.Default
    @OneToMany
    private List<ShowSeat> showSeats = new ArrayList<>();

    public Show(Long id, Date createdAt, Date updatedAt, Movie movie, Language language, Date startTime, Date endTime, Hall hall, List<MovieFeature> movieFeatures, List<ShowSeat> showSeats) {
        super(id, createdAt, updatedAt);
        this.movie = movie;
        this.language = language;
        this.startTime = startTime;
        this.endTime = endTime;
        this.hall = hall;
        this.movieFeatures = movieFeatures;
        this.showSeats = showSeats;
    }
}
