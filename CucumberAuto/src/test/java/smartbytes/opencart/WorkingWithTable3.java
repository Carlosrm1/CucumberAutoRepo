package smartbytes.opencart;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithTable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String url = "http://smartbytes.v-logics.com/ocart/table.html";
		System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
		driver =new ChromeDriver();
		// Open Url
		System.out.println("Opening URL : "+url);
		driver.get (url);
		
		
		// I want to read data from the first row
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[1]"));
		
		//set the visible rows to 25
		
		Select rowSelectBox = new Select(driver.findElement(By.name("example_length")));
		rowSelectBox.selectByVisibleText("25");
		
		// read all de rows from table
		
		List <WebElement> rowElements = driver.findElements(By.xpath("//*[@id=\"example\"]/tbody/tr"));

		int no0fRows = rowElements.size();
		System.out.println("Total Rows:  "+no0fRows);
			
		// read all the column data for each row
		int noOfColumns=0;
		noOfColumns = driver.findElements(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td")).size();
		WebElement colElem=null;
		for (int rowIndex=1; rowIndex<=10;rowIndex++ ) {
			System.out.println("Row =  "+rowIndex++);
			for (int colIndex=1;colIndex<=noOfColumns; colIndex++) {
				colElem = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr["+rowIndex+"]/td["+colIndex+"]"));
				System.out.println(colElem.getText()+  "\t");
					
}
		}
		
		
		// columns
		/*
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]"));
		WebElement columnDateElem=null;
		for (int rowIndex=1 ; rowIndex<=10;rowIndex++) {
			for (int colIndex =1; colIndex<=6; colIndex++) {
				columnDateElem = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr["+rowIndex+"]/td["+colIndex+"]"));
				System.out.print(columnDateElem.getText()+"\t");
		}
			System.out.println("");
		}*/
	}
}
	
		//for (int colIndex =1; colIndex<=6; colIndex++) {
			//columnDateElem = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td["+colIndex+"]"));
			//System.out.print(columnDateElem.getText()+"\t");
		//}
		//driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[1]"));
		//driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[2]")); 
		//driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[3]")); //*[@id="example"]/tbody/tr[1]/td[3]
		//System.out.println("");
		/*for (int colIndex =1; colIndex<=6; colIndex++) {
			columnDateElem = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[2]/td["+colIndex+"]"));
			System.out.print(columnDateElem.getText()+"\t");
		}
		System.out.println("");
		for (int colIndex =1; colIndex<=6; colIndex++) {
			columnDateElem = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[3]/td["+colIndex+"]"));
			System.out.print(columnDateElem.getText()+"\t");
		}*/
	


