package core2;

public class Massive {

	int[] books;
	String bookName;
	int bookSize;
	int bookLength;

	public void method1() {
		int[] books = new int[4];
		try {

			System.out.println(books[5]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Вы вышли за пределы массива");
		}
	}

	public void method2() {
		try {
			System.out.println(books.length);
			System.out.println(this.bookSize / 0);
		} catch (NullPointerException ex) {
			System.out.println("Массив не определен,нельзя узнать длину");
		} catch (ArithmeticException ex) {
			System.out.println("Нельзя делить на 0");
		}

	}

	public void method3() {

		try {
			System.out.println(books.length);

			System.out.println(this.bookSize / 0);
		} catch (NullPointerException | ArithmeticException ex) {
			System.out.println("Массив не определен,нельзя узнать длину");
			System.out.println("Нельзя делить на 0");
		}
	}

	public void method4() {
		int[] books = new int[4];
		try {
			System.out.println(books[1] / 0);
		} catch (ArithmeticException ex) {
			System.out.println("Нельзя делить на 0");
		} finally {
			System.out.println("Делите на нормальное число");
		}
	}

}
