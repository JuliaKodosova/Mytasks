package core;


	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;

	public class Massive {

		public int[] books = { 1, 2, 3, 4, 5 };
		String bookName;

		public int[] reversedMassive() {
			int[] newBooks = new int[books.length];
			for (int i = 0, j = newBooks.length - 1; i < books.length; i++, j--) {
				newBooks[j] = books[i];
			}
			return newBooks;
		}

		public int[] returnMassiveAsLine() {
			for (int i = 0; i < books.length; i++) {
				System.out.print("[" + books[i] + "];");
			}
			return books;
		}

		public int[] multiplyBy2() {
			for (int i = 0; i < books.length; i++) {
				books[i] = books[i] * 2;
			}
			return books;
		}

		public int getSumOfElements() {
			int sum = 0;
			for (int i = 0; i < books.length; i++) {
				sum = sum + books[i];
			}
			return sum;
		}

		public int[] devideBy(int y) throws ArithmeticException {
			for (int i = 0; i < books.length; i++) {
				System.out.println(books[i] / y);
			}
			return books;
		}

		public int[] minus1() {
			int[] result = new int[books.length];
			for (int i = 0; i < books.length; i++) {
				result[i] = books[i] - 1;
				System.out.println(result[i]);
			}
			return result;
		}

		public int[] plus2() {
			int[] result = new int[books.length];
			for (int i = 0; i < books.length; i++) {
				result[i] = books[i] + 2;
				System.out.println(result[i]);
			}
			return result;
		}

		public int getDifferenceOfElements() {
			int difference = 0;
			for (int i = 0; i < books.length; i++) {
				difference = difference - books[i];
			}
			return difference;
		}

		public int changeOneElement() {
			int result;
			result = books[2] + 2;
			return result;
		}

		public int multiplyOneElement() {
			int result;
			result = books[3] * 2;
			return result;
		}

	}

