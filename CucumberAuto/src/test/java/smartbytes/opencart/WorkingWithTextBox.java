package smartbytes.opencart;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTextBox {
	public static void main (String [] args) {
	//1. Open webbrowser http://smartbytes.v-logics.com/ocart/index.php?route=account/register
	WebDriver driver;
	String expectedTitle = "Register Account";
	String actualTitle = "";
	
	System.out.println("Registering driver .....");
	String url = "http://smartbytes.v-logics.com/ocart/index.php?route=account/register";
	// Register ChromeDriver
	
	System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
	driver =new ChromeDriver();
	// Open Url
	System.out.println("Opening URL : "+url);
	driver.get (url);
	// Enter First name, lasta name, email and telephone
	actualTitle = driver.getTitle();
	System.out.println("Page Title is  : "+actualTitle);
	
	driver.findElement(By.name("firstname")).sendKeys("Sergi");
	driver.findElement(By.name("lastname")).sendKeys("Lopez");
	driver.findElement(By.name("email")).sendKeys("sergil@gmail.com");
	driver.findElement(By.name("telephone")).sendKeys("685986582");
	
	

	
	}
}
