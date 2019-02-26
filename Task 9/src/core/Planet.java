package core;

public class Planet extends Galactic {
	private int weight;
	private String atmosphereForLive;

	public void printWeight() {
		System.out.println(this.weight);

	}

	public void printAtmosphereForLive() {
		System.out.println(this.atmosphereForLive);
	}

	@Override
	public void printSize() {
		System.out.println("Size of Planet " + getSize());
	}

	@Override
	public void printAge() {
		System.out.println("Age of Planet" + getAge());
	}
}
