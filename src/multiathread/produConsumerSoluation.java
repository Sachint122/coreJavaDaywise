package com.multiathread;

class Producer1 extends Thread {
	Queue1 a;

	public Producer1(Queue1 q) {
		a = q;
	}

	@Override
	public void run() {
		int i = 1;
		while (true) {
			i++;
//			System.out.println(i);
			a.put(i);
			
		}
	}
}

class Consumer1 extends Thread {
	Queue1 b;

	public Consumer1(Queue1 q) {
		b = q;
	}

	@Override
	public void run() {
		while (true) {
			b.get();
		}
	}
}

class Queue1 {
	boolean value_of_x = false;
	int x;

	synchronized public void put(int val) {
		try {
			if (value_of_x == false) {
				x = val;
				System.out.println("producer produce this:" + val + " and stored in queue");
				value_of_x = true;
				notify();
			} else {
				wait();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	 synchronized public void get() {
		try {
			if (value_of_x == true) {
//				x = val;
				System.out.println("consumer consumed this:" + x);
				value_of_x = false;
				notify();
			} else {
				wait();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class produConsumerSoluation {
	public static void main(String[] args) {
		Queue1 q = new Queue1();
		Producer1 p = new Producer1(q);
		Consumer1 c = new Consumer1(q);
		p.start();
		c.start();
	}
}
