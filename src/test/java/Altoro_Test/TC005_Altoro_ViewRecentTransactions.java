package Altoro_Test;

import java.io.IOException;

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
	
	@Test
	public void recenttransactions() {
		boolean recenttransactions = altoroviewrecnettran.ViewTransactionsHistory(System.getProperty("validusername"), System.getProperty("validpassword"));
		
	}
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
}
