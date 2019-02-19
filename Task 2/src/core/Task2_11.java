package core;

import java.util.Scanner;

public class Task2_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scanner.nextInt();
		double[] mas = new double[size];
		double[] mas2 = new double[size];

		int i = 0;
		while (i < size) {
			mas[i] = (int) (Math.random() * 10);
			System.out.println("mas[" + i + "]= " + mas[i]);
			i++;
		}

		for (i = 0; i < size; i++) {
			if (i == 0) {
				mas2[i] = (mas[i] + mas[i + 1]) / 2;
			} else if (i == size - 1) {
				mas2[i] = (mas[i - 1] + mas[i]) / 2;
			} else {
				mas2[i] = (mas[i - 1] + mas[i + 1]) / 2;
			}
		}
		for (i = 0; i < size; i++) {
			System.out.println("Updated massive: " + "mas[" + i + "]= " + mas2[i]);
		}
	}
}