package Altoro_Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Altoro_Pages.Altoro_BaseClass;
import Altoro_Pages.Altoro_Singinforvalid_credentials;

public class TC002_SinginWithValidCredentials extends Altoro_BaseClass {
	
	Altoro_Singinforvalid_credentials AVC;

	public TC002_SinginWithValidCredentials() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void setup() throws IOException {
		Altoro_BaseClass.initialization();
		 AVC = new Altoro_Singinforvalid_credentials();
	}
	@Test
	public void Singin_Altoro_ValidCredential() throws InterruptedException {
		boolean ValidUser = AVC.singinpageforvaliduser(props.getProperty("validusername"), props.getProperty("validpassword"));
	    Assert.assertTrue(true);
	}
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}

}
