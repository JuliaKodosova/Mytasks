package core;

import java.util.Scanner;

public class Task2_8 {

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
		int max = mas[0];

		for (i = 0; i < size; i++) {
			if (mas[i] > max) {
				max = mas[i];
				
			}
		}
		System.out.println("Максимальный элемент: " + max);
		int min = mas[0];
		for (i = 0; i < size; i++) {
			if (mas[i] < min) {
				min = mas[i];
				
			}
		}
		System.out.println("Минимальный элемент: " + min);
	}
}
