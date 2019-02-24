package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task7_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество слов");
		int numberOfWords = scanner.nextInt();

		String[] arrOfWords = new String[numberOfWords];
		for (int i = 0; i < arrOfWords.length; i++) {
			System.out.println("Введите слово");
			arrOfWords[i] = scanner.next();
		}

		List<String> uniques = new ArrayList();
		for (int i = 0; i < arrOfWords.length; i++) {
			String s = arrOfWords[i];
			if (isAllUnique(s)) {
				uniques.add(s);
			}
		}

		if (uniques.size() > 0) {
			System.out.println("Cлово, состоящее только из различных символов.: " + uniques.get(0));
		} else {
			System.out.println("no words");
		}

	}

	public static boolean isAllUnique(String text) {
		int allSymbols = text.length();
		int uniqueSymbols = text.chars().mapToObj(c -> String.valueOf((char) c)).distinct().collect(Collectors.toList())
				.size();
		return allSymbols == uniqueSymbols;
	}
}
