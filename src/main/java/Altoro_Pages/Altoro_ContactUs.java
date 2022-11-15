package Altoro_Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Altoro_ContactUs extends Altoro_BaseClass {
	
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
	
	@FindBy (xpath = "//a[text()=\"Transfer Funds\"]")
	public WebElement fundtransfer;
	
	@FindBy (xpath = "(//select[@id=\"toAccount\"]/option)[2]")
	public WebElement trandfertoAcc;
	
	@FindBy (xpath = "//input[@name=\"transferAmount\"]")
	public WebElement money;
	
	@FindBy (xpath = "//input[@id=\"transfer\"]")
	public WebElement transfermoneybutton;
	
	@FindBy (xpath ="//a[contains(text(),\"View Recent Transactions\")]")
	public WebElement ViewRT;
	
	@FindBy (xpath = "//a[@id=\"HyperLink3\"]")
	public WebElement Contactus;
	
	@FindBy (xpath = "//a[contains(text(),\"online form\")]")
	public WebElement onlineform;
	
	@FindBy (xpath = "//input[@name=\"name\"]")
	public WebElement yourname;
	
	@FindBy (xpath = "//input[@name=\"email_addr\"]")
	public WebElement yourmail;
	
	@FindBy (xpath = "//input[@name=\"subject\"]")
	public WebElement yoursub;
	
	@FindBy (xpath = "//textarea[@name=\"comments\"]")
	public WebElement yourcomment;
	
	@FindBy (xpath = "//input[@value=\" Submit \"]")
	public WebElement submitbutton;

	@FindBy (xpath = "//font[contains(text(),\"Sign Off\")]")
	public WebElement singoffbutton;
	
	

	public Altoro_ContactUs() throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}
	public boolean ContactAltoro() {
		singinbutton.click();
		UN.sendKeys(props.getProperty("validusername"));
		PS.sendKeys(props.getProperty("validpassword"));
		LoginButton.click();
		myacc.click();
		VMACC.click();
		listacc.click();
		GoButton.click();
		fundtransfer.click();
		trandfertoAcc.click();
		money.sendKeys("9876");
		transfermoneybutton.click();
		ViewRT.click();
		Contactus.click();
		onlineform.click();
		yourname.sendKeys("John Wilson");
		yourmail.sendKeys("johnwilson3323@outlook.com");
		yoursub.sendKeys("Account Statement");
		yourcomment.sendKeys("Your banking service is good");
		submitbutton.click();
		singoffbutton.click();
		
		return Contactus.isDisplayed();
	}

}
