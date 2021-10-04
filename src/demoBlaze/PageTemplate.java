package demoBlaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageTemplate {

	protected WebDriver driver;
	
	public PageTemplate(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public void goBack() {
		this.driver.navigate().back();
	}
	
	public String textAlert() {
		String textoAlert = new String();
		WebDriverWait wait = new WebDriverWait(this.driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		textoAlert = this.driver.switchTo().alert().getText();
		this.driver.switchTo().alert().accept();
		return textoAlert;
		
	}
	public void acceptAlert() {
		WebDriverWait wait = new WebDriverWait(this.driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		this.driver.switchTo().alert().accept();
	}
	
}
