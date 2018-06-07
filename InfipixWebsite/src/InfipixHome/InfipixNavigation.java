package InfipixHome;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Form
public class InfipixNavigation {
	public static void main(String args[]) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hulk\\Downloads\\Windows10backUp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.navigate().to("http://159.65.157.201");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		Thread.sleep(5000);
	

		// About
		driver.findElement(By.id("menu-item-1399")).click();
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		Thread.sleep(5000);

		//Services
		WebElement de = driver.findElement(By.id("menu-item-1457"));
		de.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		
		// Digital Transformation
		WebElement DT = driver.findElement(By.id("menu-item-1463"));
		DT.click();
		//WebElement CD = driver.findElement(By.linkText("Digital Transformation"));
		//CD.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);

		// Application Management Outsourcing
		WebElement de4 = driver.findElement(By.id("menu-item-1457"));
		de.click();
		WebElement de1 = driver.findElement(By.id("menu-item-1464"));
		de.click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);

		// Quality Management Services
		WebElement QMS = driver.findElement(By.id("menu-item-1457"));
		QMS.click();
		driver.findElement(By.linkText("Quality Management Services")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);

		// Managed IT Services
		WebElement MIS = driver.findElement(By.id("menu-item-1457"));
		MIS.click();
		driver.findElement(By.linkText("Managed IT Services")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);

		// Mobility Services
		WebElement MS = driver.findElement(By.id("menu-item-1457"));
		MS.click();
		driver.findElement(By.linkText("Mobility Services")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		
		
		// Contact
		driver.findElement(By.id("menu-item-1400")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);

		// Home
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		driver.findElement(By.id("menu-item-1401")).click();
	}

}
