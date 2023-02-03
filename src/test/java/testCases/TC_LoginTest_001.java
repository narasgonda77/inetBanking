package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() {
		LoginPage lp = new LoginPage(driver);
		driver.get("baseUrl");
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		if (driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}
}
