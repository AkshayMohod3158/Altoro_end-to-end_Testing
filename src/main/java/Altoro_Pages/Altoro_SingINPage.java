package Altoro_Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Altoro_SingINPage extends Altoro_BaseClass{

	
	
	@FindBy(xpath ="//font[contains(text(),\"Sign In\")]")
	public WebElement singinbutton;
	
	@FindBy (xpath = "//input[@id=\"uid\"]")
	public WebElement UNW;
	
	@FindBy (xpath = "//input[@id=\"passw\"]")
	public WebElement PSW;
	
	@FindBy (xpath = "//input[@value=\"Login\"]")
	public WebElement LoginButton;
	
	public Altoro_SingINPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	public boolean singinpage(String wusername, String wpassword) throws InterruptedException{
		singinbutton.click();
		UNW.sendKeys(props.getProperty("wusername"));
		PSW.sendKeys(props.getProperty("wpassword"));
		LoginButton.click();
		
		return singinbutton.isDisplayed();
	}

}
