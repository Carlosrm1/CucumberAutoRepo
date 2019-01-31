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

public class ShareDataStepDef1 {
	
	//Empezar a utilizar seleneimu crear un objeto de selenium webdriver
	
	WebDriver driver;
	
	public ShareDataStepDef1 (SharedClass share) {
		driver =share.setup();
	}
		
	@Then ("^User checks user \"([^\"]*)\" first name is present$")
	
	public void User_checks_user_first_name_is_present(String username) throws InterruptedException {
		String userNameActual= driver.findElement(By.xpath("//input[@id='u_0_l']")).getAttribute ("value");
	//Se pone una asercion para validar el resultado
		Assert.assertEquals(username, userNameActual);
		Thread.sleep(1000);
	}
	
	@And("^User enters user \"([^\"]*)\" surname$")
	public void User_enters_user_surname(String surname) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='u_0_n']")).sendKeys(surname);
		Thread.sleep(1000);
	}
	
	
	@Then("^User Mobile field should be blank$")
	public void User_Mobile_field_should_be_blank()
	{
		String mobileActual = driver.findElement(By.xpath("//input[@id='u_0_q']")).getAttribute("value");
		Assert.assertEquals("", mobileActual);
	}

	
	
	
}
	

