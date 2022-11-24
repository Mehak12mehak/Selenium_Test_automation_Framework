package testng_basics;

import org.testng.annotations.Test;

public class HelpMethods_demowebshop {
	
	@Test(dependsOnMethods="Register")
	public void login() 
	{
		System.out.println("Executing login Tc");
	}
	@Test(dependsOnMethods="login")
	
	public void search()
	{
		System.out.println("Executing search Tc");
	}
	
	@Test
	public void Register()
	{
		System.out.println("Executing Register Tc");
	}
	
	@Test(dependsOnMethods="Wishlist")
	public void logout()
	{
		System.out.println("Executing logout Tc");
	}
	
	@Test(dependsOnMethods= {"search","Register"})
	public void Wishlist()
	{
		System.out.println("Executing Wishlist Tc");
	}

}
