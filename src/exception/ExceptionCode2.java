package com.exception;

import java.util.Scanner;

public class ExceptionCode2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the numerator");
			int num = sc.nextInt();// critical statememt
			System.out.println("Enter the denomitor");
			int dem = sc.nextInt();// critical statememt
			int res = num / dem;// critical statememt
			System.out.println(res);
		}
		catch (Exception e) {
			System.out.println("Exception Handled");
		}
	}

}
