package core;

import java.util.Scanner;

public class Task2_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scanner.nextInt();
		double[] mas = new double[size];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 10);
			System.out.println(mas[i]);
		}
		int result = 1;
		for (int i = 0; i < mas.length; i++) {
			result = (int) (result * mas[i]);
		}
		System.out.println(result);
	}
}
