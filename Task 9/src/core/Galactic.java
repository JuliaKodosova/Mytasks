package core;

public abstract class Galactic {
	private int age;
	private int size;

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public abstract void printSize();

	public abstract void printAge();

}
