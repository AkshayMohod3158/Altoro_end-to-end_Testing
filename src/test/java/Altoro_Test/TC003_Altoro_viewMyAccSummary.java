package Altoro_Test;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Altoro_Pages.Altoro_BaseClass;
import Altoro_Pages.Altoro_ViewMYAccSummary;

public class TC003_Altoro_viewMyAccSummary extends Altoro_BaseClass {

	Altoro_ViewMYAccSummary AltoroAcc;
	
	public TC003_Altoro_viewMyAccSummary() throws IOException {
		super();
	}
	@BeforeMethod
	public void setup() throws IOException {
		Altoro_BaseClass.initialization();
		AltoroAcc = new Altoro_ViewMYAccSummary();
	}
	@Test(priority = 1)
	public void ValidateMyAccSummary() {
		String viewmyacc = AltoroAcc.ValidateMyAccSummary(System.getProperty("validusername"), System.getProperty("validpassword"));
		String deposite = AltoroAcc.bal.getText();
		String depositebal = "$777.00";
		Assert.assertEquals(depositebal, deposite);
		System.out.println("Validated Deposite Balance :" + depositebal);
	}
	
    @AfterMethod
    public void Teardown() {
    	driver.quit();
    }
	
}
