package com.movieco;

import java.text.DecimalFormat;

/**
 * Showtime is a scheduled start and end time for a movie.
 * Created by adamjackman on 6/30/17.
 * Note that the minute of the day is used for the startTime and endTime.
 */
public class Showtime {
    private int startMinute;
    private int endMinute;

    public Showtime(int startMinute, int endMinute) {
        this.startMinute = startMinute;
        this.endMinute = endMinute;
    }

    public String toString() {
        return minuteToTime(startMinute) + " - " + minuteToTime(endMinute);
    }

    public String minuteToTime(int minute) {
        int hour = minute / 60;
        int min = minute % 60;
        return String.format("%2d", hour) + ":" + new DecimalFormat("00").format(min);
    }

    public int getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(int endMinute) {
        this.endMinute = endMinute;
    }

    public int getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }
}
