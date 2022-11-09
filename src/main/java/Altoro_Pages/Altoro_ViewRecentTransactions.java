package Altoro_Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Altoro_ViewRecentTransactions extends Altoro_BaseClass{

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
	
	
	public Altoro_ViewRecentTransactions() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	public  boolean ViewTransactionsHistory(String validusername, String validpassword) {
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
		
		return ViewRT.isDisplayed();
	}

}
