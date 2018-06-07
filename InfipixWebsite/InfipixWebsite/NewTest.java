package InfipixWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	@beforetest
	
	public void d() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hulk\\Downloads\\Windows10backUp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.navigate().to("http://159.65.157.201");
		driver.manage().window().maximize();
		
	}
	
  @Test
  public void f() {
	  
	  
  }
}
