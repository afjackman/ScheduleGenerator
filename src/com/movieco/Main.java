package com.movieco;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String inputFileName = takeInInputFileName();
        List<Movie> movies = readFileIntoMoviesList(inputFileName);
        TheaterHours theaterHours = readInTheaterHours();
        printDate();
        int dayOfWeek = dayOfWeek();
        TheaterSchedule theaterSchedule = createTheaterSchedule(movies, theaterHours, dayOfWeek);
        printSchedule(theaterSchedule);
    }

    private static void printSchedule(TheaterSchedule theaterSchedule) {
        System.out.println(theaterSchedule.toString());
    }

    private static TheaterSchedule createTheaterSchedule(List<Movie> movies, TheaterHours theaterHours, int dayOfWeek) {
        return new TheaterSchedule(movies, theaterHours, dayOfWeek);
    }

    private static void printDate() {
        System.out.println("\n" + properlyFormattedDate() + "\n");
    }

    private static TheaterHours readInTheaterHours() {
        return new TheaterHours(); // TODO: Modify this using variable schedule.txt input
    }

    private static List<Movie> readFileIntoMoviesList(String inputFileName) {
        List<String> rows = readInRows(inputFileName, false);
        List<Movie> movies = new ArrayList<>(rows.size());
        for (String row : rows) {
            movies.add(new Movie(row));
        }
        return movies;
    }

    public static String takeInInputFileName() {
        return "input.txt";
    }

    public static String properlyFormattedDate() {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE M/d/yyyy");
        return localDate.format(formatter);
    }

    public static int dayOfWeek() {
        return LocalDate.now().getDayOfWeek().getValue();
    }

    public static List<String> readInRows(String inputFileName, boolean includeFirstLine) {
        List<String> rows = new ArrayList<String>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(inputFileName));
            String str;
            if (!includeFirstLine)
              in.readLine();
            while ((str = in.readLine()) != null) {
                rows.add(str);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("File Read Error");
        }
        return rows;
    }
}
