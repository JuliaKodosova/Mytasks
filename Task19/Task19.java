
import static org.junit.Assert.*;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Pages.Book_room;
import Pages.LoginPage;

public class Task19 {
	@Ignore
	@Test
	public void test() throws InterruptedException {
		String exePath = "/Users/yuliyakodasava/Downloads/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com/");
		WebElement searchField = driver.findElement(By.xpath("//input[@type='search']"));
		searchField.sendKeys("Paris");
		WebElement search = driver.findElement(By.xpath("//button[@data-sb-id='main']"));
		search.click();
		WebElement startDate = driver.findElement(By.xpath("//td[@data-id='1553385600000']"));
		startDate.click();
		WebElement endDatePlaceholder = driver
				.findElement(By.xpath("//*[@id=\"frm\"]/div[3]/div/div[1]/div[2]/div/div/div[1]/div/div[2]"));
		endDatePlaceholder.click();
		WebElement endDate = driver.findElement(By.xpath("(//td[@data-id='1553990400000'])[2]"));

		Thread.sleep(3000);
		endDate.click();
		// Thread.sleep(3000);
		WebElement adults = driver.findElement(By.xpath("//select[@name='group_adults']"));
		Select adultsDropdown = new Select(adults);
		adultsDropdown.selectByVisibleText("2 adults");
		Thread.sleep(3000);
		WebElement search2 = driver.findElement(By.xpath("//button[@data-sb-id='main']"));
		search2.click();
		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//div[@class='bui-checkbox__label filter_item css-checkbox']"));
		checkboxes.get(0).click();
		Assert.assertFalse(checkboxes.isEmpty());
		WebElement dropdownWithAllOptions = driver.findElement(By.xpath("//button[@id='sortbar_dropdown_button']"));
		dropdownWithAllOptions.click();
		WebElement topRated = driver.findElement(By.xpath("//a[@data-category='bayesian_review_score']"));
		topRated.click();
		Thread.sleep(5000);
		WebElement priceList = driver.findElement(
				By.xpath("//*[@id=\"hotellist_inner\"]/div[2]/div[2]/div[2]/div/table/tbody/tr/td[2]/div/strong"));
		Thread.sleep(3000);
		String[] x = priceList.getText().split(" ", 2);
		String rest = x[1];
		rest = rest.replace(",", ".");
		float a = Float.parseFloat(rest);
		Assert.assertTrue(a < (110 * 7));
		Thread.sleep(3000);
		adultsDropdown.selectByVisibleText("4 adults");
		WebElement room = driver.findElement(By.xpath("//select[@name='no_rooms']"));
		Select roomDropdown = new Select(room);
		roomDropdown.selectByIndex(1);
		checkboxes.get(4).click();
		Thread.sleep(3000);
		WebElement lowPrice = driver.findElement(By.xpath("//a[@data-category='price']"));
		lowPrice.click();

		WebElement priceList2 = driver.findElement(
				By.xpath("//*[@id=\"hotellist_inner\"]/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/strong/b"));
		Thread.sleep(3000);
		String[] x2 = priceList2.getText().split(" ", 2);
		String rest2 = x[1];
		rest2 = rest2.replace(",", ".");

		float a2 = Float.parseFloat(rest2);
		Assert.assertTrue(a2 > (470 * 7));
		Thread.sleep(3000);
	}

	private WebDriver driver;
	private Book_room bookRoom;

	/*
	 * public void before() { String exePath =
	 * "/Users/yuliyakodasava/Downloads/chromedriver";
	 * System.setProperty("webdriver.chrome.driver", exePath); WebDriver driver =
	 * new ChromeDriver(); bookRoom=new Book_room(driver); }
	 */


}
