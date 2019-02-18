package smartbytes.opencart;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String url = "http://smartbytes.v-logics.com/ocart/date.html";
		System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
		driver =new ChromeDriver();
		// Open Url
		System.out.println("Opening URL : "+url);
		driver.get (url);
		
		// Choose date 
		//first click
		driver.findElement(By.id("departure_date")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a")).click();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		
		driver.findElement(By.id("arrival_date")).click();
		driver.findElement(By.xpath("	//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[5]/a")).click();
		
			
	}
}
	


	


