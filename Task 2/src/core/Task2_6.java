package core;

import java.util.Scanner;

public class Task2_6 {
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
		for (int b = 0; b < size; b += 2) {
			int a = mas[b];
			mas[b] = mas[b + 1];
			mas[b + 1] = a;
		}
		for (i = 0; i < size; i++) {
			System.out.println("Updated massive: " + "mas[" + i + "]= " + mas[i]);
		}
	}

}
