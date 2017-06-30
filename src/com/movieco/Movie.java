package com.movieco;

/**
 * Represents a Movie.
 * Created by adamjackman on 6/30/17.
 */
public class Movie {

    private String title;
    private int year;
    private String rating;
    private String runTime;

    public Movie(String title, int year, String rating, String runTime) {
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.runTime = runTime;
    }

    public Movie(String fileRow) {
        String[] stringArray = fileRow.split(", ");
        title = stringArray[0];
        year = Integer.parseInt(stringArray[1]);
        rating = stringArray[2];
        runTime = stringArray[3];
    }

    public String toString() {
        return title + ", " + year + ", " + rating + ", " + runTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }
}
