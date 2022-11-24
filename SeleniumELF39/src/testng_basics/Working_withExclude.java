package testng_basics;

import org.testng.annotations.Test;

public class Working_withExclude {
	@Test
	public void login() 
	{
		System.out.println("Executing login Tc");
	}
	@Test
	public void search()
	{
		System.out.println("Executing search Tc");
	}
	 
	@Test
	public void Register()
	{
		System.out.println("Executing Register Tc");
	}
	
	@Test
	public void logout()
	{
		System.out.println("Executing logout Tc");
	}
	
	@Test
	public void Wishlist()
	{
		System.out.println("Executing Wishlist Tc");
	}


}
