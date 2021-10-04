package demoBlaze;

import data.*;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buy extends PageTemplate {
	
	private ExcelData ed = new ExcelData();
	
	private String SamsungGalaxy6Xpath;
	private String addToCartXpath = "//a[text()='Add to cart']";
	private String CartXpath = "//a[text()='Cart']";
	private String PlaceOrderXpath = "//button[@class='btn btn-success']";
	private String NameInputXpath = "//label[text()='Name:']/following-sibling::input";
	private String CountryInputXpath = "//label[text()='Country:']/following-sibling::input";
	private String CityInputXpath = "//label[text()='City:']/following-sibling::input";
	private String CreditCardInputXpath = "//label[text()='Credit card:']/following-sibling::input";
	private String MothInputXpath = "//label[text()='Month:']/following-sibling::input";
	private String YearInputXpath = "//label[text()='Year:']/following-sibling::input";
	private String buttonPurchaseXpath = "//button[text()='Purchase']";
	private String AcceptanceTextXpath = "//div[@class='sa-icon sa-success animate']/following-sibling::h2";
	public String AcceptanceText = "Thank you for your purchase!";
	
	public Buy(WebDriver driver) throws IOException{	
		super(driver);
		SamsungGalaxy6Xpath =  "//a[text()='"+ed.article_name(1)+"']";
		this.driver.get("https://www.demoblaze.com/");
	}
	
	public String Buy3atSame(){
		String returnText;
		WebElement samsungLink = this.driver.findElement(By.xpath(SamsungGalaxy6Xpath));
		WebDriverWait wait = new WebDriverWait(this.driver, 5);
		wait.until(ExpectedConditions.visibilityOf(samsungLink));
		samsungLink.click(); 
		WebElement addToCart = this.driver.findElement(By.xpath(addToCartXpath));
		wait.until(ExpectedConditions.visibilityOf(addToCart));
		addToCart.click(); 
		acceptAlert();
		WebElement addToCartStep2 = this.driver.findElement(By.xpath(addToCartXpath));
		wait.until(ExpectedConditions.visibilityOf(addToCartStep2));
		addToCartStep2.click(); 
		acceptAlert();
		WebElement addToCartStep3 = this.driver.findElement(By.xpath(addToCartXpath));
		wait.until(ExpectedConditions.visibilityOf(addToCartStep3));
		addToCartStep3.click(); 
		acceptAlert();
		WebElement goToCart = this.driver.findElement(By.xpath(CartXpath));
		wait.until(ExpectedConditions.visibilityOf(goToCart));
		goToCart.click(); 
		WebElement placePrder = this.driver.findElement(By.xpath(PlaceOrderXpath));
		wait.until(ExpectedConditions.visibilityOf(placePrder));
		placePrder.click(); 
		WebElement nameInput = this.driver.findElement(By.xpath(NameInputXpath));
		wait.until(ExpectedConditions.visibilityOf(nameInput));
		nameInput.sendKeys("Luis Fernando Diaz");
		WebElement countryInput = this.driver.findElement(By.xpath(CountryInputXpath));
		wait.until(ExpectedConditions.visibilityOf(countryInput));
		countryInput.sendKeys("Mexico");
		WebElement CityInput = this.driver.findElement(By.xpath(CityInputXpath));
		wait.until(ExpectedConditions.visibilityOf(CityInput));
		CityInput.sendKeys("Aguascalientes");
		WebElement CreditCardInput = this.driver.findElement(By.xpath(CreditCardInputXpath));
		wait.until(ExpectedConditions.visibilityOf(CreditCardInput));
		CreditCardInput.sendKeys("4573123447582745");
		WebElement MonthCardInput = this.driver.findElement(By.xpath(MothInputXpath));
		wait.until(ExpectedConditions.visibilityOf(MonthCardInput));
		MonthCardInput.sendKeys("12");
		WebElement YearCardInput = this.driver.findElement(By.xpath(YearInputXpath));
		wait.until(ExpectedConditions.visibilityOf(YearCardInput));
		YearCardInput.sendKeys("2024");
		WebElement buttonPurchase = this.driver.findElement(By.xpath(buttonPurchaseXpath));
		wait.until(ExpectedConditions.visibilityOf(buttonPurchase));
		buttonPurchase.click();
		try {
			WebElement AcceptanceText = this.driver.findElement(By.xpath(AcceptanceTextXpath));
			returnText = AcceptanceText.getText();
		}catch(Exception ex) {
			returnText = "N/A";
		}
		return returnText;
	}
}
