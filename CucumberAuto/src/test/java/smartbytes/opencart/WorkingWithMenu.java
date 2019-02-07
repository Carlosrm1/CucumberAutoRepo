package smartbytes.opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMenu {

	public static void main(String[] args) {
		// Navigate with menu
		
		WebDriver driver;
		String homePage = "http://smartbytes.v-logics.com/ocart/index.php?route=common/home";
		System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
		driver =new ChromeDriver();
		// Open Url
		System.out.println("Opening Home Page : "+ homePage);
		driver.get (homePage);
		
		//start clicking on menu ??
		
		Actions action = new Actions(driver);
		WebElement desktopMenuItem = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a"));
		WebElement LaptopMenuItem = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a"));
		WebElement componentMenuItem = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a"));
		//WebElement macSubItem = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/div/ul/li[2]/a"));
		action.moveToElement(desktopMenuItem).build().perform();
		delay();
		action.moveToElement(LaptopMenuItem).build().perform();
		delay();
		action.moveToElement(componentMenuItem).build().perform();
		//action.moveToElement(desktopMenuItem).click(macSubItem).build().perform();
		

	}
public static void delay() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
