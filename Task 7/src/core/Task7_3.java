package core;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task7_3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество строк");
		int numberOfStrings = scanner.nextInt();

		String[] arrOfStrings = new String[numberOfStrings];
		for (int i = 0; i < arrOfStrings.length; i++) {
			System.out.println("Введите строку");
			arrOfStrings[i] = scanner.next();
		}

		int sumOfAllStringsLengths = 0;
		for (int i = 0; i < arrOfStrings.length; i++) {
			sumOfAllStringsLengths = sumOfAllStringsLengths + arrOfStrings[i].length();
		}
		int averageLength = sumOfAllStringsLengths / numberOfStrings;
		System.out.println("Average length: " + averageLength);

		for (int i = 0; i < arrOfStrings.length; i++) {
			if (arrOfStrings[i].length() < averageLength) {
				System.out.println(arrOfStrings[i] + " " + arrOfStrings[i].length());
			}
		}
		System.out.println("------");

		List<String> list = Arrays.asList(arrOfStrings).stream().filter(name -> name.length() > averageLength)
				.collect(Collectors.toList());
		for (String s : list) {
			System.out.println(s + " " + s.length());
		}

	}
}