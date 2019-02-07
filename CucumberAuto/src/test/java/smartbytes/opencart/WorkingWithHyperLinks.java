package smartbytes.opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithHyperLinks {

	public static void main(String[] args) {
		WebDriver driver;
		String homePage = "http://smartbytes.v-logics.com/ocart/index.php?route=common/home";
		System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
		driver =new ChromeDriver();
		// Open Url
		System.out.println("Opening Home Page : "+ homePage);
		driver.get (homePage);
		
		// Open Hyperlinks
		driver.findElement(By.xpath("//*[@id=\"welcome\"]/a[1]")).click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
		driver.findElement(By.xpath("//*[@id=\"welcome\"]/a[2] ")).click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
		driver.findElement(By.linkText("Shopping Cart")).click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
		driver.findElement(By.linkText("Wish List")).click();
	}

}
