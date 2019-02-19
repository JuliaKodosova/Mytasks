package core2;

public class Massive {
	public void printMassiveAsLine(int[] anyMas) {
		for (int i = 0; i < anyMas.length; i++) {
			System.out.print("[" + anyMas[i] + "];");
		}
		System.out.println();
	}

	// int[] anyMas;

	public void printReverseMassiveAsLine(int[] anyMas) {
		for (int i = anyMas.length - 1; i >= 0; i--) {
			System.out.print("[" + anyMas[i] + "];");
		}
		System.out.println();
	}

	public int getSumOfElements(int[] anyMas) {
		int sum = 0;
		for (int i = 0; i < anyMas.length; i++) {
			sum = sum + anyMas[i];
		}

		return (sum);

	}

	public int[] multiplyBy3(int[] anyMas) {
		System.out.println();
		for (int i = 0; i < anyMas.length; i++) {
			anyMas[i] = anyMas[i] * 3;
		}

		return anyMas;

	}

}
