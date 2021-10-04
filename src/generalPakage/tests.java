package generalPakage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import demoBlaze.*;
import data.ExcelData;

public class tests {
	
	protected WebDriver driver = new ChromeDriver();
	protected ExcelData excel = new ExcelData();
	protected String respuesta;
	
  @Test(priority=10)
  public void SignUp() throws IOException {
	  String username = excel.username(0);
	  String password = excel.password(0);
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	  SignUp sign = new SignUp(driver);
	  sign.signingUp(username, password);
	  respuesta = sign.textAlert();
	  Assert.assertEquals(respuesta, sign.textoAlertSignUpCorrect);
	  
  }
  //aqui va el test 2
  @Test(priority = 20)
  public void LogIn() throws IOException, InterruptedException {
	  String username = excel.username(0);
	  String password = excel.password(0);
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	  LogIn logIn = new LogIn(driver);
	  logIn.logginIn(username, password);
	  Assert.assertEquals(logIn.loggedIn(), "Welcome " + username);
  }
  
  @Test(priority=30)
  public void Buy3atSame() throws IOException {
	  
	  Buy sign = new Buy(driver);
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	  respuesta = sign.Buy3atSame();
	  Assert.assertEquals(respuesta, sign.AcceptanceText);
  }
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
