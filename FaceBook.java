package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

		public static void main(String[] args) throws InterruptedException {
			 WebDriverManager.chromedriver().setup();
			 ChromeDriver driver=new ChromeDriver();
			 driver.get("https://en-gb.facebook.com/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 
			 driver.findElement(By.xpath("//a[(text()='Create New Account')]")).click();
			 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tamil");
			 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Prabaharan");
			 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9842559539");
			 driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("abc123456");
			 
			 WebElement eledate=driver.findElement(By.id("day"));
			 Select dropdown=new Select(eledate);
			 dropdown.selectByIndex(29);
			 
			 WebElement elemonth=driver.findElement(By.id("month"));
			 Select dropdown1=new Select(elemonth);
			 dropdown1.selectByValue("11");
			 
			 WebElement eleyear=driver.findElement(By.id("year"));
			 Select dropdown2=new Select(eleyear);
			 dropdown2.selectByVisibleText("1989");
			 
			 driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
			 
			 driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			 
						 
	}

}
