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
	
  @Test
  public void SignUp() throws IOException {
	  String username = excel.username(1);
	  String password = excel.password(1);
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	  SignUp sign = new SignUp(driver);
	  sign.signingUp(username, password);
	  String respuesta = sign.textAlert();
	  Assert.assertEquals(respuesta, sign.textoAlertSignUpCorrect);
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
