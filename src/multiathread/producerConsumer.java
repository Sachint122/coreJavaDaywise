package com.multiathread;

class Producer extends Thread {
	Queue a;

	public Producer(Queue q) {
		a = q;
	}

	@Override
	public void run() {
		int i = 1;
		while (true) {
			a.put(i++);
		}
	}
}

class Consumer extends Thread {
	Queue b;

	public Consumer(Queue q) {
		b = q;
	}

	@Override
	public void run() {
		while (true) {
			b.get();
		}
	}
}

class Queue {
	int x;

	public void put(int val) {
		x = val;
		System.out.println("producer produce this:" + val + " and stored in queue");
	}

	public void get() {
		System.out.println("consumer consumed this:" + x);
	}
}

public class producerConsumer {
	public static void main(String[] args) {
       Queue q=new Queue();
       Producer p=new Producer(q);
       Consumer c =new  Consumer(q);
       p.start();
       c.start();
	}
}
