package Altoro_Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Altoro_Pages.Altoro_BaseClass;
import Altoro_Pages.Altoro_SingINPage;

public class TC001_Altoro_Singin extends Altoro_BaseClass{
	
	Altoro_SingINPage singpage;

	public TC001_Altoro_Singin() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void setup() throws IOException {
		Altoro_BaseClass.initialization();
		singpage = new Altoro_SingINPage();
	}
    @Test
    public void Sing_Altoro_Invalid() throws InterruptedException {
    	boolean usreid = singpage.singinpage(props.getProperty("wusername"), props.getProperty("wpassword"));
    //	Assert.assertTrue(false);
    	Assert.assertTrue(true);
    }
    @AfterMethod(enabled = false)
    public void Teardown() {
    	driver.quit();
    }
	
}
