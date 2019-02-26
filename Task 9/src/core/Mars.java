package core;

public class Mars extends Planet {
	private int temperature;
	private int numberOfSputniks;

	public void printTemperature() {
		System.out.println(this.temperature);
	}

	public void printNumberOfSputniks() {
		System.out.println(this.numberOfSputniks);
	}

	// перегруженные, связанные друг с другом конструкторы
	
	public Mars(int temperature) {
		this.temperature = temperature;
	}

	public Mars(int temperature, int numberOfSputniks) {
		this(temperature);
		this.numberOfSputniks = numberOfSputniks;
	}

	@Override
	public void printSize() {
		System.out.println("Size if Mars " + getSize());
	}

	public void printAge() {
		System.out.println("Age of Mars " + getAge());
	}

}
