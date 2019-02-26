package core;

public class Star extends Galactic {

	private int radiance;
	private String shape;

	public void printRadiance() {
		System.out.println(this.radiance);
	}

	public void printShape() {
		System.out.println(this.shape);
	}

	public Star() {

	}
// перегруженные, но не связанные друг с другом конструкторы
	
	public Star(int radiance) {
		this.radiance = radiance;
	}

	public Star(int radiance, String shape) {
		this.radiance = radiance;
		this.shape = shape;
	}

	@Override
	public void printSize() {
		System.out.println("Size if Sirius" + getSize());
	}

	@Override
	public void printAge() {
		System.out.println("Age of Sirius" + getAge());
	}
}
