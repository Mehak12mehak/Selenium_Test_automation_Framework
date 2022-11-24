package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_With_Parallel_Execution {
	
	@Test(invocationCount = 3,threadPoolSize=3)
	public void paralleldemo()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.close();
		
	}

}
