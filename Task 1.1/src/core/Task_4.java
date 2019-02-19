package core;

public class Task_4 {
	public static void main(String[] args) {
		int a = 1;
		short b = 2;
		long c = 218L;
		double d = 3476676.67d;
		float e = 67.12f;
		char x = 'a';
		boolean y = true;
		int result1 = (int) a + b;
		double result2 = (double) c - d;
		double result3 = (double) e * d;
		boolean result4 = (double) c > d;
		boolean result5 = e < (float) a;
		boolean result6 = (int) a == b;
		boolean result7 = a != (int) x;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
	}
}
