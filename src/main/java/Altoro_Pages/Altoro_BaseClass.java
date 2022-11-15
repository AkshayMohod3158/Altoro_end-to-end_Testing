package Altoro_Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

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
	
	
/*	public String[][] getData(Method m) throws EncryptedDocumentException, IOException {
		
		String excelSheetName = m.getName();
		File File = new File("C:\\Users\\amoho\\eclipse-workspace\\Altoro_Assignment\\Excel.data\\Altoro.xlsx");
		FileInputStream FIS = new FileInputStream(File);
		Workbook wb = WorkbookFactory.create(FIS);
		Sheet sheetname  = wb.getSheet(excelSheetName);
		
		int totalrows = sheetname.getLastRowNum();
		Row rowcell = sheetname.getRow(0);
		int totalcell = rowcell.getLastCellNum();
		
		DataFormatter formet = new DataFormatter();
		
		String testData[][] = new String [totalrows][totalcell];
		for (int i=1; i<=totalrows; i++) {
			for(int j=0; j<totalcell; j++) {
				testData[i-1][j] = formet.formatCellValue(sheetname.getRow(i).getCell(j));
				
			}
		}
		return testData;
	}
}
*/
}