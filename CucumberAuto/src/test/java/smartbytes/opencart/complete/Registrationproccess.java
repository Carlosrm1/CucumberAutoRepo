package smartbytes.opencart.complete;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Registrationproccess {
	
	private static final String Browser ="Firefox";
	private static final String HomePage ="http://smartbytes.v-logics.com/ocart/index.php?route=common/home";
	private static WebDriver driver=null;
	public static void main(String[] args) {
		// Go to home page
		
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
		
		
		// create new account
		
		driver.findElement(By.linkText("create an account")).click();
		
		// fill up the neccesarh
		
		//personal details
		
		fillupPersonal("Johnws", "albatross", "estadioss@gmail.com", "648523268", "888888888");
		
		// address
		filupAddress();
		//Newsletter
			List <WebElement> newsLetterRadioButton = driver.findElements(By.name("newsletter"));
			newsLetterRadioButton.get(0).click();
			try {
				
				Thread.sleep(5000);
			}catch (Exception e) {
			}
			newsLetterRadioButton.get(1).click();
		
		// Your password
		driver.findElement(By.name("password")).sendKeys("1234567");
		driver.findElement(By.name("confirm")).sendKeys("1234567");
		// checkbox I agree 
		System.out.println("chekbox");
	driver.findElement(By.name("agree")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[5]/form/div[5]/div/input[2]")).click();
	
	// take screen shot
			System.out.println("Pantalla de creacción login");
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			File homepageScreenShotPAge = scrShot.getScreenshotAs(OutputType.FILE);
			
			FileUtils fileutil = new FileUtils();
			try {
				fileutil.copyFile(homepageScreenShotPAge, new File ("C:\\CucumberSetup\\scrshots\\cretionlogin.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	// This method is used to fill up the address
	public static void fillupPersonal(String firstname, String lastname, String email, String telephone, String fax) {
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("telephone")).sendKeys(telephone);
		driver.findElement(By.name("fax")).sendKeys(fax);
		
	}
	// This method is used to fill up the address
	public static void filupAddress() {
		driver.findElement(By.name("company")).sendKeys("Samuray");
		driver.findElement(By.name("company_id")).sendKeys("123113");
		driver.findElement(By.name("address_1")).sendKeys("real");
		driver.findElement(By.name("address_2")).sendKeys("real 25");
		driver.findElement(By.name("city")).sendKeys("Victoria");
		driver.findElement(By.name("postcode")).sendKeys("28001");
		 
		Select countryElement = new Select (driver.findElement(By.name("country_id")));
		//countryElement.selectByValue("12");
		countryElement.selectByVisibleText("Australia");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement zoneElement = driver.findElement(By.name("zone_id"));
			Select zoneySelectBox = new Select(zoneElement);
			//countrySelectBox.selectByvalue("13");
			zoneySelectBox.selectByVisibleText("Victoria");
			
	}
}
