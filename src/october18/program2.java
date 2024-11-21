package com.october18;

import java.util.Scanner;

class VowelOps {
	int total_vowel;
	int total_consonat;
	int non_alpha;
	int total_capital_vowel;
	int total_lower_case_vowel;

	public void countAllVowels(String str) {
		str = str.toUpperCase();
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				if ((str.charAt(i) == 'A') || (str.charAt(i) == 'E') || str.charAt(i) == 'I' || str.charAt(i) == 'O'
						|| str.charAt(i) == 'U') {
					total_vowel++;

				} else {
					total_consonat++;
				}
			} else {
				non_alpha++;
			}
		}
		System.out.println("the total vowel count is:" + total_vowel);
		System.out.println("the total consonat count is:" + total_consonat);
		System.out.println("non Alphabet count is:" + non_alpha);
		System.out.println("================");
	}

	public void capitalVowels(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				if ((str.charAt(i) == 'A') || (str.charAt(i) == 'E') || str.charAt(i) == 'I' || str.charAt(i) == 'O'
						|| str.charAt(i) == 'U') {
					total_capital_vowel++;

				}
			}
		}
		System.out.println("the total capital vowel is:  " + total_capital_vowel);
		System.out.println("=========================");
	}

	public void lowerCaseVowels(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || str.charAt(i) == 'i' || str.charAt(i) == 'o'
						|| str.charAt(i) == 'u') {
					total_lower_case_vowel++;

				}
			}
		}
		System.out.println("the lower case  vowel is:  " + total_lower_case_vowel);
		System.out.println("=========================");
	}

	public void replaceAllVowels(String str) {
		str = str.toLowerCase();
		String str_temp = "";
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				str_temp += "$";

			} else
				str_temp += str.charAt(i);
		}
		str = str_temp;
		System.out.println("the replaced all  vowel is with spacial symbols:  " + str);
		System.out.println("=========================");

	}

	public void replaceUpperCaseVowels(String str) {
		String str_temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				if ((str.charAt(i) == 'A') || (str.charAt(i) == 'E') || str.charAt(i) == 'I' || str.charAt(i) == 'O'
						|| str.charAt(i) == 'U') {
					str_temp += "$";

				} else
					str_temp += str.charAt(i);
			} else
				str_temp += str.charAt(i);
		}
		str = str_temp;
		System.out.println("the replace upper case vowels with :  " + str);
		System.out.println("=========================");

	}

	public void replaceLowerCaseVowels(String str) {
		String str_temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || str.charAt(i) == 'i' || str.charAt(i) == 'o'
						|| str.charAt(i) == 'u') {
					str_temp += "$";

				} else
					str_temp += str.charAt(i);
			} else
				str_temp += str.charAt(i);
		}
		str = str_temp;
		System.out.println("the replace upper case vowels with :  " + str);
		System.out.println("=========================");
	}
}

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string:  ");
		String str = sc.nextLine();
		VowelOps vo = new VowelOps();
		vo.countAllVowels(str);
		vo.capitalVowels(str);
		vo.lowerCaseVowels(str);
		vo.replaceAllVowels(str);
		vo.replaceUpperCaseVowels(str);
		vo.replaceLowerCaseVowels(str);
	}
}
