
public class Task3_2 {
	public static void main(String[] args) {
		int x = (int) (Math.random() * 10);
		System.out.println(x);
		boolean result = CheckNumber(x);
		System.out.println(result);
	}

	public static boolean CheckNumber(int anyNumber) {
		return anyNumber % 2 == 0 ? true : false;

	}
}
