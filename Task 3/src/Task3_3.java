
public class Task3_3 {
	public static void main(String[] args) {
		int x = (int) (Math.random() * 10);
		System.out.println(x);
		int result = Quarter(x);
		System.out.println(result);
	}

	public static int Quarter(int y) {
		int res = y * y;
		return (res);

	}
}
