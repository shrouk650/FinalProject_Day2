package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	WebDriver driver;

	public Login_Page(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement Login_Button() {
		return (driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")));
	}

	public WebElement Enter_Username() {
		return (driver.findElement(By.id("Email")));
	}

	public WebElement Enter_Password() {
		return (driver.findElement(By.id("Password")));
	}
	
	public WebElement Submit_Login() {
		return (driver.findElement(By.id("//input[@class=\"button-1 login-button\"]")));
	}
}
