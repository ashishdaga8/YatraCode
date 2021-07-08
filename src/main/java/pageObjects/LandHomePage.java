package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandHomePage {

	
	public WebDriver driver;
	
	public By roundtrip= By.xpath("//a[@title='Round Trip']");
	public By depart=By.xpath("//input[@id='BE_flight_origin_city']");
	public By arrival=By.cssSelector("#BE_flight_arrival_city");
	public By search=By.id("BE_flight_flsearch_btn");
	
	
	public LandHomePage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public WebElement roundtrip() {
		return driver.findElement(roundtrip);
	}
	
	public WebElement departFrom() {
		return driver.findElement(depart); 
	}
	
	public WebElement arrivalFrom() {
		return driver.findElement(arrival);	 
	}
	
	public WebElement searchBtn() {
		return driver.findElement(search);	 
	}
	
}
