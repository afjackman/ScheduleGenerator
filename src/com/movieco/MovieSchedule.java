package com.movieco;

import java.util.List;

/**
 * Represents the schedule created for a particular movie at a particular theater on a particular day.
 * Created by adamjackman on 6/30/17.
 */
public class MovieSchedule {

    private Movie movie;
    private List<Showtime> showtimes;

    public MovieSchedule(Movie movie, List<Showtime> showtimes) {
        this.movie = movie;
        this.showtimes = showtimes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Showtime showtime : showtimes) {
            sb.append("  ");
            sb.append(showtime.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void addShowTime(Showtime showtime) {
        showtimes.add(showtime);
    }

    public void removeShowTime(Showtime showtime) {
        showtimes.remove(showtime);
    }
}
