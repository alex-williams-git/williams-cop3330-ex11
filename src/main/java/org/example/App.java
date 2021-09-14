/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        int euros = scan.nextInt();

        System.out.print("What is the exchange rate? ");
        double rate = scan.nextDouble();

        double usd = Math.round((euros * rate) * 100.0) / 100.0;

        System.out.println(euros + " euros at an exchange rate of " + rate + " is " + usd + " U.S. dollars.");
    }
}
