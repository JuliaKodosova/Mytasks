package core;

import java.util.Scanner;

public class Task7_4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество слов");
		int numberOfWords = scanner.nextInt();

		String[] arrOfWords = new String[numberOfWords];
		for (int i = 0; i < arrOfWords.length; i++) {
			System.out.println("Введите слово");
			arrOfWords[i] = scanner.next();
		}

		int indexOfWord = 0;
		int wordCharacters = (int) arrOfWords[indexOfWord].chars().distinct().count();
		for (int i = 1; i < arrOfWords.length; i++) {
			int characters = (int) arrOfWords[i].chars().distinct().count();
			if (characters < wordCharacters) {
				wordCharacters = characters;
				indexOfWord = i;
			}
		}

		System.out.println("Слово " + arrOfWords[indexOfWord] + " число символов " + wordCharacters);

	}
}