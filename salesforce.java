package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class salesforce {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		 driver.manage().window().maximize();
		 driver.findElement(By.name("UserFirstName")).sendKeys("naveen");
		 driver.findElement(By.name("UserLastName")).sendKeys("kumar");
		 driver.findElement(By.name("UserEmail")).sendKeys("naveen7595kumar@gmail.com");
		 WebElement userTitle = driver.findElement(By.name("UserTitle")); 
		 new Select(userTitle).selectByVisibleText("Sales Manager");
		 driver.findElement(By.name("CompanyName")).sendKeys("victor");
		 WebElement companyEmployees = driver.findElement(By.name("CompanyEmployees")); 
		 new Select(companyEmployees).selectByVisibleText("15 - 100 employees"); 
		 driver.findElement(By.name("UserPhone")).sendKeys("5675432789");
		 WebElement companyCountry = driver.findElement(By.name("CompanyCountry")); 
		 new Select(companyCountry).selectByVisibleText("India"); 
		 driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		 driver.close();
	
		
	}

}
