
public class Task3_1 {

	public static void main(String[] args) {

		int result = FindMinNumber(20, 3);
		System.out.println(result);

	}

	public static int FindMinNumber(int a, int b) {
		/*
		 * if(a<b) { return(a); } else { return(b); }
		 */
		return a < b ? a : b;
	}

}
