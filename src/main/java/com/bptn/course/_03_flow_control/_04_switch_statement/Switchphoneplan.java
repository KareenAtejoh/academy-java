package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class Switchphoneplan {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Light's Network!");
		System.out.println("Please select your date plan: ");
		System.out.println("1. 1 GB - $10");
		System.out.println("2. 5 GB - $30");
		System.out.println("3. 10 GB - $50");
		System.out.println("4. unlimited - $70");
		System.out.println("5. Exit");
	
int choice = scanner.nextInt();
		
		switch(choice) {
			case 1: System.out.println("You ordered 1 GB!");
					break;
			case 2: System.out.println("You ordered 5 GB!");
					break;
			case 3: System.out.println("You ordered 10 GB!");
					break;
			case 4: System.out.println("You ordered unlimited!");
					break;
			case 5: System.out.println("Thank you for stopping by!");
					break;
			default:System.out.println("Invalid Choice!");
		scanner.close();
		}
	}
}
