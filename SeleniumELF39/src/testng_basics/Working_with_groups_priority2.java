package testng_basics;

import org.testng.annotations.Test;

public class Working_with_groups_priority2 {
	
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
	
	@Test(groups = "smoke Testing",priority=4)
	
	public void Advancesearch()
	{
		System.out.println("Executing Advancesearch Tc");
	}


}
