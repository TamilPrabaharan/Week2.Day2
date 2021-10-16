package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

		public static void main(String[] args) throws InterruptedException {
			 WebDriverManager.chromedriver().setup();
			 ChromeDriver driver=new ChromeDriver();
			 driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			 
			 driver.findElement(By.name("UserFirstName")).sendKeys("Tamil");
			 driver.findElement(By.name("UserLastName")).sendKeys("Prabaharan");
			 driver.findElement(By.name("UserEmail")).sendKeys("prabahar@live.in");
			 driver.findElement(By.name("UserTitle")).sendKeys("IT_Manager_AP");
			 driver.findElement(By.name("CompanyName")).sendKeys("Wipro");
			 driver.findElement(By.name("CompanyEmployees")).sendKeys("501 - 1500 employees");
			 driver.findElement(By.name("UserPhone")).sendKeys("9842559539");
			 driver.findElement(By.name("CompanyCountry")).sendKeys("Canada");
			 driver.findElement(By.className("checkbox-ui")).click();
			 Thread.sleep(3000);
			 driver.close();
	}

}
