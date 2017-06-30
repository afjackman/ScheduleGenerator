package com.movieco;

/**
 * Represents business hours for a single day.
 * Created by adamjackman on 6/30/17.
 */
public class DailyHours {

    private int startHour;
    private int startMin;
    private int endHour;
    private int endMin;

    public DailyHours(int startHour, int startMin, int endHour, int endMin) {
        this.startHour = startHour;
        this.startMin = startMin;
        this.endHour = endHour;
        this.endMin = endMin;
    }

    public int getStartHour() {
        return startHour;
    }

    public int getStartMin() {
        return startMin;
    }

    public int getEndHour() {
        return endHour;
    }

    public int getEndMin() {
        return endMin;
    }
}
