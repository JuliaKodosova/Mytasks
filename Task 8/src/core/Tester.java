package core;

public class Tester {
	String name;
	private String surname;
	protected int expirienceInYears;
	public String englishLevel;
	double salary;

	private Tester(String name) {
		this.name = name;
	}

	protected Tester(String name, String surname, int expirienceInYears) {
		this(name);
		this.surname = surname;
		this.expirienceInYears = expirienceInYears;
	}

	public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
		this(name, surname, expirienceInYears);
		this.englishLevel = englishLevel;
		this.salary = salary;
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	String getSurname() {
		return surname;
	}

	void setSurname(String surname) {
		this.surname = surname;
	}

	int getExpirienceInYears() {
		return expirienceInYears;
	}

	void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}

	String getEnglishLevel() {
		return englishLevel;
	}

	void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	private double multiplyBy2() {
		return this.salary * 2;
	}

	int experience() {
		return this.expirienceInYears * 12;
	}

	protected void printName() {
		System.out.println(this.name + " " + this.surname);
	}

	public void printAllInfo() {
		System.out.println(name + " " + surname + " " + expirienceInYears + " " + englishLevel + " " + salary);
	}
}
