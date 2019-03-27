import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Pages.Book_room;
import Pages.LoginPage;

public class Task19_1 {

	private WebDriver driver;
	private Book_room bookRoom;

	@Before
	public void before() {
		String exePath = "/Users/yuliyakodasava/Downloads/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		bookRoom = new Book_room(driver);
	}

	@Test

	public void test2() throws InterruptedException {

		driver.get("https://www.booking.com/");
		WebElement searchField = driver.findElement(By.xpath("//input[@type='search']"));
		searchField.sendKeys("Paris");
		WebElement search = driver.findElement(By.xpath("//button[@data-sb-id='main']"));
		search.click();
		WebElement startDate = driver.findElement(By.xpath("//td[@data-id='1553904000000']"));
		startDate.click();
		WebElement endDatePlaceholder = driver
				.findElement(By.xpath("//*[@id=\"frm\"]/div[3]/div/div[1]/div[2]/div/div/div[1]/div/div[2]"));
		endDatePlaceholder.click();
		WebElement endDate = driver.findElement(By.xpath("(//td[@data-id='1554422400000'])[2]"));
		endDate.click();
		WebElement adults = driver.findElement(By.xpath("//select[@name='group_adults']"));
		Select adultsDropdown = new Select(adults);
		adultsDropdown.selectByVisibleText("2 adults");
		WebElement search2 = driver.findElement(By.xpath("//button[@data-sb-id='main']"));

		search2.click();
		bookRoom.openHotelPage();

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		bookRoom.selectNumberOfRooms();

		bookRoom.clickReserveButton();
		bookRoom.enterData("Julia", "j@j.com", "j@j.com");
		bookRoom.clickFinalDetailsButton();
		bookRoom.enterAddress("ffff", "dfdfdf", "Belarus", "dddd");
		bookRoom.selectPayment();
		bookRoom.enterPayInfo("1234", "134");
		bookRoom.isErrorDisplayed();
		
	}
}
