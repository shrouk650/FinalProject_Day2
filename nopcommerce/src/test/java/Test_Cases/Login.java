package Test_Cases;

import static org.testng.AssertJUnit.assertTrue;

import org.testng.annotations.Test;

import nopcommerce.Login_Page;


public class Login extends TestBase {
	
	@Test(priority = 1)
	public void Login_button() throws InterruptedException {
		Login_Page button = new Login_Page(driver);
		button.Login_Button().click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		assertTrue(URL.contains("https://demo.nopcommerce.com/login?returnUrl=%2F"));

	}

	@Test(priority = 2)
	public void valid_Uasername_password() {
		

	}
}
