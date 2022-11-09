package Altoro_Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Altoro_Pages.Altoro_BaseClass;
import Altoro_Pages.Altoro_TransferFund;

public class TC004_Altoro_TransferFromAccounts extends Altoro_BaseClass{

	Altoro_TransferFund AFTA;
	public TC004_Altoro_TransferFromAccounts() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException {
		Altoro_BaseClass.initialization();
		AFTA = new Altoro_TransferFund();
	}
	@Test
	public void ValidateMyAccSummary(){
		String viewmyacc = AFTA.ValidateMyAccSummary(System.getProperty("validusername"), System.getProperty("validpassword"));
	  
	}
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
}
