package com.basic.datatableSDD;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class datatableStepDef {
	
	//Empezar a utilizar seleneimu crear un objeto de selenium webdriver
	
	WebDriver driver;
	
	@Given ("^User need to be on Facebook login page$")
	public void  User_need_to_be_on_Facebook_login_page() {
	
		// abrir la url, primero se pone para que abra el navegador chrome
	System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
	driver =new ChromeDriver();
	driver.get ("https://www.facebook.com/");
		
		
	}

	@When ("^User enters user \"([^\"]*)\" first name$")
	public void User_enters_user_first_name (String username) throws InterruptedException {
		//entontrar el elemento nombre
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(username);
		Thread.sleep(1000);
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

	@Then("^close browser$")
	public void close_browser()
	{
		driver.quit();
		driver=null;
	}
	
	@When ("Enter following date")
	public void Enter_following_date (DataTable table) throws InterruptedException	{
		
		List<List<String>> date = table.raw();
		
		String values1 = date.get(0).get(0);
		String values2 = date.get(0).get(1);
		String values3 = date.get(0).get(2);
		String values4 = date.get(1).get(0);
		String values5 = date.get(1).get(1);
		String values6 = date.get(1).get(2);
		
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(values4);
		driver.findElement(By.xpath("//input[@id='u_0_n']")).sendKeys(values5);
		Thread.sleep(10000);
	}
}
	

