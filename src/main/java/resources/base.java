package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class base {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initalizeDriver() throws IOException {
		 prop = new Properties();
		 FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"/src/main/java/resources/data.properties");
		 prop.load(fis);
		String browsername=prop.getProperty("browser");
		System.out.println(browsername);
		System.out.println(System.getProperty("user.dir"));
		
		if(browsername.equalsIgnoreCase("Chrome")) {
			ChromeOptions c = new ChromeOptions();
			c.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
			//C:\\Users\\jaina\\eclipse-workspace\\Yatra\\src\\main\\java\\resources\\data.properties			
			driver = new ChromeDriver(c);	
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	} 
}
