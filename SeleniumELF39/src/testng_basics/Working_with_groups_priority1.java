package testng_basics;

import org.testng.annotations.Test;

public class Working_with_groups_priority1 {
	
	@Test(groups = "smoke Testing",priority=2)
	public void login() 
	{
		System.out.println("Executing login Tc");
	}
	@Test(groups ="smoke Testing",priority=3)
	public void search()
	{
		System.out.println("Executing search Tc");
	}
	 
	@Test(groups="smoke Testing",priority=1)
	public void Register()
	{
		System.out.println("Executing Register Tc");
	}

}
