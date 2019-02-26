package core;

public class Sun extends Star {
	private String classification;
	private int density;

	public void printClassification() {
		System.out.println(this.classification);
	}

	public void printDensity() {
		System.out.println(this.density);
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
