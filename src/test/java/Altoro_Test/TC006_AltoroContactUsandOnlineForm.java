package Altoro_Test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Altoro_Pages.Altoro_BaseClass;
import Altoro_Pages.Altoro_ContactUs;

public class TC006_AltoroContactUsandOnlineForm extends Altoro_BaseClass{
	
	Altoro_ContactUs contactusonlineform;

	public TC006_AltoroContactUsandOnlineForm() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void setup() throws IOException {
		Altoro_BaseClass.initialization();
		contactusonlineform = new Altoro_ContactUs();
	}
	@Test
	public void onlineformandcontactus() {
		@SuppressWarnings("unused")
		boolean filltheform = contactusonlineform.ContactAltoro();
	}
	
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}

}
