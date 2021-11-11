package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class optional {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://WWW.opencart.com/index.php?route=account/register");
		 driver.findElement(By.id("input-username")).sendKeys("Naveen456");
		 driver.findElement(By.name("firstname")).sendKeys("Naveen");
		 driver.findElement(By.name("lastname")).sendKeys("kumar");
		 driver.findElement(By.id("input-email")).sendKeys("naveen7595kumar@gmail.com");
		 WebElement countryid = driver.findElement(By.id("input-country")); 
		 new Select(countryid).selectByVisibleText("India");
		 driver.findElement(By.id("input-password")).sendKeys("Naveen@7595");
		 driver.findElement(By.className("bg-info")).click();
		 driver.findElement(By.xpath("html[1]")).click();
		 driver.close();

	}

}
