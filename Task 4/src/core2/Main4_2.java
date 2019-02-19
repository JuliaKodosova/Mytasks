package core2;

public class Main4_2 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		Massive massive = new Massive();
		massive.printMassiveAsLine(array);
		massive.printReverseMassiveAsLine(array);
		System.out.println("Sum of the elements is: " + massive.getSumOfElements(array));
		massive.multiplyBy3(array);

		massive.printMassiveAsLine(array);
		massive.printReverseMassiveAsLine(array);
	}
}
