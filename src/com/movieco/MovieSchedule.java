package com.movieco;

/**
 * Represents the schedule created for a particular movie at a particular theater on a particular day.
 * Created by adamjackman on 6/30/17.
 */
public class MovieSchedule {

    private Movie movie;
    private DailyHours todaysHours;

    public MovieSchedule(Movie movie, DailyHours todaysHours) {
        this.movie = movie;
        this.todaysHours = todaysHours;
        // TODO The algorithm
    }

    // TODO This method
    // Prints the movie and the times that the movie will play
    public String toString() {
        return "  First Result";
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public DailyHours getTodaysHours() {
        return todaysHours;
    }

    public void setTodaysHours(DailyHours todaysHours) {
        this.todaysHours = todaysHours;
    }
}
