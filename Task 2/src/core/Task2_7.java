package core;

import java.util.Scanner;

public class Task2_7 {
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
		for (int b = 0; b < size / 2; b++) {
			int a = mas[b];
			mas[b] = mas[size - 1 - b];
			mas[size - 1 - b] = a;
		}
		for (int c = 0; c < size; c++) {
			System.out.println("Updated massive: " + "mas[" + c + "]= " + mas[c]);
		}
	}
}