package smartbytes.opencart.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	private WebDriver driver;
	
	// name
	@FindBy(name="email")
	private WebElement txtmai;
	
	
	
	// password
	@FindBy(name="password")
	private WebElement txtpassword;
	
	

	//Button
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div[2]/form/div/input[3]")
	private WebElement btnLogin;

	// Creo un constructotr para inicializar los driver de los buscadores de arriba FindBy
	
	public LoginPage (WebDriver webDriver) {
		this.driver=webDriver;
		PageFactory.initElements(driver, this);
		}
	
	public void performLogin(String email, String password) {
		txtmai.sendKeys(email);
		txtpassword.sendKeys(password);
		btnLogin.click();
		}
	
	}


