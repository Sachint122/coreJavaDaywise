package com.multiathread;

class IncrementThread extends Thread {
   	int a = 10; // Instance variable

	@Override
	public void run() {
		incrementAndPrint(); // Call the method from run()
	}

	// Method to increment the value of 'a' and print it
	public void incrementAndPrint() {
		try {
		for (int i=0;i<=100;i++) {
			a++; // Increment 'a'
			System.out.println(Thread.currentThread().getName() + " - Value of a: " + i);
			Thread.sleep(500);
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

public class rougb {
	public static void main(String[] args) {
		// Create and start two threads
		IncrementThread thread1 = new IncrementThread();
		IncrementThread thread2 = new IncrementThread();

		thread1.setName("sachin");
		thread2.setName("Ravi");

		thread1.start();
		thread2.start();
	}
}
