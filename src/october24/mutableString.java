package com.october24;

public class mutableString {

	public static void main(String[] args) {
		String s1 ="sita";
		String s2 ="Ravana";
		s1.concat(s2);
		System.out.println(s1);
		
		StringBuilder sb1= new StringBuilder("sita");
		StringBuilder sb2= new StringBuilder("Ram");
		sb1.append(sb2);
		System.out.println(sb1);
		
		StringBuffer sb3= new StringBuffer("sita");
		StringBuffer sb4= new StringBuffer("Ram");
		sb3.append(sb4);
		System.out.println(sb3);

	}

}
