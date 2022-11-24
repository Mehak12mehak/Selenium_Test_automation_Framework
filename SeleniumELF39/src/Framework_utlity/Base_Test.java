package Framework_utlity;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Base_Test {
	
	 public WebDriver driver;
	
	@BeforeClass
	
	public void BrowserSetup() throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 driver= new ChromeDriver();
	 String url=Utility_Methods.Test_Configuration();
	 driver.get(url);
//driver.get("https://demowebshop.tricentis.com/");
	
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	
	@AfterClass
	
	public void Teardown()
	{
		driver.close();

	}



}
