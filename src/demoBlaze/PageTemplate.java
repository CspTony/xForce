package demoBlaze;

import org.openqa.selenium.WebDriver;

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


}
