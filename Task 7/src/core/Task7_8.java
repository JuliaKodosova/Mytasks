package core;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task7_8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество слов");
		int numberOfWords = scanner.nextInt();

		String[] arrOfWords = new String[numberOfWords];
		for (int i = 0; i < arrOfWords.length; i++) {
			System.out.println("Введите слово");
			arrOfWords[i] = scanner.next();

		}

		List<String> list = Arrays.asList(arrOfWords).stream().filter(word -> word.matches("[0-9]+"))
				.filter(word -> isPalendrom(word)).collect(Collectors.toList());

		if (list.size() > 0) {
			System.out.println("слово-палиндром: " + list.get(0));
		} else {
			System.out.println("no words");
		}
	}

	public static boolean isPalendrom(String word) {
		if (word.equals(new StringBuilder(word).reverse().toString())) {
			return true;
		} else {
			return false;
		}

	}

}
