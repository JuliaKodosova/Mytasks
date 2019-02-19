package core;

import java.util.Scanner;

public class Task2_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scanner.nextInt();
		int[] mas = new int[size];
		int i = 0;
		while (i < size) {
			mas[i] = (int) (Math.random() * 10);
			System.out.println("mas[" + i + "]= " + mas[i]);
			i++;
		}
		boolean z = false;
		for (int b = 0; b < size - 1; b++) {
			if (mas[b + 1] > mas[b]) {
				z = true;
			} else {
				z = false;
				break;
			}
		}
		if (z) {
			System.out.println("Возрастающая последовательность");
		} else {
			System.out.println("Не возрастающая последовательность");
		}
	}
}
