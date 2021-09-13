package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;  // Import a scanner for user input
public class App {

    public static void main(String[] args) {
        Scanner NAME = new Scanner(System.in); //new scanner variable NAME
        System.out.println("What's your name"); //prompt for name!
        String username = NAME.nextLine();//string input NAME on the next line
        System.out.println("Hello, " + username + "!"); //hello, NAME, !
    }
}
