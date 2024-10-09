package com.MyProject;

public class patternAtoZ {

	// Method to return pattern condition for a given character, position (i, j),
	// and size n
	public static boolean patternCondition(char ch, int i, int j, int n) {
		switch (ch) {
		case 'A':
			return (i == 0 && j != n - 1 && j != 0) || (j == 0 && i != 0) || (j == n - 1 && i != 0) || i == n / 2;

		case 'B':
			return (i == 0 && j != n - 1) || (j == 0) || (j == n - 1 && i != 0 && i != n - 1 && i != n / 2)
					|| (i == n / 2 && j != n - 1) || (i == n - 1 && j != n - 1 && i != n / 2);

		case 'C':
			return (i == 0 && j != 0) || (j == 0 && i != 0 && i != n - 1) || (i == n - 1 && j != 0);

		case 'D':
			return (i == 0 && j != n - 1) || (j == 0) || (i == n - 1 && j != n - 1)
					|| (j == n - 1 && i != 0 && i != n - 1);

		case 'E':
			return i == 0 || i == n - 1 || i == n / 2 || j == 0;

		case 'F':
			return i == 0 || i == n / 2 || j == 0;

		case 'G':
			return (j == 0 && i != 0 && i != n - 1) || (i == 0 && j != 0) || (i == n / 2 && j > n / 2 && j != n - 1)
					|| (j == n - 1 && i >= n / 2 && i != n / 2) || (i == n - 1 && j < n / 2 && j != 0)
					|| (j == n / 2 && i > n / 2 && i != n - 1);

		case 'H':
			return j == 0 || i == n / 2 || j == n - 1;

		case 'I':
			return i == 0 || j == n / 2 || i == n - 1;

		case 'J':
			return i == 0 || (j == n / 2) || (i - j == n / 2);

		case 'K':
			return j == 0 || i - j == n / 2 || i + j == n / 2;

		case 'L':
			return j == 0 || i == n - 1;

		case 'M':
			return j == 0 || (i == j && j <= n / 2) || (i + j == n - 1 && j >= n / 2) || j == n - 1;

		case 'N':
			return j == 0 || i == j || j == n - 1;

		case 'O':
			return (j == 0 && i != 0 && i != n - 1) || (i == 0 && j != 0 && j != n - 1)
					|| (j == n - 1 && i != 0 && i != n - 1) || (i == n - 1 && j != 0 && j != n - 1);

		case 'P':
			return (i == 0 && j != n - 1 && j != 0) || (j == 0 && i != 0) || (j == n - 1 && i <= n / 2) || i == n / 2;

		case 'Q':
			return (j == 0 && i != 0 && i < n / 2) || (i == 0 && j != 0 && j < n / 2)
					|| (i == n / 2 && j != 0 && j < n / 2) || (j == n / 2 && i != 0 && i < n / 2)
					|| (i == j && i + j >= 6 && i + j <= 14);

		case 'R':
			return (j == 0 && i != 0) || (i == 0 && j != 0 && j < n / 2) || (i == n / 2 && j < n / 2) || i - j == n / 2
					|| (j == n / 2 && i < n / 2);

		case 'S':
			return (i == 0 && j != 0) || (j == 0 && i != 0 && i < n / 2) || (i == n / 2 && j != 0 && j != n - 1)
					|| (j == n - 1 && i > n / 2 && i != n - 1) || (i == n - 1 && j != 0 && j != n - 1);

		case 'T':
			return i == 0 || j == n / 2;

		case 'U':
			return (j == 0 && i != n - 1) || (j == n - 1 && i != n - 1) || (i == n - 1 && j != 0 && j != n - 1);

		case 'V':
			return (j == 0 && i < n / 2) || i - j == n / 2 || i + j == (n - 1) + n / 2 || (j == n - 1 && i < n / 2);

		case 'W':
			return j == 0 || (i + j == n - 1 && j <= n / 2) || (i == j && j >= n / 2) || j == n - 1;

		case 'X':
			return i == j || i + j == n - 1;

		case 'Y':
			return (i == j && j < n / 2) || (j == n / 2 && i >= n / 2) || (i + j == n - 1 && j > n / 2);

		case 'Z':
			return i == 0 || i + j == n - 1 || i == n - 1;

		default:
			return false; // Invalid character
		}
	}

	// Method to print the pattern for the entire message horizontally
	public static void printPatternHorizontally(String message, int n) {
		char[] messageArray = message.toCharArray(); // Convert message to character array

		// Loop for each row
		for (int i = 0; i < n; i++) {
			// Loop through each character in the message
			for (char ch : messageArray) {
				// For each character, loop through the columns
				for (int j = 0; j < n; j++) {
					if (patternCondition(ch, i, j, n)) {
						System.out.print("\u2765");
					} else {
						System.out.print(" ");
					}
				}
				// Add a space between characters for clarity
				System.out.print("   ");
			}
			// Move to the next line after printing a row for all characters
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Define your message here
		String message = "YOUR CLASS IS "; // You can replace this with any message
		int n = 7; // Size of the pattern (choose an odd number for symmetry)

		// Print the message horizontally
		printPatternHorizontally(message, n);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		printPatternHorizontally("EXCELENET SIR", n);
	}
}
