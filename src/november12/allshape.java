package com.november12;
import java.util.Scanner;
abstract class shapes {
	double area;
	abstract void collectdata();
	abstract void calculate();
	void display() {
		System.out.println("areaa is" + area);
	}
}
class circle extends shapes {
	private double radius;
	final private double pi = 3.14768;
	@Override
	void collectdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter redius of circle");
		radius = sc.nextDouble();
	}
	@Override
	void calculate() {
		area = pi * radius * radius;
	}
}
class square extends shapes {
	private double side;
	@Override
	void collectdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter side of square");
		side = sc.nextDouble();
	}
	@Override
	void calculate() {
		area = side * side;
	}
}
class recatangle extends shapes {
	private double l, b;
	@Override
	void collectdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter height of circle");
		l = sc.nextDouble();
		System.out.println("enter width of circle");
		b = sc.nextDouble();
	}
	@Override
	void calculate() {
		area = l * b;
	}
}
class geometry {
	void useShape(shapes s) {
		s.collectdata();
		s.calculate();
		s.display();
		System.out.println("====================\n");
	}
}
public class allshape {
	public static void main(String[] args) {
		circle c=new circle();
		square s=new square();
		recatangle r=new recatangle();
		geometry g=new geometry();
		System.out.println("for the circle");
		g.useShape(c);
		System.out.println("for the circle");
		g.useShape(s);
		System.out.println("for the circle");
		g.useShape(r);
  	}
}