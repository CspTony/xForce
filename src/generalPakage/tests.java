package generalPakage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import demoBlaze.*;
import data.ExcelData;

public class tests {
	
	protected WebDriver driver = new ChromeDriver();
	protected ExcelData excel = new ExcelData();
	protected String respuesta;
	
  @Test(priority=10)
  public void SignUp() throws IOException {
	
	
	  String username = excel.username(1);
	  String password = excel.password(1);
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
	  String username = excel.username(1);
	  String password = excel.password(1);
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	  LogIn logIn = new LogIn(driver);
	  logIn.logginIn(username, password);
	  Buy sign = new Buy(driver);
	  respuesta = sign.Buy3atSame(1);
	  Assert.assertEquals(respuesta, sign.AcceptanceText);
  }
  @Test(priority=40)
  public void Buy3DiferentWithLogin() throws IOException {
	  String username = excel.username(1);
	  String password = excel.password(1);
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	  LogIn logIn = new LogIn(driver);
	  logIn.logginIn(username, password);
	  Buy sign = new Buy(driver);
	  respuesta = sign.Buy3Diferent(1);
	  Assert.assertEquals(respuesta, sign.AcceptanceText);
  }
  @Test(priority=50)
  public void Buy3DiferentNoLogin() throws IOException {
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	  Buy sign = new Buy(driver);
	  respuesta = sign.Buy3Diferent(1);
	  Assert.assertNotEquals(respuesta, sign.AcceptanceText);
  }
  @Test(priority=60)
  public void Buy3AtSameNoLogin() throws IOException {
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	  Buy sign = new Buy(driver);
	  respuesta = sign.Buy3atSame(1);
	  Assert.assertNotEquals(respuesta, sign.AcceptanceText);
  }
  
  @BeforeTest
  public void beforeTest() {
	// Realizamos la apertura de la pestaña en modo incognito
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(capabilities);
  }

  @AfterTest
  public void afterTest() {
  }
  @AfterSuite
  public void afterSuite() {
	  driver.close();
	  driver.quit();
  }

}
