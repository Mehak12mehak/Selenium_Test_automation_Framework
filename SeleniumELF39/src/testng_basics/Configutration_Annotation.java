package testng_basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Configutration_Annotation {
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("executing be before class");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("executing be after test");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("executing before method");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("executing aftersuite");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("executing before test");
	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("executing before suite");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("executing after method");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("executing after class");
	}
	@Test
	public void  pet()
	{
		System.out.println("welcome to pet shop");
	}
	@Test
	public void  flowers()
	{
		System.out.println("welcome toflowers shop");
	}
	

}
