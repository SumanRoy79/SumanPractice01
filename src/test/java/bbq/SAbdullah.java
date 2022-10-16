package bbq;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SAbdullah {
	
	
	WebDriver driver;
	
	@Test(priority = 1)
	
	public void homepage( ) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\skroy\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        
     driver = new ChromeDriver();

     driver.get("https://www.thecheesecakefactory.com");

     driver.manage().window().maximize();        

                       Thread.sleep(2000);

}

                       //driver.quit();

           
     
           @Test(priority = 2)
     
     public void ClickBrowsemenu () {

   driver.findElement(By.xpath("//*[@id=\"p-id-556\"]/div[2]/div[2]/div/div[2]/div/div/div/a")).click();
   
     }
     
           
           @Test(priority = 3)

 public void ClickOrderNow () {
     
 driver.findElement(By.xpath("//*[@id=\"user-block-navigation-603516563\"]/li[3]/button")).click();
   
           }
     
//@Test(priority = 4)
//
//public void LocationsNearyou() {
//
// driver.findElement(By.xpath("//*[@id=\"reservations_btn\"]/span"));
//         
//     }
   
//   @Test(priority = 5)
//
// public void ScrollDownNewarkNJ() {
//
//  JavascriptExecutor info = (JavascriptExecutor) driver;
//         
// info.executeScript("window.scrollTo(0,5000)");

                   //    }
   
   @Test(priority = 4)
       
   public void ClickOrderPickUp() {
   
   driver.findElement(By.xpath("//*[@id=\"pickup_btn\"]")).click();
     }
	
	

}
