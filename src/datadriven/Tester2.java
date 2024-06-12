package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class Tester2 extends BasicSettings{
	public static void main(String[] args) throws IOException {
		String filePath="./resources/testData.xlsx";
		String sheetName="TC001";
		
		FileInputStream excelFile=new FileInputStream(filePath);
		Workbook wb=WorkbookFactory.create(excelFile);
		
		Sheet sheet=wb.getSheet(sheetName);
		Row row1=sheet.getRow(1);
		String appURL=row1.getCell(0).getStringCellValue();
		String uNameData=row1.getCell(1).getStringCellValue();
		String pwdData=row1.getCell(2).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(appURL);
		
		driver.findElement(By.id("username")).sendKeys(uNameData);
		driver.findElement(By.name("pwd")).sendKeys(pwdData);
		driver.findElement(By.id("loginButton")).click();
		
		
		
	}

}
