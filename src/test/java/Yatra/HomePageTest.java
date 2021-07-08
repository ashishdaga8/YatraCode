package Yatra;

import java.io.IOException;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandHomePage;
import resources.base;

public class HomePageTest extends base {

	@BeforeTest
	public void openBrowser() throws IOException {
		driver = initalizeDriver();
		
	}

	@Test(dataProvider="getData")
	public void wanderHomePage(String from, String to) throws InterruptedException {

		driver.get(prop.getProperty("Url"));
		driver.manage().window().maximize();
		LandHomePage lp = new LandHomePage(driver);
		lp.roundtrip().click();
		lp.departFrom().click();
		Thread.sleep(2000L);
		lp.departFrom().sendKeys(from);
		Thread.sleep(2000L);
		lp.departFrom().sendKeys(Keys.ENTER);
		Thread.sleep(2000L);
		lp.arrivalFrom().sendKeys(to);
		Thread.sleep(2000L);
		lp.arrivalFrom().sendKeys(Keys.ENTER);
		lp.searchBtn().click();
//		String actual=driver.findElement(By.xpath("//p[normalize-space()='VAK']")).getText();
//		Assert.assertEquals("VAK",actual );
//		Assert.assertFalse((actual.equalsIgnoreCase("VAR")));
		

	}
	
	@DataProvider
	public Object[][] getData() {
		Object [][] data = new Object [2][2];
		data[0][0]= "Chevak";
		data[0][1]= "Mumbai";
		
		data[1][0]= "Goa";
		data[1][1]= "Kolkata";
		
		return data;
	}

}
