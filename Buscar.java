package demo_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buscar {

	static WebDriver driver = new ChromeDriver();
	public static void main(String[] jdfhkd) throws InterruptedException {
		
		driver.get("http://advantageonlineshopping.com/#/");
		Thread.sleep(2000);
		WebElement ClicUser = driver.findElement(By.xpath("//*[@id=\"menuUser\"]"));
		if (ClicUser.isDisplayed()){
			Thread.sleep(1000);
			ClicUser.click();
		}
		Thread.sleep(1000);
		WebElement ClicNewCount = driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]"));
		if (ClicNewCount.isDisplayed()){
			Thread.sleep(1000);
			ClicNewCount.click();
		}
		Thread.sleep(1000);
		WebElement Username = driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/input"));
		WebElement Email = driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div/input"));
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/input"));
		WebElement passconfirm = driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/input"));
		if (Username.isDisplayed() && pass.isDisplayed() && passconfirm.isDisplayed() && Email.isDisplayed()){
			Thread.sleep(1000);
			Username.sendKeys("Antony");
			Thread.sleep(1000);
			Email.sendKeys("jesus.alternativo@live.com");
			Thread.sleep(1000);
			pass.sendKeys("Password24");
			Thread.sleep(1000);
			passconfirm.sendKeys("Password24");
			
		}
		Thread.sleep(1000);
		WebElement check = driver.findElement(By.xpath("//*[@id=\"formCover\"]/sec-view/div/input"));
		check.click();
		
	}
}

