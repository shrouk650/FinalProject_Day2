package Test_Cases;

import static org.testng.AssertJUnit.assertTrue;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import nopcommerce.registration_Page;
import static org.testng.Assert.assertTrue;
public class Registration extends TestBase {

	String complete_Register;
	String email_exsists;
	Select select;
	
	@Test(priority = 1)
	public void Login_button() throws InterruptedException {
		registration_Page button = new registration_Page(driver);
		button.Registartion_Button().click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		AssertJUnit.assertTrue(URL.contains("https://demo.nopcommerce.com/register?returnUrl=%2F"));

	}

	@Test(priority = 2)
	public void Vaild_Data() throws IOException, InterruptedException {
		
		registration_Page data = new registration_Page(driver);
		data.Gender(prop.get_property("Gender")).click();
		data.Enter_FirstName().sendKeys(prop.get_property("Firstname"));
		data.Enter_LastName().sendKeys(prop.get_property("Lastname"));
		
		select = new Select(data.Enter_Day());
		select.getOptions().get(new Random().nextInt(select.getOptions().size())).click();
		
		select = new Select(data.Enter_Month());
		select.getOptions().get(new Random().nextInt(select.getOptions().size())).click();

		select = new Select(data.Enter_Year());
		select.getOptions().get(new Random().nextInt(select.getOptions().size())).click();

		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		
		
		data.Enter_Email().sendKeys(prop.get_property("Email"));
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,600)");
		data.Enter_password().sendKeys(prop.get_property("Password"));
		data.Confirm_password().sendKeys(prop.get_property("Confirm_password"));
		Thread.sleep(2000);
		data.Submit_Registration().click();
		Thread.sleep(1000);

		if (!data.Email_exists().isEmpty()) {
			//email_exsists = ((WebElement) data.Email_exists()).getText();
			//System.out.println(email_exsists);
			//Assert.assertEquals(email_exsists, "The specified email already exists");
			assertTrue(data.Email_exists().get(0).isDisplayed(), "Email is already exist");
		}

		else if (!data.Complete_Register().isEmpty()) {
		//	complete_Register = ((WebElement) data.Complete_Register()).getText();
		//	System.out.println(complete_Register);
		//	Assert.assertEquals(complete_Register, "Your registration completed");
			assertTrue(data.Complete_Register().get(0).isDisplayed(), "Your registration completed");

		}

	}
}
