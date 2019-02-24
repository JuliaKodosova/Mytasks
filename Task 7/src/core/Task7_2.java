package core;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task7_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество строк");
		int n = scanner.nextInt();
		String[] strings = new String[n];
		for (int i = 0; i < strings.length; i++) {
			System.out.println("Введите строку");
			strings[i] = scanner.next();
		}

		Arrays.sort(strings, Comparator.comparingInt(String::length));
		System.out.println("строки в порядке возрастания: " + Arrays.toString(strings));

		Arrays.sort(strings, Comparator.comparingInt(String::length).reversed());
		System.out.println("строки в порядке убывания: " + Arrays.toString(strings));
	}
}