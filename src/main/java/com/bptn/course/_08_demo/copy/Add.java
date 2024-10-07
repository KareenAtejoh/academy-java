package com.bptn.course._08_demo.copy;

public class Add {

	// Method to add two integers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Main method to run the program
    public static void main(String[] args) {
        Add myAddition = new Add();  // Create an instance of the Add class
        int result = myAddition.add(12, 21);  // Call the add method with two integers
        System.out.println("The sum is: " + result);  // Print the result
    }

//    // Method to add three integers
//    public int add(int num1, int num2, int num3) {
//        return num1 + num2 + num3;
//    }
//
//    // Main method to run the program
//    public static void main(String[] args) {
//        Add myAddition = new Add();  // Create an instance of the Add class
//        int result = myAddition.add(11, 23, 10);  // Call the add method with three integers
//        System.out.println("The sum is: " + result);  // Print the result
//    }
//
//    // Method to add two double values
//    public double add(double num1, double num2) {
//        return num1 + num2;
//    }
//
//    // Main method to run the program
//    public static void main(String[] args) {
//        Add myAddition = new Add();  // Create an instance of the Add class
//        double result = myAddition.add(100.10, 200.5);  // Call the add method with two double values
//        System.out.println("The sum is: " + result);  // Print the result
//    }
}
