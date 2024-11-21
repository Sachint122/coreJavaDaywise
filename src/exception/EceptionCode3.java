package com.exception;

import java.util.Scanner;

public class EceptionCode3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the numerator");
			int num = sc.nextInt();// critical statememt InputMisMatchException
			System.out.println("Enter the denomitor");
			int dem = sc.nextInt();// critical statememt  InputMisMatchException
			int res = num / dem;// critical statememt ArthamaticException
			System.out.println(res);
			System.out.println("Division opration started");
			System.out.println("====================");
			System.out.println("Arrays opration started");
			System.out.println("Enter the array size");
			int size=sc.nextInt();// critical statememt  InputMisMatchException
			int arr[]=new int[size];// critical statememt -NegativeArraySizeException
			System.out.println("Enter the position number to add the data:");
			int pos=sc.nextInt();// critical statememt  InputMisMatchException
			System.out.println("Enter the number");
			num=sc.nextInt();// critical statememt   InputMisMatchException
			arr[pos]=num;// critical statememt  IndexOutOfBoundsException
			System.out.println("data Added");
			System.out.println("array oparation completeddr");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("hello");
	}

}
