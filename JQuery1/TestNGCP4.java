import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGCP4 {

	public static WebDriver driver;
	
	//annotation
	
   @BeforeMethod()

	public void classNGmethod() {

		System.setProperty("webdriver.chrome.driver","\\Users\\aboba\\Documents\\IT Class\\Testing Class Note\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}
    
//   
         @Test
   public void testOrange() throws InterruptedException { 
	   
	 
		 driver.findElement(By.xpath("//*[@id=txtUsername]")).sendKeys("admin");
		 driver.findElement(By.xpath("//*[@id=txtPassword]")).sendKeys("admin");
		 driver.findElement(By.xpath("//*[@id=btnLogin]")).click();
		 
		 Thread.sleep(3000);
	 }
	 	       
@AfterMethod() 
 public void quitBrowser() {
driver.quit();

}}
	 
	
	
 

