package com.movieco;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Hello!");
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        System.out.println(n+1);*/
        readFile();
    }

    public static void readFile() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("input.txt"));
            String str = in.readLine();
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("File Read Error");
        }
    }
}
