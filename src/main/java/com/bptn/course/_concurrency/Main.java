package com.bptn.course._concurrency;

public class Main {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread("Thread 1");
		MyThread thread2 = new MyThread("Thread 2");

		thread1.start(); // Both threads will run concurrently
		thread2.start();
	}
}
