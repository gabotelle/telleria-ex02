/*
 * UCF COP3330 Fall Assignment 1 Solution
 * Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

/*
Prompt user for string
    save input into userString
        Print "<userString> has <userString's length> characters."
*/
public class Solution02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("What is the input string? ");
        String userString = input.nextLine();
        System.out.printf("%s has %d characters.", userString, userString.length());
    }

}

