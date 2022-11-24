package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dunzo_testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dunzo.com/");
		driver.findElement(By.xpath("//p[@class='sc-AxhCb bHCIYd sc-1c1rgbd-0 hAcisp']")).click();
		driver.findElement(By.name("phone")).sendKeys("8310719067");
		//driver.findElement(By.xpath(""))
		

	}

}