package smartbytes.opencart.pom.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import smartbytes.opencart.pom.LoginPage;

public class TestLoginPage {
	public static void main(String[] args) {
		
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
		driver =new ChromeDriver();
		driver.get("http://smartbytes.v-logics.com/ocart/index.php?route=account/login");
		
// crear un objeto de la clase LoginPage
		
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.performLogin("estadioss@gmail.com", "1234567");
		
		try {
			
			Thread.sleep(5000);
		}catch (Exception e) {
		}
		
		
		driver.findElement(By.linkText("Logout")).click();
		
		try {
			
			Thread.sleep(5000);
		}catch (Exception e) {
		}
		driver.close();
		}
	

}
