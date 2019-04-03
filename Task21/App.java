package pvt.task21_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App 
{
	@FindBy(xpath = "//input[@type='search']")
	WebElement searchField;
	@FindBy(xpath = "//button[@data-sb-id='main']")
	WebElement searchButton;
	@FindBy(xpath = "//td[@data-id='1556755200000']")
	WebElement startDate;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchPerDate;
	@FindBy(xpath = "//img[@class='hotel_image']")
	List<WebElement> list;
	@FindBy(xpath = "//button[@id='sortbar_dropdown_button']")
	WebElement dropdownWithAllOptions;
	@FindBy(xpath = "//a[@data-category='bayesian_review_score']")
	WebElement topRated;
	@FindBy(xpath = "//a[@class='hotel_name_link url']")
	List<WebElement> listOfTopHotels;
	@FindBy(xpath = "//div[@class='bui-review-score__badge']")
	List<WebElement> ratingList;

	private WebDriver driver;
	private WebDriverWait wait;

	public App(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}

	public void clickSearchField(String city) {
		searchField.sendKeys(city);
	}

	public void clickSearchButton() {
		searchButton.click();
	}

	public void clickStartDate() {
		startDate.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
	}

	public void clickSearchPerDate() {
		searchPerDate.click();
	}

	public void clickDropdownWithAllOptions() {
		dropdownWithAllOptions.click();
	}

	public void clickTopRated() throws InterruptedException {
		topRated.click();
		Thread.sleep(3000);
		
	}

	public void clickTopHotel() {
		WebElement TopHotel = listOfTopHotels.get(0);
		TopHotel.click();
	}

	public double getRating() {
		WebElement TopHotelRating = ratingList.get(0);
		double a = (Double.valueOf(TopHotelRating.getText()));
		return a;
	}
    public List<WebElement> getListOfHotels() {
    	return list;
    }
}


