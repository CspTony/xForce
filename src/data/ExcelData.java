package data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelData {
	/*User Functions
	 *  Obtains the test user data
	 *  @idUser (int) = user index in the excel sheet
	 * */
	public String username(int idUser) throws IOException {
		
		String username = this.readData(idUser, 0, 0);
	
		return username;
	}
	
	public String password(int idUser) throws IOException {
		
		String password = this.readData(idUser, 1, 0);
		
		return password;
	}
	
	public String userCompleteName(int idUser) throws IOException {
		
		String usertCompleteName = this.readData(idUser, 2, 0);
		
		return usertCompleteName;
	}
	
	public String userCountry(int idUser) throws IOException {
		
		String userCountry = this.readData(idUser, 3, 0);
		
		return userCountry;
	}
	
	public String userCity(int idUser) throws IOException {
		
		String userCity = this.readData(idUser, 4, 0);
		
		return userCity;
	}
	public String userCardNumber(int idUser) throws IOException {
		
		String userCardNumber = this.readData(idUser, 5, 0);
		
		return userCardNumber;
	}
	public String userCardMonth(int idUser) throws IOException {
		
		String userCardMonth = this.readData(idUser, 6, 0);
		
		return userCardMonth;
	}
	
	public String userCardYear(int idUser) throws IOException {
		
		String userCardYear = this.readData(idUser, 7, 0);
		
		return userCardYear;
	}
	/*
	 * Product functions
	 * @idProduct (int) = product index in the excel sheet
	 * */
	public String article_name(int idProduct) throws IOException{
		
		String articulo = this.readData(idProduct, 2, 1);
		
		return articulo;
	}
	
	/*
	 * Obtains info stored un excel sheet
	 * */
	
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
