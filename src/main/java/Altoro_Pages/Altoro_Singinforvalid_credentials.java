package Altoro_Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Altoro_Singinforvalid_credentials extends Altoro_BaseClass{
	

	@FindBy(xpath ="//font[contains(text(),\"Sign In\")]")
	public WebElement singinbutton;
	
	@FindBy (xpath = "//input[@id=\"uid\"]")
	public WebElement UN;
	
	@FindBy (xpath = "//input[@id=\"passw\"]")
	public WebElement PS;
	
	@FindBy (xpath = "//input[@value=\"Login\"]")
	public WebElement LoginButton;
	
	@FindBy(xpath = "//a[@id=\"AccountLink\"]")
	public WebElement myacc;
	
	@FindBy (xpath = "//h1[contains(text(),\"Hello Admin User\")]")
	public WebElement User_msg;

	public Altoro_Singinforvalid_credentials() throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}
	public boolean singinpageforvaliduser(String username, String password) throws InterruptedException{
		singinbutton.click();
		UN.sendKeys(props.getProperty("validusername"));
		PS.sendKeys(props.getProperty("validpassword"));
		LoginButton.click();
		
		
		return myacc.isDisplayed();
	}
	
	
}
