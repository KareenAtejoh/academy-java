package com.bptn.course_big_coding_challenge_1st_week;

import java.util.Scanner;

public class NumberGuessingGame {
	
    public static void main(String[] args) {
        
    	// this is to define the target number as 23
        int targetNumber = 23;
        int guess = 0;  // Initialize guess
        int attempts = 0;  // Track the number of attempts

        // to create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        // this is the game loop: it is going to continue until the user guesses the correct number
        while (guess != targetNumber) {
            // Prompt the user for a guess
            System.out.print("Enter your guess: ");
            
            // Read the user's guess
            guess = scanner.nextInt();
            attempts++;  // Increment the attempt counter

            // Provide feedback based on the guess
            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a valid number between 1 and 100.");
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                // Correct guess
                System.out.println("Congratulations! You've guessed the number " + targetNumber + " in " + attempts + " attempts.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
