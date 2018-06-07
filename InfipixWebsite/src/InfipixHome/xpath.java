package InfipixHome;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class xpath {
	
	
	public static void main(String args[]) throws IOException, AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hulk\\Downloads\\Windows10backUp\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver;
				driver = new ChromeDriver();
				driver.navigate().to("http://setskill.com/jmeter/jmeter-tutorials/");
				driver.manage().window().maximize();
		driver.findElement(By.xpath(".//input[@class='form-control search-query']")).sendKeys("search");
		  
		File src=   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File( "C:\\screen\\screenshot.png"));
		
		
	}

}
