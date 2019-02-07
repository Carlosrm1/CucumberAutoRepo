package smartbytes.opencart;

import java.util.List;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRadioButton {
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
	
	// radio button
	System.out.println("Select de radio button");
	List <WebElement> newsLetterRadioButton = driver.findElements(By.name("newsletter"));
	newsLetterRadioButton.get(0).click();
	try {
		
		Thread.sleep(5000);
	}catch (Exception e) {
	}
	newsLetterRadioButton.get(1).click();
	
	
try {
		
		Thread.sleep(5000);
	}catch (Exception e) {
	}

// checkbox
	System.out.println("chekbox");
driver.findElement(By.name("agree")).click();

	}
}	

	
	

