package ExcelUtils;

public class ExcelUtilsTestMain {

	public static void main(String[] args) 
	{
		try 
		{
		String excelPath = "./data/TestData.xlsx";
		String sheetName = "Sheet1";	
		ExcelUtilCls excel = new ExcelUtilCls(excelPath, sheetName);
		excel.getRowCount();
		excel.getCellData(1,0);
		excel.getCellData(1,1);
		excel.getCellData(1,2);
		}
		catch(Exception exp)
		{
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
		}
	}
}
