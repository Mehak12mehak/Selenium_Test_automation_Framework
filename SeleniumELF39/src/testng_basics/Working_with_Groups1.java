package testng_basics;

import org.testng.annotations.Test;

public class Working_with_Groups1 {

	@Test(groups = "smoke Testing")
	public void login() 
	{
		System.out.println("Executing login Tc");
	}
	@Test(groups ="smoke Testing")
	public void search()
	{
		System.out.println("Executing search Tc");
	}
	 
	@Test(groups="smoke Testing")
	public void Register()
	{
		System.out.println("Executing Register Tc");
	}
}
