import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import Pages.Book_room;
import Pages.Mail;

public class Task20 {

	private WebDriver driver;
	private Mail mail;
	private Wait wait;

	@Before
	public void before() {
		String exePath = "/Users/yuliyakodasava/Downloads/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		mail = new Mail(driver);
	}

	@Test
//перемещение в спам
	public void test1() {

		driver.get("https://www.mail.ru");
		mail.enterLoginAndPassword("justfortesting99", "Hohoho123");
		mail.ckickEnterButton();
		mail.composeEmail();
		mail.sendTo("test@test.com", "justfortesting99@mail.ru");
		mail.enterText("Hello");
		mail.sendEmail();
		mail.openMail();
		mail.selectEmail();
		mail.moveToSpam();
		Assert.assertTrue(mail.IsConfirmationMessagePresent());
	}

//извлечение из спама
	@Test
	public void test2() {
		driver.get("https://www.mail.ru");
		mail.enterLoginAndPassword("justfortesting99", "Hohoho123");
		mail.ckickEnterButton();
		mail.composeEmail();
		mail.sendTo("test@test.com", "justfortesting99@mail.ru");
		mail.enterText("Hello");
		mail.sendEmail();
		mail.openMail();
		mail.selectEmail();
		mail.moveToSpam();
		mail.openSpamFolder();
		mail.selectEmail2();
		mail.moveToNotSpam();
		Assert.assertTrue(mail.IsConfirmationMessagePresent());
	}

	// отправка группе пользователей

	@Test
	public void test3() {
		driver.get("https://www.mail.ru");
		mail.enterLoginAndPassword("justfortesting99", "Hohoho123");
		mail.ckickEnterButton();
		mail.composeEmail();
		mail.sendTo("test@test.com", "justfortesting99@mail.ru");
		mail.enterText("Hello");
		mail.sendEmail();
		String messageInfo = "test@test.com, justfortesting99@mail.ru";
		Assert.assertTrue(messageInfo.contains("test@test.com, justfortesting99@mail.ru"));
	}

	// пометить три письма флажками

	@Test
	public void test4() {
		driver.get("https://www.mail.ru");
		mail.enterLoginAndPassword("justfortesting99", "Hohoho123");
		mail.ckickEnterButton();
		mail.clickCheckbox();
		mail.openMoreDropdown();
		mail.markWithFlag();
		Assert.assertTrue(mail.IsFlagPresent());
	}
	// снять отметку флажка со всех писем

	@Test
	public void test5() {
		driver.get("https://www.mail.ru");
		mail.enterLoginAndPassword("justfortesting99", "Hohoho123");
		mail.ckickEnterButton();
		mail.clickCheckbox();
		mail.openMoreDropdown();
		mail.markWithFlag();
		mail.IsFlagPresent();
		mail.openMoreDropdown();
		mail.unMarkWithFlag();
		Assert.assertFalse(mail.IsFlagPresent());

	}
}
