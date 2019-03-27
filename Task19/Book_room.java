package Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.By;

public class Book_room {
	@FindBy(xpath = "//a[@class='hotel_name_link url'][1]")
//	List<WebElement> listOfTopHotels;
	WebElement topHotel;

	@FindBy(xpath="//div[@class='hprt-reservation-cta']")
	WebElement reserveButton;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lastNameField;

	@FindBy(xpath = "//input[@id='email']")
	WebElement emailField;

	@FindBy(xpath = "//input[@id='email_confirm']")
	WebElement emailConfirmField;

	@FindBy(xpath = "//button[@name='book']")
	WebElement finalDetailsButton;

	@FindBy(xpath = "//input[@id='address1']")
	WebElement addressField;

	@FindBy(xpath = "//input[@id='city']")
	WebElement cityField;

	@FindBy(xpath = "//input[@id='cc1']")
	WebElement countryField;

	@FindBy(xpath = "//input[@id='phone']")
	WebElement phoneField;

	@FindBy(xpath = "//select[@id='cc_type']")
	WebElement cardTypeField;

	@FindBy(xpath = "//input[@id='cc_cvc']")
	WebElement cvcCodeField;

	@FindBy(xpath="//input[@id='pay-now']")
	WebElement howToPay;
	
	@FindBy(xpath="//input[@id='cc_number']")
	WebElement cardNumberField;
	
	@FindBy(id="hotel_header")
	WebElement hotelHeader;
	
	@FindBy(xpath="//select[@class='hprt-nos-select'][1]")
	WebElement selectRooms;
	
	private WebDriver driver;
	private WebDriverWait wait;

	public Book_room(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		wait = new WebDriverWait(driver, 10);
	}

	public void openHotelPage() {
		topHotel.click();
	}

	public void clickReserveButton() {
		
		reserveButton.click();
	}

	public void enterData(String lastName, String email, String emailConfirm) {
		lastNameField.sendKeys(lastName);
		emailField.sendKeys(email);
		emailConfirmField.sendKeys(emailConfirm);

	}

	public void clickFinalDetailsButton() {
		finalDetailsButton.click();
	}

	public void enterAddress(String address,String city, String country, String phoneNumber) {
		addressField.sendKeys(address);
		cityField.sendKeys(city);
		Select countryDropdown = new Select(countryField);
		countryDropdown.selectByValue(country);
		phoneField.sendKeys(phoneNumber);
	}

	public void enterPayInfo(String cardType, String cardNumber) {
		Select cardTypeDropdown = new Select(cardTypeField);
		cardTypeDropdown.selectByValue(cardType);
		cardNumberField.sendKeys(cardNumber);
	}
	
	public boolean isErrorDisplayed() {
		 return driver.findElements(By.id("bp_form_cc_number_msg")).size() != 0;
	}
	
	public void selectPayment() {
		
		howToPay.click();
	}
	
	public void selectNumberOfRooms(){
		Select selectRoomsDropdown=new Select (selectRooms);
		selectRoomsDropdown.selectByIndex(1);
		selectRooms.click();
	}
	
	
}