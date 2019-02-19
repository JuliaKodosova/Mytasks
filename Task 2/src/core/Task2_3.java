package core;

import java.util.Scanner;

public class Task2_3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scanner.nextInt();
		System.out.println("--------Исходный массив--------");
		int[] mas = new int[size];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 10);
			System.out.println("mas[" + i + "]=" + mas[i]);
		}
		System.out.println("--------1 способ--------");
		for (int i = 2; i < mas.length; i += 3) {
			mas[i] = mas[i] * 2;
		}
		printMas(mas);
		System.out.println("--------2 способ--------");
		for (int i = 2; i <= mas.length; i++) {
			if (i % 3 == 0) {
				mas[i - 1] = mas[i - 1] * 2;
			}
		}
		printMas(mas);
		System.out.println("--------3 способ--------");
		int i = 2;
		while (i < mas.length) {
			mas[i] = mas[i] * 2;
			i += 3;
		}
		printMas(mas);
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.println("mas[" + i + "]=" + mas[i]);
		}
	}
}
