package Selenium_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://demowebshop.tricentis.com/");
		Driver.manage().window().maximize();
		Driver.navigate().forward();
		Driver.navigate().refresh();
		Driver.navigate().back();
		Driver.close();

	}

}
