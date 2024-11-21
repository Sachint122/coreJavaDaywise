package com.kbc;

import java.util.Scanner;

public class UserInfo {
	Scanner scanner = new Scanner(System.in);
	String name, email, phoneNumber;

	public void takeInput() {
		System.out.print("Enter your name: ");
		name = scanner.nextLine();
		System.out.print("Enter your email: ");
		email = scanner.nextLine();
		System.out.print("Enter your phone number: ");
		phoneNumber = scanner.nextLine();
		System.out.println("Thank you, " + name + "! Your information has been recorded.");
	}

	public void massag() {
		System.out.println("Welcome, " + name + "! Get ready to test your knowledge and challenge yourself!");
		System.out.println("You're about to embark on an exciting journey in Kaun Banega Crorepati!");
		System.out.println(
				"Stay sharp and trust your instincts—each question could bring you closer to the ultimate prize!");
		System.out.println("Best of luck, " + name + "! Let’s see if you have what it takes to become a Crorepati!\n\n");
	    System.out.println("\n-------------------------\n");
		System.out.println("Here are the rules of the game:");
		System.out.println("1. Objective: Answer 10 questions correctly to win the grand prize.");
		System.out.println("2. Questions: Each question has four options, but only one is correct.");
		System.out.println("3. Answering: Select the correct answer by typing 1, 2, 3, or 4.");
		System.out.println("4. Lifelines: You have two lifelines - '50-50' and 'Phone a Friend'.");
		System.out.println("   - 50-50: Removes two incorrect options, leaving one correct and one incorrect option.");
		System.out.println("   - Phone a Friend: Provides a hint or suggestion for the correct answer.");
		System.out.println("5. Lifelines can each be used only once, so choose wisely!");
		System.out.println("6. Game Over: If you select an incorrect answer, the game ends immediately.");
		System.out.println("7. Goal: Answer all questions to reach the top prize and become a Crorepati!");
		System.out.println("\nGood luck! Let’s start the game!");

	}
}
