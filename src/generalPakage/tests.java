package generalPakage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import demoBlaze.*;

public class tests {
	
	protected WebDriver driver = new ChromeDriver();
	
  @Test
  public void f() {
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	  SignUp sign = new SignUp(driver);
	  sign.signingUp("Javier002", "asdf#$%1");
	  sign.acceptAlert();
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
