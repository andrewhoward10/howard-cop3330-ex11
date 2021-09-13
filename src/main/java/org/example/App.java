/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        double euros, dollar, rate;

        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        euros = keyboardInput.nextDouble();

        System.out.print("What is the exchange rate? ");
        rate = keyboardInput.nextDouble();

        dollar = euros * rate;

        System.out.println(euros + " euros at an exchange rate of " + rate + " is " );
        System.out.print(String.format("%.2f", dollar) + " U.S. dollars. ");





    }
}
