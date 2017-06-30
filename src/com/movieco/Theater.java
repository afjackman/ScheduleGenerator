package com.movieco;

import java.time.LocalDate;
import java.util.List;

/**
 * Represents a Theater.
 * Created by adamjackman on 6/30/17.
 */
public class Theater {
    private List<Movie> movieList;
    private BusinessHours businessHours;

    public Theater(List<Movie> movieList, BusinessHours businessHours) {
        this.movieList = movieList;
        this.businessHours = businessHours;
    }

    public TheaterSchedule generateTodaysSchedule() {
        int dayOfWeek = dayOfWeek();
        // get the business hours
        // for each movie, create the movie schedule
        // ultimately build the theater schedule
        // return it
        return null;
    }

    public static int dayOfWeek() {
        return LocalDate.now().getDayOfWeek().getValue();
    }
}
