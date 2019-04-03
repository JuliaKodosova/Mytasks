package pvt.task21_;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;


public class AppTest {
private WebDriver driver;
private App app;
private Wait wait;

@Before
public void before() {
	String exePath = "/Users/yuliyakodasava/Downloads/chromedriver";
	System.setProperty("webdriver.chrome.driver", exePath);
	driver = new ChromeDriver();
	app = new App(driver);
}

@Test
public void test() throws InterruptedException {
	driver.get("https://www.google.com/");
	driver.get("https://www.booking.com/");
	app.clickSearchField("Москва");
	app.clickSearchButton();
	app.clickStartDate();
	app.clickSearchPerDate();
	Assert.assertFalse(app.getListOfHotels().isEmpty());
	app.clickDropdownWithAllOptions();
	app.clickTopRated();
	app.clickTopHotel();
	app.getRating();
	Assert.assertTrue(app.getRating() >= 9);
	driver.quit();
}
}