package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GettingMultipleSetsOfDataFromExcelFile {
	public static void main(String[] args) throws  IOException {
		String filePath="./resources/multipleTestData.xlsx";
		String sheetName="TC001";
		
		FileInputStream excelFile=new FileInputStream(filePath);
		Workbook wb=WorkbookFactory.create(excelFile);
		
		Sheet sheet=wb.getSheet(sheetName);
		Row row1=sheet.getRow(1);
		String user1=row1.getCell(0).getStringCellValue();
		String pwd1=row1.getCell(1).getStringCellValue();
		System.out.println(user1);
		System.out.println(pwd1);
		System.out.println("===========");
		Row row2=sheet.getRow(2);
		String user2=row2.getCell(0).getStringCellValue();
		String pwd2=row2.getCell(1).getStringCellValue();
		System.out.println(user2);
		System.out.println(pwd2);
		System.out.println("===========");
		
		Row row3=sheet.getRow(3);
		String user3=row3.getCell(0).getStringCellValue();
		String pwd3=row3.getCell(1).getStringCellValue();
		System.out.println(user3);
		System.out.println(pwd3);
		System.out.println("===========");
		
		Row row4=sheet.getRow(4);
		String user4=row4.getCell(0).getStringCellValue();
		String pwd4=row4.getCell(1).getStringCellValue();
		System.out.println(user4);
		System.out.println(pwd4);
	
	}

}
