package Altoro_Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Altoro_BaseClass {

	public static WebDriver driver;
	public static Properties props;
	
	public Altoro_BaseClass() throws IOException {
    props = new Properties();
		
    FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Altoro_properties\\Configu.Properties");
    props.load(file);
	
	}
	@SuppressWarnings("deprecation")
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Browsers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Altoro_Utility.IMPLICIT_WAIT, TimeUnit.SECONDS); // methods from OrangeHRM_TestUtility
		driver.manage().timeouts().pageLoadTimeout(Altoro_Utility.PAGELOAD_WAIT, TimeUnit.SECONDS); // methods from OrangeHRM_TestUtility
		
		driver.get(props.getProperty("url"));
	}
}
