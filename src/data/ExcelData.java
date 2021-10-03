package data;



import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelData {
	
	public String username(int i) throws IOException {
		
		String username = this.readData(i, 0, 0);
	
		return username;
	}
	
	public String password(int i) throws IOException {
		
		String password = this.readData(i, 1, 0);
		
		return password;
	}
	
	public String readData(int row, int column, int exsheet) throws IOException{
		FileInputStream fs = new FileInputStream("datos de prueba.xlsx");
		//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(exsheet);
		String value = sheet.getRow(row).getCell(column).getStringCellValue();
		
		workbook.close();
		return value;
	}

}
