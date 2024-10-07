package com.bptn.course._big_coding_challenge_weektwo;

public class Main {

//	public static void main(String[] args) {
//		Employee student = new Employee(100, 8);
//
//		// print the salary of the employee
//		System.out.println(student.getSalary());
//	}
//
//}

	public static void main(String[] args) {
		Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
		System.out.println(stock);
		stock.adjustPrice(20);
		System.out.println(stock);
	}
}