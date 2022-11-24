package POM_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import Framework_utlity.Utility_Methods;
import POM_pages.DWS_Computerpage;
import POM_pages.DWS_Homepage_Register;

public class DWS_ComputerTest extends Base_Test{
	
@Test
public void Computer()
{
	DWS_Homepage_Register hp=new DWS_Homepage_Register(driver);
	hp.Click_computer();
	
	DWS_Computerpage cp=new DWS_Computerpage(driver);
	cp.Click_computer();
}
	

}
