package core;

public class Sirius extends Star {
	private int diameter;
	private int attraction;

	public void printDiameter() {
		System.out.println(this.diameter);
	}

	public void printAttraction() {
		System.out.println(this.attraction);
	}

	int getDiameter() {
		return diameter;
	}

	void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	int getAttraction() {
		return attraction;
	}

	void setAttraction(int attraction) {
		this.attraction = attraction;
	}

	@Override
	public void printSize() {
		System.out.println("Size of Sirius" + getSize());
	}

	@Override
	public void printAge() {
		System.out.println("Age of Sirius" + getAge());
	}

}