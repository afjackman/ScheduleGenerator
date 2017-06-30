package com.movieco;

/**
 * Represents the business hours for a theater.
 * Created by adamjackman on 6/30/17.
 */
public class BusinessHours {

    SingleDayBusinessHours[] businessHours;

    public BusinessHours() {
        businessHours = new SingleDayBusinessHours[7];
        businessHours[0] = new SingleDayBusinessHours(10, 30, 23, 30);
        businessHours[1] = new SingleDayBusinessHours(8, 0, 23, 0);
        businessHours[2] = new SingleDayBusinessHours(8, 0, 23, 0);
        businessHours[3] = new SingleDayBusinessHours(8, 0, 23, 0);
        businessHours[4] = new SingleDayBusinessHours(8, 0, 23, 0);
        businessHours[5] = new SingleDayBusinessHours(10, 30, 23, 30);
        businessHours[6] = new SingleDayBusinessHours(10, 30, 23, 30);
    }

    public SingleDayBusinessHours getDailyHours(int dayOfWeek) {
        return businessHours[dayOfWeek];
    }
}
