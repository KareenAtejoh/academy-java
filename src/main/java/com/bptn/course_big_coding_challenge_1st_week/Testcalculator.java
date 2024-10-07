package com.bptn.course_big_coding_challenge_1st_week;

import java.util.Scanner;

public class Testcalculator {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in); // this object is used to accept input from the user
		
		//this is the declaration
		int number;
		double firstNumber; 
		double secondNumber;
		double result;
		int choice;
		
		System.out.println("/..Calculator Menu../");
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for multiplication");
		System.out.println("Press 4 for division");
		System.out.println("Press 5 to square a number");
		System.out.println("Press 6 to find a square root");
		System.out.println("Press 7 to find the reciprocal");
		
		choice = scanner.nextInt();
	    
		if (choice == 0) {
			System.out.println("Invalid choice! Please make a valid choice.");
		}
		
		else {
			System.out.print("Enter the first Number: ");
			firstNumber = scanner.nextDouble();
			
			System.out.print("Enter the second Number: ");
			secondNumber = scanner.nextDouble();
			
			if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
							
//		System.out.print("Enter the first number: ");
//		firstNumber = scanner.nextDouble();
//		
//		System.out.print("Enter the second number: ");
//		secondNumber = scanner.nextDouble();
		
		// this is for the first choice which is addition 
				if( choice == 1) {
					result = firstNumber + secondNumber;
					System.out.print("The sum of the numbers "+ firstNumber+" and "+secondNumber+" is = "+result);
				}
				
				// this is for the second choice which is subtraction
				else if( choice == 2) {
					result = firstNumber - secondNumber;
					System.out.print("The difference in the numbers "+ firstNumber+" and "+secondNumber+" is = "+result);
				}
				
				// this is for the third choice which is multiplication 
				else if( choice == 3) {
					result = firstNumber * secondNumber;
					System.out.print("The product of the numbers "+ firstNumber+" and "+secondNumber+" is = "+result);
				}
				
				// this is for the fourth choice which is division 
				else if( choice == 4) {
					result = firstNumber / secondNumber;
					System.out.print("The division in the numbers "+ firstNumber+" and "+secondNumber+" is = "+result);
				}
		}
	    
		else {
			System.out.print("Enter Number: ");
			number = scanner.nextInt();
			
			// this is for the fifth choice which is square
			if(choice == 5) {
			   result = number * number;
			   System.out.print(" The square of the number "+number+" is = "+result);
			}
			
			// this is for the sixth choice
			else if(choice == 6) {
				result = Math.sqrt(number);
				System.out.print(" The square root of the number "+number+" is = "+result);
			}
			
			// this is for the seventh choice
						else if(choice == 7) {
							result = 1/ number;
							System.out.print("The reciprocal of the number "+number+" is = "+result);
						}
					}
		
		
		scanner.close();
	}

}
	
}
