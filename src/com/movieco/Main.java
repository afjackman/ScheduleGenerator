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
        String inputFileName = "input.txt";
        List<String> rows = readInRows(inputFileName, false);
        List<Movie> movies = new ArrayList<>(rows.size());
        for (String row : rows) {
            movies.add(new Movie(row));
        }
        System.out.println("\n" + properlyFormattedDate() + "\n");
        TheaterHours theaterHours = new TheaterHours(); // TODO: Modify this using variable schedule.txt input
        TheaterSchedule theaterSchedule = new TheaterSchedule(movies, theaterHours, dayOfWeek());
        System.out.println(theaterSchedule.toString());
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
