package core;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7_5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество слов");
		int numberOfWords = scanner.nextInt();

		String[] arrOfWords = new String[numberOfWords];
		for (int i = 0; i < arrOfWords.length; i++) {
			System.out.println("Введите слово");
			arrOfWords[i] = scanner.next();
		}

		int sumOfWords = 0;
		int sumOfWords2 = 0;
		for (int a = 0; a < arrOfWords.length; a++) {
			if (Pattern.matches(("[A-Za-z]+"), arrOfWords[a])) {
				sumOfWords++;
				if (arrOfWords[a].replaceAll("[aeiouy]", "").length() == arrOfWords[a].replaceAll("[^aeiouy]", "").length()) {
					sumOfWords2++;
				}
			}
		}
		System.out.println("Количество слов,содержащих только символы латинского алфавита" + " " + sumOfWords);
		System.out.println("Количество слов с равным числом гласных и согласных букв." + " " + sumOfWords2);
	}
}
