package smartbytes.opencart.complete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginproccess {
	private static final String Browser ="Firefox";
	private static final String HomePage ="http://smartbytes.v-logics.com/ocart/index.php?route=common/home";
	private static WebDriver driver=null;
	public static void main(String[] args) {

		if (Browser.equals("Chrome"))	{
		System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
		driver =new ChromeDriver();
		}
	else if (Browser.equals("Firefox")){
		System.setProperty("webdriver.gecko.driver", "C:\\CucumberSetup\\geckodriver-win64\\geckodriver.exe");	
		driver =new FirefoxDriver();
	}
	
		System.out.println("Opening Home Page : "+ HomePage);
		driver.get (HomePage);
		
		// Click on login
		
		driver.findElement(By.linkText("login")).click();
		// enter username
		driver.findElement(By.name("email")).sendKeys("estadioss@gmail.com");
		
		// enter password
		driver.findElement(By.name("password")).sendKeys("1234567");
		
		// click on login botton
		driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/form/div/input[3]")).click();
		
		//loggout
		try {
			
			Thread.sleep(5000);
		}catch (Exception e) {
		}
		driver.findElement(By.linkText("Logout")).click();
	}

}
