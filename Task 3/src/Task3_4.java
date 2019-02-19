
public class Task3_4 {
public static void main ( String[] args) {
	int y=(int)(Math.random()*10);
	System.out.println(y);
	int result=Cube(y);
	System.out.println(result);
}
public static int Cube (int x) {
	int res=(int) Math.pow(x, 3);
	return(res);
}
}
