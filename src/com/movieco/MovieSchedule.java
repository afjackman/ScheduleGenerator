package com.movieco;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the schedule created for a particular movie at a particular theater on a particular day.
 * Created by adamjackman on 6/30/17.
 */
public class MovieSchedule {
    private Movie movie;
    private List<Showtime> showtimes;
    static int CHANGEOVER_MINUTES = 35;

    // Generate the schedule based on the available time window
    public MovieSchedule(Movie movie, int windowStart, int windowEnd) {

        // Create the list of showtimes
        showtimes = new ArrayList<>();
        this.movie = movie;
        int runtime = movie.getRunTimeMinutes();

        // Populate the list of showtimes by creating a back-to-back list of movies front-loaded in the time window
        for (int i = windowStart; i + runtime < windowEnd; i = i + runtime + CHANGEOVER_MINUTES)
            showtimes.add(new Showtime(i, i + runtime));

        // Push showtimes back until they cannot be pushed back any more
        for (int i = showtimes.size() - 1; i >= 0; i --) {
            Showtime showtime = showtimes.get(i);
            int newStartTime = calculateBestStartTime(i, showtimes, windowStart, windowEnd, runtime);
            if (newStartTime == showtime.getStartMinute())
                break; // We are done, as movies cannot be pushed back any more
            showtime.setStartMinute(newStartTime);
            showtime.setEndMinute(newStartTime + runtime);
        }
    }

    // Calculate latest possible showtime for index i based on the adjacent showtimes, time window, and runtime
    // When possible, use the slightly earlier but easier to read time (divisible by 5)
    private int calculateBestStartTime(int i, List<Showtime> showtimes, int windowStart, int windowEnd, int runtime) {
        int latestStartMinute = (i == showtimes.size() - 1) ? windowEnd - runtime : showtimes.get(i + 1).getStartMinute() - CHANGEOVER_MINUTES - runtime;
        int latestEasyReadStartMinute = latestStartMinute - (latestStartMinute % 5);
        boolean easyReadOverlapsPrevious = (i > 0 && latestEasyReadStartMinute < showtimes.get(i - 1).getEndMinute() + CHANGEOVER_MINUTES);
        boolean easyReadBeforeWindowStart = latestEasyReadStartMinute < windowStart;
        return (easyReadOverlapsPrevious || easyReadBeforeWindowStart) ? latestStartMinute : latestEasyReadStartMinute;
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

}
