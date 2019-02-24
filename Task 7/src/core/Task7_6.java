package core;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task7_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество слов");
		int numberOfWords = scanner.nextInt();

		String[] arrOfWords = new String[numberOfWords];
		for (int i = 0; i < arrOfWords.length; i++) {
			System.out.println("Введите слово");
			arrOfWords[i] = scanner.next();

		}

		List<String> list = Arrays.asList(arrOfWords).stream().filter(word -> checkSequence(word))
				.collect(Collectors.toList());

		if (list.size() > 0) {
			System.out.println("word=" + list.get(0));
		} else {
			System.out.println("no words");
		}
	}

	public static boolean checkSequence(String x) {
		System.out.println("word=" + x);
		char[] array = x.toCharArray();
		int y = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + array[i] + "]=" + (int) array[i]);
			if (array[i] > y) {
				y = array[i];
			} else {
				System.out.println("result=false");
				return false;
			}
		}
		System.out.println("result=true");
		return true;
	}

}
