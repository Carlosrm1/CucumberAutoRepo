package com.basic.sharedataSDD.copy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShareDataStepDef {
	
	//Empezar a utilizar seleneimu crear un objeto de selenium webdriver
	
	WebDriver driver;
	
	public ShareDataStepDef (SharedClass share) {
		driver =share.setup();
	}
	
			
	@Given ("^User need to be on Facebook login page$")
	public void  User_need_to_be_on_Facebook_login_page() {
	
		// abrir la url, primero se pone para que abra el navegador chrome
	
	driver.get ("https://www.facebook.com/");
		
		
	}

	@When ("^User enters user \"([^\"]*)\" first name$")
	public void User_enters_user_first_name (String username) throws InterruptedException {
		//entontrar el elemento nombre
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(username);
		Thread.sleep(1000);
	}
		
	
}
	

