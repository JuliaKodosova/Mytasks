package core;

import java.util.Scanner;

public class Task2_1 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.println("Введите размер массива");
		int size = scanner.nextInt();
		double[] mas = new double[size];

		for (int i = 0; i < mas.length; i++) {
			System.out.println("Введите " + i + " элемент массива");
			mas[i] = scanner.nextDouble();
		}

		System.out.println("Все элементы массива в прямом порядке:");
		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}

		System.out.println("Все элементы массива в обратном порядке:");
		for (int i = mas.length - 1; i >= 0; i--) {
			System.out.println(mas[i]);
		}
	}
}
