package datadriven;
//User class
public class UsingTheExcelLibraryMethod {
	public static void main(String[] args) {
		Object[][] objArr=ExcelLibrary.getExcelSheetData("./resources/multipleTestData.xlsx", "TC001");
		for(Object[]obj:objArr) // objArr[0], obj[1].... is all another array, so we call subarray obj
		{
			for(Object o:obj) // obj[0], obj[1]... is also an array so we call object no
			{
				System.out.print(o+" ");
			} 
			System.out.println();
		}
	
	}

}
