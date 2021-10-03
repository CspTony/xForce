package demo_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoTest {
	static WebDriver driver = new ChromeDriver();
	//datos
	String nombreString="Antony91", passwordString="Password24";

  @Test(priority=1)
  public void f() throws InterruptedException {
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
			//Thread.sleep(1000);
			
			Username.sendKeys(nombreString);
			//Thread.sleep(1000);
			Email.sendKeys("jesus.alternativo@live.com");
			//Thread.sleep(1000);
			pass.sendKeys(passwordString);
			
			passconfirm.sendKeys(passwordString);
			String passString = pass.getText();
			String passConfirmString = passconfirm.getText();
			if (!passString.equals(passConfirmString)){
				//error
				System.out.println("La contrraseña es distinta al confirmar");}
				else {
				System.out.println("La contrraseña es correcta en la confirmacion");
			}
			
			
			//Thread.sleep(1000);
			
			
		}
		Thread.sleep(1000);
		WebElement check = driver.findElement(By.xpath("//*[@id=\"formCover\"]/sec-view/div/input"));
		check.click();
		//Thread.sleep(1000);
		WebElement create = driver.findElement(By.xpath("//*[@id=\"register_btnundefined\"]"));
		create.click();	
		//validamos que ingreso
		WebElement logueado = driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]/span"));
		if (logueado.isDisplayed()) {
			System.out.println("El sistema se logueo correctamente");
		}
		Thread.sleep(2000);
  }
  @Test(priority=2)
  public void e() throws InterruptedException {
	  driver.get("http://advantageonlineshopping.com/#/");
		Thread.sleep(2000);
		WebElement ClicUser = driver.findElement(By.xpath("//*[@id=\"menuUser\"]"));
		if (ClicUser.isDisplayed()){
			Thread.sleep(1000);
			ClicUser.click();
		}
		Thread.sleep(1000);
		WebElement passlog = driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input"));
		WebElement userlog = driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input"));
		passlog.sendKeys(passwordString);
		userlog.sendKeys(nombreString);
		WebElement enter = driver.findElement(By.xpath("//*[@id=\"sign_in_btnundefined\"]"));
		enter.click();
		WebElement logueado = driver.findElement(By.xpath("/html/body/header/nav/ul/li[3]/a/span"));
		
		if (logueado.isDisplayed()) {
			System.out.println("El sistema se logueo correctamente");
		}
		//agregamos dos laptops
		//WebElement productolap = driver.findElement(By.xpath("//*[@id=\"laptopsImg\"]"));
		//productolap.click();
		//Thread.sleep(2000);
		//buscamos primer producto
		WebElement productolap1 = driver.findElement(By.xpath("//*[@id=\"details_16\"]"));
		productolap1.click();
		Thread.sleep(2000);
		//agregamos al carrito
		WebElement addcarprod1 = driver.findElement(By.xpath("//*[@id=\"productProperties\"]/div[4]/button"));
		addcarprod1.click();
		Thread.sleep(2000);
		//regresamos a inicio
		WebElement inicio = driver.findElement(By.xpath("/html/body/header/nav/div/a/span[1]"));
		inicio.click();
		Thread.sleep(2000);
		
		//buscamos segundo producto
		WebElement producto2 = driver.findElement(By.xpath("//*[@id=\"details_21\"]"));
		producto2.click();
		Thread.sleep(2000);
		//agregamos al carrito
		WebElement addcarprod2 = driver.findElement(By.xpath("//*[@id=\"productProperties\"]/div[4]/button"));
		addcarprod2.click();
		Thread.sleep(2000);
		//regresamos a inicio
		inicio.click();
		Thread.sleep(2000);
		//buscamos tercer producto
		WebElement producto3 = driver.findElement(By.xpath("//*[@id=\"details_10\"]"));
		producto3.click();
		Thread.sleep(2000);
		//agregamos al carrito
		WebElement addcarprod3 = driver.findElement(By.xpath("//*[@id=\"productProperties\"]/div[4]/button"));
		addcarprod3.click();
		Thread.sleep(2000);
		
		if (producto3.equals(producto2) || producto3.equals(productolap1) || producto2.equals(productolap1)) {
			System.out.println("Se tienen los mismos productos");
		}
			else {
				System.out.println("Se valido que sean productos distintos");		
		}
		inicio.click();
		Thread.sleep(1000);
		//vamos al carrito 
		WebElement carrito = driver.findElement(By.id("menuCart"));
		carrito.click();
		Thread.sleep(2000);
		//checkout
		WebElement checkout = driver.findElement(By.xpath("//*[@id=\"checkOutButton\"]"));
		checkout.click();
		Thread.sleep(2000);
		
		//WebElement next = driver.findElement(By.xpath("//*[@id=\"next_btn\"]"));
		//next.click();
		//Thread.sleep(1000);
		
		
		
		WebElement next2 = driver.findElement(By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[2]/div[1]/div[3]/button"));
		next2.click();
		Thread.sleep(1000);
		
		
		WebElement userc = driver.findElement(By.xpath("//*[@id=\"paymentMethod\"]/div/div[2]/sec-form/sec-view[1]/div/input"));
		WebElement passc = driver.findElement(By.xpath("//*[@id=\"paymentMethod\"]/div/div[2]/sec-form/sec-view[2]/div/input"));
		//userc.sendKeys("");
		//passc.sendKeys("");
		userc.sendKeys(nombreString);
		passc.sendKeys(passwordString);
		Thread.sleep(1000);
		WebElement desche = driver.findElement(By.xpath("//*[@id=\"paymentMethod\"]/div/div[2]/sec-form/div[1]/input"));
		desche.click();
		Thread.sleep(1000);
		//pay now
		WebElement paynow = driver.findElement(By.xpath("//*[@id=\"pay_now_btn_SAFEPAY\"]"));
		
		paynow.click();
		Thread.sleep(1000);
		//validamos el mensaje
		WebElement message = driver.findElement(By.xpath("//*[@id=\"orderPaymentSuccess\"]/h2/span"));
		String mensajeString= message.getText();
		if( mensajeString.equals("Thank you for buying with Advantage")) {
			System.out.println("El mensaje final es correcto");
		}
  }
}
