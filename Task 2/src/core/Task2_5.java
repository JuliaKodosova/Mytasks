package core;

import java.util.Scanner;

public class Task2_5 {

	public static void main(String[] args) {
		System.out.println("Enter size");

		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] mas = new int[size];

		for (int i = 0; i < size; i++) {
			mas[i] = (int) (Math.random() * 10);
			System.out.println("mas[" + i + "]=" + mas[i]);
		}

		int zeroCount = 0;
		for (int i = 0; i < size; i++) {
			if (mas[i] == 0) {
				zeroCount++;
				System.out.println("Номер нулевого элемента: " + i);
			}
		}
		if (zeroCount == 0) {
			System.out.println("no zero elements");
		}
	}
}