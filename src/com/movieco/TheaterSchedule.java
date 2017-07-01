package com.movieco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the schedule for a theater on a given day.
 * Created by adamjackman on 6/30/17.
 */
public class TheaterSchedule {
    List<MovieSchedule> movieSchedules;
    static int SETUP_MINUTES = 60;

    public TheaterSchedule(List<Movie> movieList, BusinessHours businessHours, int dayOfWeek) {
        SingleDayBusinessHours todaysHours = businessHours.getHours(dayOfWeek);

        // windowStart and windowEnd are the minute values for the window in which movies can be scheduled
        int windowStart = todaysHours.getStartHour() * 60 + todaysHours.getStartMin() + SETUP_MINUTES;
        int windowEnd = todaysHours.getEndHour() * 60 + todaysHours.getEndMin();

        // Populate the list of movie schedules
        movieSchedules = new ArrayList<>(movieList.size());
        for (Movie movie : movieList) {
            MovieSchedule movieSchedule = new MovieSchedule(movie, windowStart, windowEnd);
            movieSchedules.add(movieSchedule);
        }
    }

    // Returns the theater's schedule
    public String toString() {
        StringBuilder schedule = new StringBuilder();
        for (MovieSchedule movieSchedule : movieSchedules) {
            Movie movie = movieSchedule.getMovie();
            schedule.append(movie.toString());
            schedule.append("\n");
            schedule.append(movieSchedule.toString());
            schedule.append("\n");
        }
        return schedule.toString();
    }
}
