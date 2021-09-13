package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;
import java.util.Date;

class Main {
    public static void main(String[] args) {
        //declare variables
        int curAge, retAge;
        Scanner sc = new Scanner(System.in);

        //Implement date function so program can be accurate at any date
        Date d = new Date();
        int year = d.getYear();

        System.out.println("What is your current age?");
        curAge = sc.nextInt();
        System.out.println("At what age would you like to retire?");
        retAge = sc.nextInt();

        //print out findings
        System.out.println("You have " + (retAge - curAge) + " years left until you can retire.");
        System.out.println("It's " + (year + 1900) + ", so you can retire in " + (year + (retAge - curAge) + 1900));

        sc.close();
    }
}