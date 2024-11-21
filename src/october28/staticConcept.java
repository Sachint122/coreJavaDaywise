package com.october28;

class calculator {
	static int a, b, c;// static variables
	int p, q, r;// non-static variables
	// static blocks
	static {
		a = 100;
		b = 200;
		c = 300;
		//p=223;// can not access non-static variables in static block
		//q=1332;// can not access non-static variables in static block
		//r=2323;// can not access non-static variables in static block
	}
	// non-static
	{
		p = 1000;
		q = 2000;
		r = 3000;
		a=132;
		b=2223;
		c=232;
	}

	// static methods
	static void dispay1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	//	p=223;// can not access non-static variables in static methods
		//q=1332;// can not access non-static variables in static methods
		//r=2323;// can not access non-static variables in static methods
	}

	// non static methods
	void display2() {
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(c);
		System.out.println(b);
		System.out.println(c);
	}
}

public class staticConcept {
   public static void main(String[] args) {
	   System.out.println(calculator.a);
	   System.out.println(calculator.b);
	   System.out.println(calculator.c);
	   System.out.println("===========");
	   calculator.dispay1();
	   System.out.println("===========");
	   calculator calculator = new calculator();
	   System.out.println(calculator.p);
	   System.out.println(calculator.q);
	   System.out.println(calculator.r);
	   System.out.println("===========");
	   calculator.display2();
	   System.out.println("===========");
  	}
}
