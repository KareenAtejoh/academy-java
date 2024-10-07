package com.bptn.course_big_coding_challenge_1st_week;

import java.util.Scanner;

public class PluralForm {

	public static void main(String[] args) {
	
		        // Create a Scanner object for user input
		        Scanner scanner = new Scanner(System.in);

		        // this is to prompt the user to enter an integer amount and a singular noun
		        System.out.print("Enter a non-negative integer (amt): ");
		        int amt = scanner.nextInt(); // Read integer input for amt

		        System.out.print("Enter a singular noun (word): ");
		        String word = scanner.next(); // Read string input for word

		        // Print the amount followed by the word, pluralized if amt is not 1
		        System.out.println(amt + " " + pluralize(amt, word));

		        // Close the scanner
		        scanner.close();
		    }

		    // Method to pluralize the word based on the given amount
		    public static String pluralize(int amt, String word) {
		        // If amt is 1, return the singular word
		        if (amt == 1) {
		            return word;
		        } else {
		            // to apply special pluralization rules
		            if (word.endsWith("fe")) {
		                // this is to replace "fe" with "ves" (e.g., knife -> knives)
		                return word.substring(0, word.length() - 2) + "ves";
		            } else if (word.endsWith("y") && !isVowel(word.charAt(word.length() - 2))) {
		                // this is to replace "y" with "ies" for words ending with consonant + y (e.g., family -> families)
		                return word.substring(0, word.length() - 1) + "ies";
		            } else {
		                // Default plural rule: this rule is going to add 's' to the end of the word
		                return word + "s";
		            }
		        }
		    }

		    // Helper method to check if a character is a vowel
		    public static boolean isVowel(char c) {
		        c = Character.toLowerCase(c);
		        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
		    }
		}
