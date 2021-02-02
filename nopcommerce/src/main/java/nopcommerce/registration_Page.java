package nopcommerce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registration_Page {
	WebDriver driver;

	public registration_Page(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement Registartion_Button() {
		return (driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")));
	}

	public WebElement Gender(String value) {
		return (driver.findElement(By.xpath("(//input[@type=\"radio\"])[" + value + "]")));
	}

	public WebElement Enter_FirstName() {
		return (driver.findElement(By.id("FirstName")));
	}

	public WebElement Enter_LastName() {
		return (driver.findElement(By.id("LastName")));
	}

	public WebElement Enter_Day() {
		return (driver.findElement(By.name("DateOfBirthDay")));
	}

	public WebElement Enter_Month() {
		return (driver.findElement(By.name("DateOfBirthMonth")));
	}

	public WebElement Enter_Year() {
		return (driver.findElement(By.name("DateOfBirthYear")));
	}

	public WebElement Enter_Email() {
		return (driver.findElement(By.id("Email")));
	}

	public WebElement Enter_password() {
		return (driver.findElement(By.id("Password")));
	}

	public WebElement Confirm_password() {
		return (driver.findElement(By.id("ConfirmPassword")));
	}

	public WebElement Submit_Registration() {
		return (driver.findElement(By.id("register-button")));
	}

	public List<WebElement> Email_exists() {
		return (driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/ul/li")));
	}

	public List<WebElement> Complete_Register() {
		return (driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div/form/div/div[2]/div[1]")));
	}
}
