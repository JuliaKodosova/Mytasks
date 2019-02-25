package core2;

import core.Tester;

public class Main {

	public static void main(String[] args) {
		Tester tester = new Tester("Julia", "Kodosova", 8, "advanced", 123.0);

		// System.out.print(tester.multiplyBy2()); - невозможно,private метод доступен
		// только в своем классе
		// System.out.println(tester.experience()); - невозможно, friendly метод
		// доступен только внутри пакета
		// tester.printName();- невозможно, protected доступен только наследникам и в своем пакете
		// tester.setSalary(13); - невозможно,friendly метод доступен только внутри пакета
		tester.printAllInfo();

	}

}
