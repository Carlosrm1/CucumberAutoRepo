package smartbytes.opencart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDropDownBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		String url = "http://smartbytes.v-logics.com/ocart/index.php?route=account/register";
		System.out.println("Registering driver .....");
		// Register ChromeDriver
		
		System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
		driver =new ChromeDriver();
		// Open Url
		System.out.println("Opening URL : "+url);
		driver.get (url);
		//I want to interact with drop down boxes.
		
		WebElement countryElement = driver.findElement(By.name("country_id"));
		Select countrySelectBox = new Select(countryElement);
		//countrySelectBox.selectByvalue("13");
		countrySelectBox.selectByVisibleText("Australia");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement zoneElement = driver.findElement(By.name("zone_id"));
		Select zoneySelectBox = new Select(zoneElement);
		//countrySelectBox.selectByvalue("13");
		zoneySelectBox.selectByVisibleText("Victoria");

	}

}
