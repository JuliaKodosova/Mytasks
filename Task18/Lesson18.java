import static org.junit.Assert.*;

import java.util.List;
import java.util.Optional;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson18 {

	@org.junit.Test
	public void test() throws InterruptedException {
		String exePath = "/Users/yuliyakodasava/Downloads/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.booking.com/");
		WebElement searchField=driver.findElement(By.xpath("//input[@type='search']"));
		searchField.sendKeys("Москва");
		WebElement search=driver.findElement(By.xpath("//button[@data-sb-id='main']"));
		search.click();
		WebElement startDate=driver.findElement(By.xpath("//td[@data-id='1553126400000']"));
		startDate.click();
		WebElement searchPerDates=driver.findElement(By.xpath("//button[@class='sb-searchbox__button  ']"));
		searchPerDates.click();
		List<WebElement> list=driver.findElements(By.xpath("//img[@class='hotel_image']"));
		Assert.assertFalse(list.isEmpty());
		WebElement dropdownWithAllOptions=driver.findElement(By.xpath("//button[@id='sortbar_dropdown_button']"));
		dropdownWithAllOptions.click();
		WebElement topRated=driver.findElement(By.xpath("//a[@data-category='bayesian_review_score']"));
		topRated.click();
		Thread.sleep(5000);
		List <WebElement> listOfTopHotels=driver.findElements(By.xpath("//a[@class='hotel_name_link url']"));
		WebElement TopHotel= listOfTopHotels.get(0);
		TopHotel.click();
		List <WebElement> ratingList=driver.findElements(By.xpath("//div[@class='bui-review-score__badge']"));
		Thread.sleep(3000);
		WebElement TopHotelRating=ratingList.get(0);
		Thread.sleep(3000);
		double a=(Double.valueOf(TopHotelRating.getText()));
		Assert.assertTrue(a>=9);
		Thread.sleep(3000);
		driver.quit();
	}

}
