package Altoro_Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Altoro_Pages.Altoro_BaseClass;
import Altoro_Pages.Altoro_ViewRecentTransactions;

public class TC005_Altoro_ViewRecentTransactions extends Altoro_BaseClass{
	
	Altoro_ViewRecentTransactions altoroviewrecnettran;

	public TC005_Altoro_ViewRecentTransactions() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void setup() throws IOException {
		Altoro_BaseClass.initialization();
		altoroviewrecnettran = new Altoro_ViewRecentTransactions();
	}
	
	@Test (priority = 1)
	public void recenttransactions() {
		boolean recenttransactions = altoroviewrecnettran.ViewTransactionsHistory(System.getProperty("validusername"), System.getProperty("validpassword"));
		String act_deposite = altoroviewrecnettran.depositeamount.getText();
		String exp_deposite = "$9876.00";
		Assert.assertEquals(act_deposite, exp_deposite);
		System.out.println("Validated Deposite Amount : " + act_deposite+" , "+exp_deposite);

		String act_withdraw = altoroviewrecnettran.withdrawamount.getText();
		String exp_withdraw = "-$9876.00";
		Assert.assertEquals(act_withdraw, exp_withdraw);
		System.out.println("Validated Withdraw Amount : " + act_withdraw+" , "+exp_withdraw);
	}
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
}
