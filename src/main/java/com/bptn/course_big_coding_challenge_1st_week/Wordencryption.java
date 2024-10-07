package com.bptn.course_big_coding_challenge_1st_week;

import java.util.Scanner;

public class Wordencryption {

	public static void main(String[] args) {
		
			
	        // Create a Scanner object to get user input
	        Scanner scanner = new Scanner(System.in);

	        // this command is going to prompt the user to enter a word
	        System.out.print("Enter a word to encrypt: ");
	        String input = scanner.nextLine();

	        // this command is going to call the encrypt function to get the encrypted word
	        String encryptedWord = encrypt(input);

	        // this is going to display the encrypted word
	        System.out.println("Encrypted word: " + encryptedWord);
	        
	        // Close the scanner
	        scanner.close();
	    }

	    // this is the method to encrypt the input string by shifting each letter by 1
	    public static String encrypt(String input) {
	        StringBuilder encrypted = new StringBuilder();

	        // to loop through each character in the input string
	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);

	            // to check if the character is a lowercase letter
	            if (c >= 'a' && c <= 'z') {
	            	
	                // Shift the letter and wrap from 'z' to 'a'
	                c = (char) ((c - 'a' + 1) % 26 + 'a');
	            }
	            // Check if the character is an uppercase letter
	            else if (c >= 'A' && c <= 'Z') {
	            	
	                // Shift the letter and wrap from 'Z' to 'A'
	                c = (char) ((c - 'A' + 1) % 26 + 'A');
	            }
	            // Non-alphabetic characters remain unchanged
	            encrypted.append(c);
	        }

	        // Convert StringBuilder to string and return
	        return encrypted.toString();

	}

}

// The program uses the ASCII values of the characters to shift them by 1
// It was challenging as this is my first time using ASCII


