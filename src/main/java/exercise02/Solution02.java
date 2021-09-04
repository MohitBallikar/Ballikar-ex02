/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Mohit Ballikar
 */
package exercise02;
import java.io.*;
import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");

        String string1 = input.nextLine();

            int length = (string1.length());

            System.out.print(string1 + " has " + length + " characters.");
    }
}

/*
    Imported the necessary functions for determining length and using scanners
    Prompted the user for a string
    The string is stored and then its length is calculated
    The length value of the string is printed for the user
*/