package com.november13;
//rule:11
interface calculator1{
	int a=10;
}
//rule:13
interface oprat{
	void sub();
	void sub1();
	void sub2();
	void sub3();
	void sub4();
	default void ii() {
		
	}
	static void de() {
		
	}
}
//rule:14
@FunctionalInterface
interface oprat2{
	void sub();
   default  void sub1() {
	   
   }

	default void ii() {
		
	}
	static void de() {
		
	}
}
//rule:15
interface empty{
	
}
class testing implements calculator1{
	void disp() {
		System.out.println(a);
		a=222;//rule:11
	}
}
public class interfacecode3 {

}
