package core;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Earth earth = new Earth();
		Mars mars = new Mars(110, 3);
		Planet planet = new Planet();
		Sirius sirius = new Sirius();
		Star star = new Star(1, "circle");
		Sun sun = new Sun();
		sirius.setDiameter(100);
		System.out.println("Sirius diameter: " + sirius.getDiameter());

		sirius.setAttraction(5);
		System.out.println("Sirius attraction: " + sirius.getAttraction());
		earth.setSize(100);
		earth.setAge(1000);

		earth.printSize();
		earth.printAge();

		mars.setSize(120);
		mars.setAge(1020);
		mars.printSize();
		mars.printAge();

		planet.setSize(140);
		planet.setAge(1040);
		planet.printSize();
		planet.printAge();

		star.setSize(160);
		star.setAge(1060);
		star.printSize();
		star.printAge();

		sun.setSize(180);
		sun.setAge(1080);
		sun.printSize();
		sun.printAge();

		sirius.setSize(200);
		sirius.setAge(2000);
		sirius.printSize();
		sirius.printAge();

	}

}
