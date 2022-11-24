package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test_case4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(driver.findElement(By.linkText("Register")).getText());

	}

}
