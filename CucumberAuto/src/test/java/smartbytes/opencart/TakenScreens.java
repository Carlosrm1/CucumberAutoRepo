package smartbytes.opencart;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class TakenScreens {

	private static final int Auto = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String url = "http://smartbytes.v-logics.com/ocart/index.php?route=account/login";
		System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
		driver =new ChromeDriver();
		// Open Url
		System.out.println("Opening URL : "+url);
		driver.get (url);
		driver.findElement(By.name("email")).sendKeys("yo@gmail.com");
		driver.findElement(By.name("password")).sendKeys("343434");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/form/div/input[3]")).click();
		
		
		// take screen shot
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File loginpageScreenShotPAge = scrShot.getScreenshotAs(OutputType.FILE);
		
		FileUtils fileutils = new FileUtils();
		try {
			fileutils.copyFile(loginpageScreenShotPAge, new File ("C:\\CucumberSetup\\scrshots\\homepage.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
	}
}
	



