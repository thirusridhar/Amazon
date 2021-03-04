package onlinepurchasing;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//port com.sun.org.apache.bcel.internal.generic.Select;
//import org.openqa.selenium.interactions.Action;

public class amazon_shopping {


	
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
       Actions action = new Actions(driver);
       WebElement web = driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
       action.moveToElement(web).perform();
       driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
       driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9080419011");
       driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("thirusridhar@14");
       driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
       
      
	
	
	
	
  	   
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsungmobiles");
		 driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
		 driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

     
     Set<String> wind=driver.getWindowHandles();
     Iterator<String> it = wind.iterator();
    String parent= it.next();
    String child=it.next();
    driver.switchTo().window(child);


     //WebDriverWait wait = new WebDriverWait(driver,10);
    // WebElement web = wait.until(ExpectedCondition.elementToBeClickable(By.xpath("//input[@class='a-button-input attach-dss-atc']")));
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
    driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
    
    //add address
    
   //WebElement webelement = driver.findElement(By.xpath("(//span[@class='a-button-text a-declarative'])[1]"));
   //Select drop = new Select(webelement);
   //drop.selectByVisibleText("india");
   
   driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressFullName\"]")).sendKeys("thirusridhar");
   
   driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressPhoneNumber\"]")).sendKeys("9080419011");
   
   driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressPostalCode\"]")).sendKeys("621101");
   
   driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressLine1']")).sendKeys("1/34");
   
   driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressLine2\"]")).sendKeys("melauliyur");
   
   //driver.findElement(By.xpath("//input[@id='address-ui-widgets-landmark']")).sendKeys("sivantemple");
   
   driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressCity\"]"));
   
  // WebElement webele = driver.findElement(By.xpath("(//span[@class='a-button-text a-declarative'])[2]"));
 // Select dropdown = new Select(webele);
  // dropdown.selectByVisibleText("TAMIL NADU");
   
 // WebElement webapp = driver.findElement(By.xpath("(//span[@class='a-button-text a-declarative'])[3]"));
 // Select selects = new Select(webapp);
 // selects.selectByIndex(0);
  
  driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-use-as-my-default\"]")).click();
  
  driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input")).click();
   
  driver.findElement(By.xpath("//a[@class='pipeline-link']")).click();
  
  // delete the product from addcart
  
  driver.findElement(By.xpath("(//a[@class='a-link-normal a-declarative'])[2]")).click();
  
  
    
	}

}
