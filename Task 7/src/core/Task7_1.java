package core;

import java.util.Scanner;

public class Task7_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество строк");
		int n = scanner.nextInt();
		String[] string = new String[n];
		for (int i = 0; i < string.length; i++) {
			System.out.println("Введите строку");
			string[i] = scanner.next();

		}

		String min = string[0];
		for (int i = 0; i < string.length; i++) {
			if (string[i].length() < min.length()) {
				min = string[i];

			}
		}
		System.out.println("Самая короткая строка: " + min + " длина строки: " + " " + min.length());

		String max = string[0];
		for (int i = 0; i < string.length; i++) {
			if (string[i].length() > max.length()) {
				max = string[i];
			}
		}
		System.out.println("Самая длинная строка: " + max + " длина строки: " + " " + max.length());

	}

}
