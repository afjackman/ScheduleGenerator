package com.movieco;

/**
 * Represents the business hours for a theater.
 * Created by adamjackman on 6/30/17.
 */
public class TheaterHours {

    DailyHours[] dailyHours;

    public TheaterHours() {
        dailyHours = new DailyHours[7];
        dailyHours[0] = new DailyHours(10, 30, 23, 30);
        dailyHours[1] = new DailyHours(8, 0, 23, 0);
        dailyHours[2] = new DailyHours(8, 0, 23, 0);
        dailyHours[3] = new DailyHours(8, 0, 23, 0);
        dailyHours[4] = new DailyHours(8, 0, 23, 0);
        dailyHours[5] = new DailyHours(10, 30, 23, 30);
        dailyHours[6] = new DailyHours(10, 30, 23, 30);
    }

    public DailyHours getDailyHours(int dayOfWeek) {
        return dailyHours[dayOfWeek];
    }
}
