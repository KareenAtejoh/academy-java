package com.bptn.course_big_coding_challenge_1st_week;

import java.util.Scanner;
public class Stringoperations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		String userInput1;
		String userInput2;
		boolean tryAgain = true;
		String doAgain = "N";
		
		do {
		System.out.println("/…String Menu…/");
		System.out.println("Press 1 for Palindrome Check");
		System.out.println("Press 2 to reverse a String");
		System.out.println("Press 3 to Concatenate two Strings");
		System.out.println("Press 4 for String Comparison");
		System.out.println("Press 5 to Calculate the Length of String");
		choice = scanner.nextInt();
		if (choice == 1) {
			System.out.println("Palindrome Check");
			System.out.println("Enter a string");
			userInput1 = scanner.next();
			// palidrome check
			String reversed = new StringBuilder(userInput1).reverse().toString();
			System.out.println(reversed);
		}
		
		else if (choice == 2) {
			System.out.println("Reverse the String");
			System.out.println("Enter a string");
			userInput1 = scanner.next();
			String reversed = new StringBuilder(userInput1).reverse().toString();
			System.out.println(reversed);
		}

			else if (choice == 3) {
				System.out.println("Concatenate two Strings");
				System.out.println("Enter a string");
				userInput1 = scanner.next();
				String reversed = new StringBuilder(userInput1).reverse().toString();
				System.out.println(reversed);	
			}
				
				else if (choice == 4) {
					System.out.println("String Comparison");
					System.out.println("Enter The First string");
					userInput1 = scanner.next();
					
					String reversed = new StringBuilder(userInput1).reverse().toString();
					System.out.println(reversed);
				//comparison
				}
			
				else if (choice == 5) {
					System.out.println("Length of a String");
					System.out.println("Enter a string");
					userInput1 = scanner.next();
					
					// string length 
								}
		
				else {
					System.out.println("Invalid choice! Please make a valid choice");
					doAgain = scanner.nextInt();
					choice = scanner.nextInt();
					
							
				}
		while (tryAgain); 
		
		scanner.close();

		}
		
	}
