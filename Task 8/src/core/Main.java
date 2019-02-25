package core;

public class Main {

	public static void main(String[] args) {
		Tester tester = new Tester("Julia", "Kodosova", 8, "advanced", 123.0);

		// System.out.print(tester.multiplyBy2()); - невозможно,private метод доступе только в своем классе
		System.out.println(tester.experience());
		tester.printName();
		tester.printAllInfo();
		tester.setSalary(13);
		System.out.println(tester.getSalary());
		//то же самое будет для остальных геттеров и сеттеров

	}
}
