package core;

public class Tester {
	String name;
	String surname;
	int expirienceInYears;
	String englishLevel;
	int salary;

	public Tester(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Tester(String name, String surname, int expirienceInYears) {
		this(name, surname);
		this.expirienceInYears = expirienceInYears;
	}

	public Tester(String name, String surname, int expirienceInYears, String englishLevel, int salary) {
		this(name, surname, expirienceInYears);
		this.englishLevel = englishLevel;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getExpirienceInYears() {
		return expirienceInYears;
	}

	public String getEnglishLevel() {
		return englishLevel;
	}

	public int getSalary() {
		return salary;
	}

	public void printInfo(String name, String surname) {
		System.out.println("Name info: " + name + " and Surname info:" + surname);
	}

	public void printInfo(int expirienceInYears, String englishLevel, int salary) {
		System.out.println("Expirience in year info: " + expirienceInYears + " and English level info: " + englishLevel
				+ " and salary info:" + salary);
	}

	public void printInfo(int salary) {
		System.out.println("Salary info: " + salary);
	}

	public String printInfo() {
		return "All info about tester [name=" + name + ", surname=" + surname + ", expirienceInYears="
				+ expirienceInYears + ", englishLevel=" + englishLevel + ", salary=" + salary + "]";
	}

	public static void printSmth() {
		System.out.println("This is static method");
	}
}