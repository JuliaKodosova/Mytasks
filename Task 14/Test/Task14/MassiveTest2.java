package Task14;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MassiveTest2 {

	@Before
	public void before() {
		System.out.println("@Before");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@After
	public void after() {
		System.out.println("@After");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("@AfterClass");
	}

	@Test(expected = ArithmeticException.class)
	public void testException() {
		Massive books = new Massive();
		books.devideBy(0);
	}

}
