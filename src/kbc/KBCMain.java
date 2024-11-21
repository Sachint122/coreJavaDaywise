package com.kbc;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class KBCMain {
	private static Random random = new Random();
	private static Scanner sc = new Scanner(System.in);
	private static boolean fiftyFiftyUsed = false;
	private static boolean phoneAFriendUsed = false;
	private static int lifelines = 2;
	private static int questionCount = 0;

	private static boolean isAsked(int[] askedQuestions, int question) {
		for (int i : askedQuestions) {
			if (i == question) {
				return true;
			}
		}
		return false;
	}

	private static void fiftyFifty(int currentQuestionIndex, String[][] options, int[] answers) {
		System.out.println("50-50 Lifeline used. Two incorrect options will be removed.");

		int correctAnswerIndex = answers[currentQuestionIndex];
		boolean[] showOption = new boolean[4];
		showOption[correctAnswerIndex] = true;
		int count = 0;
		while (count < 1) {
			int randomOption = random.nextInt(4);
			if (randomOption != correctAnswerIndex && !showOption[randomOption]) {
				showOption[randomOption] = true;
				count++;
			}
		}
		for (int i = 0; i < 4; i++) {
			if (showOption[i]) {
				System.out.println("(" + (i + 1) + ") = " + options[currentQuestionIndex][i]);
			}
		}
	}

	public static void phoneAFriend() {
		System.out.println("Phone a Friend Lifeline activated!");
		System.out.println("Calling your friend...");

		Random random = new Random();
		int suggestion = random.nextInt(4);
		while (true) {
			suggestion = random.nextInt(4);
			if (suggestion > 0) {
				break;
			}
		}
		System.out.println("Your friend suggests: \"" + suggestion + "\" (Most likely correct)");
	}

	// Use lifeline method
	private static void useLifeline(int currentQuestionIndex, String[][] options, int[] answers, int temp) {
		if (lifelines == 0) {
			System.out.println("No lifelines left.");
			return;
		}

		System.out.print("Choose lifeline: ");
		if (!fiftyFiftyUsed) {
			System.out.print("1. 50-50 ");
		}
		if (!phoneAFriendUsed) {
			System.out.print("2. Phone a Friend ");
		}

		int choice = -1;
		boolean validInput = false;

		// Loop to validate input
		while (!validInput) {
			try {
				choice = sc.nextInt(); // Read user input
				if ((choice == 1 && !fiftyFiftyUsed) || (choice == 2 && !phoneAFriendUsed)) {
					validInput = true;
				} else {
					System.out.println("Invalid choice or lifeline already used. Please try again.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a number.");
				sc.next(); // Clear invalid input
			}
		}

		switch (choice) {
		case 1:
			if (!fiftyFiftyUsed) {
				fiftyFifty(currentQuestionIndex, options, answers);
				fiftyFiftyUsed = true;
				lifelines--;
			}
			break;
		case 2:
			if (!phoneAFriendUsed) {
				phoneAFriend();
				phoneAFriendUsed = true;
				lifelines--;
			}
			break;
		default:
			System.out.println("Invalid choice.");
			break;
		}
	}

	public static void main(String[] args) {

		String[] questions = {
				"What is Garbage Collection in Java and how does it prevent a Java application from going out of memory?",
				"What are the differences between HashMap and Hashtable in Java?",
				"Explain Function Overloading and Overriding in Java with examples.",
				"How do you reverse a string in Java without using the reverse() utility method?",
				"How do you swap two numbers without using a third variable in Java?",
				"Write a Java program to check if a vowel is present in a string.",
				"Write a Java program to check if a given number is a prime number.",
				"What is the difference between an Interface and an Abstract Class in Java?",
				"Explain the concept of Multithreading in Java and how to create a thread.",
				"What is the Singleton Design Pattern and how is it implemented in Java?" };

		String[][] options = {
				{ "Automatic memory management", "Manual memory management", "Both of the above", "None of the above" },
				{ "HashMap is synchronized", "Hashtable is synchronized", "HashMap allows null keys",
						"All of the above" },
				{ "Same method name, different parameter list", "Same method name, same parameter list",
						"Both of the above", "None of the above" },
				{ "Use StringBuilder", "Use a loop", "Use recursion", "All of the above" },
				{ "Using addition and subtraction", "Using multiplication and division", "Using bitwise XOR",
						"All of the above" },
				{ "Using a loop", "Using a switch statement", "Using regex", "All of the above" },
				{ "Using a loop", "Using recursion", "Using both", "None of the above" },
				{ "Interface has only abstract methods", "Abstract class can have both abstract and concrete methods",
						"Both of the above", "None of the above" },
				{ "Using Thread class", "Using Runnable interface", "Both of the above", "None of the above" },
				{ "Ensures a class has only one instance", "Used for creating a multithreaded environment",
						"Both of the above", "None of the above" } };

		int[] answers = { 0, // Automatic memory management
				3, // All of the above
				2, // Both of the above
				3, // All of the above
				2, // Using bitwise XOR
				3, // All of the above
				2, // Using both
				2, // Both of the above
				2, // Both of the above
				0 // Ensures a class has only one instance
		};

		int[] askedQuestions = new int[10];
		int score = 0;
		UserInfo u = new UserInfo();
		u.takeInput();
		u.massag();
		System.out.println("\n-------------------------\n");
		while (questionCount < 10) {
			int temp = random.nextInt(questions.length);
			if (!isAsked(askedQuestions, temp)) {
				askedQuestions[questionCount] = temp;
				questionCount++;
				System.out.println("Question number (" + questionCount + ")");
				System.out.println(questions[temp]);
				for (int i = 0; i < 4; i++) {
					System.out.println("(" + (i + 1) + ") = " + options[temp][i]);
				}

				System.out.print("Please choose the correct answer(1-4) or type 'lifeline' to use a lifeline: ");
				String userResponse = sc.next();

				if (userResponse.equalsIgnoreCase("lifeline")) {
					useLifeline(temp, options, answers, temp);
					System.out.println("Please pick up a option(1-4)");
					userResponse = sc.next();
				}

				int userAnswer = Integer.parseInt(userResponse) - 1;

				if (answers[temp] == userAnswer) {
					System.out.println("Correct answer!");
					score += 1000;
					System.out.println("You won " + score + " Rupees");
					System.out.println("\n-------------------------\n");
				} else {
					System.out.println("Wrong answer. Game Over! Better luck next time ");
					System.out.println("You won  the price:"+score);
					break;
				}

				//

				if (questionCount == 10) {
					System.out.println("Great! You reached the highest level of the game!");
					break;
				}
			}
		}
		sc.close();
	}
}
