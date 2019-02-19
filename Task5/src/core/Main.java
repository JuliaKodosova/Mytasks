package core;

public class Main {
	public static void main(String[] args) {
		Tester tester1 = new Tester("Julia", "Kodosova", 7, "advanced", 23);
		System.out.println(tester1.printInfo());
		tester1.printInfo(tester1.getSalary());
		tester1.printInfo(tester1.getName(), tester1.getSurname());
		tester1.printInfo(tester1.getExpirienceInYears(), tester1.getEnglishLevel(), tester1.getSalary());
		Tester.printSmth();

		System.out.println(RegularExp.test("abcd"));
		System.out.print(RegularExp.test2("124"));

	}
}