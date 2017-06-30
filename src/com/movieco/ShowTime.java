package com.movieco;

/**
 * Showtime is a scheduled start and end time for a movie.
 * Created by adamjackman on 6/30/17.
 */
public class Showtime {
    private String startTime;
    private String endTime;

    public Showtime(String startTime, String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String toString() {
        return startTime + " - " + endTime;
    }
}
