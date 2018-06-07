package InfipixHome;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWebsite {
	public static void main(String args[]) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\hulk\\Downloads\\Windows10backUp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.navigate().to("http://159.65.157.201");
		driver.manage().window().maximize();
		
		// About
		driver.findElement(By.id("menu-item-1399")).click();
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

		//ServicesClick 
		driver.findElement(By.id("menu-item-1457")).click();
		//CloudServices
		driver.findElement(By.id("menu-item-1462")).click();

		Thread.sleep(5000);

		//ServicesClick
		driver.findElement(By.id("menu-item-1457")).click();
		//DigitalTransformation
		driver.findElement(By.id("menu-item-1463")).click();

		Thread.sleep(5000);
		//ServicesClick
		driver.findElement(By.id("menu-item-1457")).click();		
		//Application Management Outsourcing
		driver.findElement(By.id("menu-item-1464")).click();

		Thread.sleep(5000);
		//ServicesClick
		driver.findElement(By.id("menu-item-1457")).click();		
		//Quality Management Services
		driver.findElement(By.id("menu-item-1465")).click();

		Thread.sleep(5000);
		//ServicesClick
		driver.findElement(By.id("menu-item-1457")).click();		
		//Managed It Services
		driver.findElement(By.id("menu-item-1466")).click();

		Thread.sleep(5000);
		//ServicesClick
		driver.findElement(By.id("menu-item-1457")).click();		
		//Mobility Services
		driver.findElement(By.id("menu-item-1467")).click();
		
		Thread.sleep(5000);
		//Contact
		driver.findElement(By.id("menu-item-1400")).click();		
		
		
	}

}
