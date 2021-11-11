package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http:\\WWW.facebook.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.linkText("Create New Account")).click();
		 driver.findElement(By.name("firstname")).sendKeys("Naveen");
		 driver.findElement(By.name("lastname")).sendKeys("Kumar");
		 driver.findElement(By.name("reg_email__")).sendKeys("6453784925");
		 driver.findElement(By.id("password_step_input")).sendKeys("Naveen@7595");
		 WebElement birthdayday = driver.findElement(By.id("day")); 
		 new Select(birthdayday).selectByVisibleText("29");
		 WebElement birthdaymonth = driver.findElement(By.id("month")); 
		 new Select(birthdaymonth).selectByVisibleText("Aug"); 
		 WebElement birthdayyear = driver.findElement(By.id("year")); 
		 new Select(birthdayyear).selectByVisibleText("1998"); 
		 driver.findElement(By.xpath("//label[text()='Male']")).click();
		 driver.close();

	}

}
