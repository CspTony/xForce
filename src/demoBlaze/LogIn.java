package demoBlaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn extends PageTemplate {
	
	private String logInXpath = "//*[@id=\"login2\"]";
	private String logPopTitXpath = "//*[@id=\"logInModalLabel\"]";
	private String userXpath = "//*[@id=\"loginusername\"]";
	private String passwordXpath = "//*[@id=\"loginpassword\"]";
	private String logInBXpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]";
	private String LoggedInXpath = "//*[@id=\"nameofuser\"]";
	//*[@id="nameofuser"]
	public LogIn(WebDriver driver) {
		super(driver);
		this.driver.get("https://www.demoblaze.com/");//Url
	}
	
	public void logginIn(String username, String password){
		WebElement logButton = this.driver.findElement(By.xpath(logInXpath));
		logButton.click();
		WebDriverWait wait = new WebDriverWait(this.driver, 10);
		WebElement title = this.driver.findElement(By.xpath(logPopTitXpath));
		wait.until(ExpectedConditions.visibilityOf(title));
		WebElement userField =  this.driver.findElement(By.xpath(userXpath));
		userField.sendKeys(username);
		WebElement passwordField = this.driver.findElement(By.xpath(passwordXpath));
		passwordField.sendKeys(password);
		WebElement signUpButton = this.driver.findElement(By.xpath(logInBXpath));
		signUpButton.click();
	}
	
	public String loggedIn() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(this.driver, 5);
		WebElement loggedUsername = this.driver.findElement(By.xpath(LoggedInXpath));
		wait.until(ExpectedConditions.visibilityOf(loggedUsername));
		String nameOfUsername = loggedUsername.getText();
		System.out.println(nameOfUsername);
		return nameOfUsername;
	}
	
}
