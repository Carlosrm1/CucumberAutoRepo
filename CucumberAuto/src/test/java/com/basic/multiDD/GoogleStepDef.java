package com.basic.multiDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleStepDef {
	
WebDriver driver;
	
	@Given ("^User need to be on google page$")
	public void  User_need_to_be_on_google_page() {
	
		// abrir la url, primero se pone para que abra el navegador chrome
	System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
	driver =new ChromeDriver();
	driver.get ("https://www.google.com/");
		}

	@When ("^User enters search string$")
	
	public void User_enters_search_string () throws InterruptedException  {
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(1000);
	}
	@Then("^close browser$")
	public void close_browser()
	{
		driver.quit();
		driver=null;
	}
}
