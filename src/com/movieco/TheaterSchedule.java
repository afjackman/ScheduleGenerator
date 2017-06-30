package com.movieco;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the schedule for a theater on a given day.
 * Created by adamjackman on 6/30/17.
 */
public class TheaterSchedule {

    List<MovieSchedule> movieSchedules;

    public TheaterSchedule(List<Movie> movieList, TheaterHours theaterHours, int dayOfWeek) {
        movieSchedules = new ArrayList<>(movieList.size());
        DailyHours todaysHours = theaterHours.getDailyHours(dayOfWeek);
        for (Movie movie : movieList) {
            movieSchedules.add(new MovieSchedule(movie, todaysHours));
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
            schedule.append("\n\n");
        }
        return schedule.toString();
    }
}
