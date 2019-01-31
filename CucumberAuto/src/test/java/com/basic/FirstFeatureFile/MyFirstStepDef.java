package com.basic.FirstFeatureFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef {
	
	//Empezar a utilizar seleneimu crear un objeto de selenium webdriver
	
	WebDriver driver;
	
	@Given ("^User need to be on Facebook login page$")
	public void  User_need_to_be_on_Facebook_login_page() {
	
		// abrir la url, primero se pone para que abra el navegador chrome
	System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
	driver =new ChromeDriver();
	driver.get ("https://www.facebook.com/");
		
		
	}

	@When ("^User enters user first name$")
	public void User_enters_user_first_name () {
		//entontrar el elemento nombre
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("Jose");
		
	}
		
	@Then ("^User checks user first name is present$")
	
	public void User_checks_user_first_name_is_present() {
		String userNameActual= driver.findElement(By.xpath("//input[@id='u_0_l']")).getAttribute ("value");
	//Se pone una asercion para validar el resultado
		Assert.assertEquals("Jose", userNameActual);
	
	}
}
