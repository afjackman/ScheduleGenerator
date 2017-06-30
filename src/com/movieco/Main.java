package com.movieco;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Hello!");
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        System.out.println(n+1);*/
        String inputFileName = "input.txt";
        List<String> rows = readInRows(inputFileName, false);
        List<Movie> movies = new ArrayList<>(rows.size());
        for (String row : rows) {
            movies.add(new Movie(row));
        }
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
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
