package data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelData {
	
	/*User Function
	 *  Obtains the test username data
	 *  @idUser (int) = user index in the excel sheet
	 * */
	public String username(int idUser) throws IOException {
		
		String username = this.readData(idUser, 0, 0);
	
		return username;
	}
	
	/*User Function
	 *  Obtains the test password data
	 *  @idUser (int) = password index in the excel sheet
	 * */
	public String password(int idUser) throws IOException {
		
		String password = this.readData(idUser, 1, 0);
		
		return password;
	}
	
	/*User Functions
	 *  Obtains the test user data
	 *  @idUser (int) = complete name index in the excel sheet
	 * */
	public String userCompleteName(int idUser) throws IOException {
		
		String usertCompleteName = this.readData(idUser, 2, 0);
		
		return usertCompleteName;
	}
	
	/*User Functions
	 *  Obtains the test user data
	 *  @idUser (int) = country index in the excel sheet
	 * */
	public String userCountry(int idUser) throws IOException {
		
		String userCountry = this.readData(idUser, 3, 0);
		
		return userCountry;
	}
	
	/*User Functions
	 *  Obtains the test user data
	 *  @idUser (int) = city index in the excel sheet
	 * */
	public String userCity(int idUser) throws IOException {
		
		String userCity = this.readData(idUser, 4, 0);
		
		return userCity;
	}
	
	/*User Functions
	 *  Obtains the test user data
	 *  @idUser (int) = CardNumber index in the excel sheet
	 * */
	public String userCardNumber(int idUser) throws IOException {
		
		String userCardNumber = this.readData(idUser, 5, 0);
		
		return userCardNumber;
	}
	
	/*User Functions
	 *  Obtains the test user data
	 *  @idUser (int) = card Month index in the excel sheet
	 * */
	public String userCardMonth(int idUser) throws IOException {
		
		String userCardMonth = this.readData(idUser, 6, 0);
		
		return userCardMonth;
	}
	
	/*User Functions
	 *  Obtains the test user data
	 *  @idUser (int) = Card year index in the excel sheet
	 * */
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
	 * Returns the String value of the cell
	 * */
	
	public String readData(int row, int column, int exsheet) throws IOException{
		FileInputStream fs = new FileInputStream("TestData.xlsx");
		//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(exsheet);
		String value = sheet.getRow(row).getCell(column).getStringCellValue();
		workbook.close();
		
		return value;
	}

}
