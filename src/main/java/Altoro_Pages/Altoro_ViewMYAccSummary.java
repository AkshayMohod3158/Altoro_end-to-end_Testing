package Altoro_Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Altoro_ViewMYAccSummary extends Altoro_BaseClass{

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
	
	@FindBy (xpath = "//a[text()=\"View Account Summary\"]")
	public WebElement VMACC;
	
	@FindBy (xpath = "(//select[@id=\"listAccounts\"]/option)[2]")
	public WebElement listacc;
	
	@FindBy (xpath = "//input[@id=\"btnGetAccount\"]")
	public WebElement GoButton;
	
	@FindBy (xpath = "(//td[@width=\"84\"])[1]")
	public WebElement bal;

	public Altoro_ViewMYAccSummary() throws IOException {
		PageFactory.initElements(driver, this);	
	}

	public String ValidateMyAccSummary(String validusername, String validpassword) {
		singinbutton.click();
		UN.sendKeys(props.getProperty("validusername"));
		PS.sendKeys(props.getProperty("validpassword"));
		LoginButton.click();
		myacc.click();
		VMACC.click();
		listacc.click();
		GoButton.click();
		return driver.getTitle();
	}
	public String Validated_Bal() {
		String availabel_Bal = bal.getText();
		return availabel_Bal;
	}
}
