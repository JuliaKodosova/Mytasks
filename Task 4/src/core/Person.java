package core;

public class Person {
	String name;
	String surname;
	int age;
	int phone;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getPhone() {
		return this.phone;
	}

	public void printAllInformation() {
		System.out.println(getName() + " " + getSurname() + " " + getAge() + " " + getPhone());
	}

	public void printName() {
		System.out.println(getName() + " " + getSurname());
	}

	public boolean isAdult() {
		if (getAge() > 18) {
			return true;
		} else {
			return false;
		}
	}
}
