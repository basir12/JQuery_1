import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGHW8 {

	public static WebDriver driver;
	
	//Annotation
	
  @BeforeMethod
   
		public void Amazonweb() {
		
     System.setProperty("webdriver.chrom.driver", "C:\\Users\\aboba\\Documents\\IT Class\\Testing Class Note\\Drivers\\chromedriver.exe");
     
     WebDriver driver= new ChromeDriver();
     driver.get("http://Amazon.com");
     
	}
	
	@Test
	
	public void Amazonsearch () {
    driver.findElement(By.xpath(xpathExpression))

		
	}
	
	
}
