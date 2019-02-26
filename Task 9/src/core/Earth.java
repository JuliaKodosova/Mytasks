package core;

public class Earth extends Planet {
	int numberOfPeople;
	String colour;

	public int multiplyNumberOfPeopleBy2() {
		return this.numberOfPeople * 2;
	}

	public void printColour() {
		System.out.println(this.colour);
	}

	@Override
	public void printSize() {
		System.out.println("Size of Earth " + getSize());
	}

	@Override
	public void printAge() {
		System.out.println("Age of Earth " + getAge());
	}

}
