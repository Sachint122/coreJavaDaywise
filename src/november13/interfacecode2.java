package com.november13;
//rule:12
interface test1{
	void  disp();
	void sub() {
		
	}
}
interface test2{
	void disp2();
}
//ruke:9
interface test3 implements test2{
	
}
//rule:10 
interface test4 extends test2{
	
}
//rule:8
class Sample implements test1,test2{
	
}
public class interfacecode2 {
  public static void main(String[] args) {
	
}
}
