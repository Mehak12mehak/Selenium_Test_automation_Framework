package testng_basics;

import org.testng.annotations.Test;

public class Priority_HelperMethod {

	@Test(priority=2)
	public void login() 
	{
		System.out.println("Executing login Tc");
	}
	@Test(priority=3)
	
	public void search()
	{
		System.out.println("Executing search Tc");
	}
	
	@Test(priority=1)
	public void Register()
	{
		System.out.println("Executing Register Tc");
	}
	
	@Test(priority=5)
	public void logout()
	{
		System.out.println("Executing logout Tc");
	}
	
	@Test(priority=4)
	public void Wishlist()
	{
		System.out.println("Executing Wishlist Tc");
	}

}


