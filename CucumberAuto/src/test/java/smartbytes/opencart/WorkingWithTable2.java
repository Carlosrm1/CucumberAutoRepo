package smartbytes.opencart;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String url = "http://smartbytes.v-logics.com/ocart/table.html";
		System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
		driver =new ChromeDriver();
		// Open Url
		System.out.println("Opening URL : "+url);
		driver.get (url);
		
		// I want to search for employees who lives in london
		
		driver.findElement(By.cssSelector("#example_filter > label > input[type=\"search\"]")).sendKeys("London");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		
		// I want to sort the employess by age
		driver.findElement(By.xpath("//*[@id=\"example\"]/thead/tr/th[4]")).click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		driver.findElement(By.xpath("//*[@id=\"example\"]/thead/tr/th[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"example_paginate\"]/span/a[2]")).click();
			
		
		
	}
}
	


	


