package pvt.task22;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppSteps {
	private WebDriver driver;
	private App app;
	private Wait wait;
	private String url = "https://www.booking.com/";
	private String city = "Москва";

	public AppSteps() {
		String exePath = "/Users/yuliyakodasava/Downloads/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);

	}

	@When("^I select dates$")
	public void selectDates() {
		app.clickStartDate();
		app.clickSearchPerDate();
	}

	@Then("I see the correct hotels")
	public void seeHotels() {
		Assert.assertFalse(app.getListOfHotels().isEmpty());
	}

	@When("^I open dropdown with different options$")
	public void openDropdown() throws InterruptedException {

		app.clickDropdownWithAllOptions();
	}

	@And("^I select Top reviewed properties$")
	public void selectTopReviewedOption() throws InterruptedException {
		app.clickTopRated();
	}

	@And("^I click on the top hotel$")
	public void clickOnTopHotel() {
		app.clickTopHotel();
	}

	@Then("^I see that rating is >=9$")
	public void checkRating() {
		app.getRating();
		Assert.assertTrue(app.getRating() >= 9);
	}

	@After
	public void afterClass() {
		driver.quit();
	}

	@Before
	public void beforeTest() {
		driver = new ChromeDriver();
		app = new App(driver);
		driver.get(url);
		app.clickSearchField(city);
		app.clickSearchButton();
	}

}
