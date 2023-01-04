package ExcelUtils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilCls {
	static XSSFWorkbook workbook ;
	static XSSFSheet sheet ;
	public ExcelUtilCls(String excelPath,String sheetName) throws IOException
	{
		  workbook = new XSSFWorkbook(excelPath);
		  sheet = workbook.getSheet(sheetName);
	}

	public void getCellData(int rowNum, int colNum) 
	{	
		DataFormatter formatter = new DataFormatter();
		Object value = 	formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
		System.out.println(value);
	}
	public void getRowCount() 
	{
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Rows count:" + rowCount);
	}
}
