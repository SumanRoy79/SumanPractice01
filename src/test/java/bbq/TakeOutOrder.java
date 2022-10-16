package bbq;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TakeOutOrder {
	
	WebDriver driver;

@Test(priority = 1)	
	public void hometpage () throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\skroy\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.dallasbbq.com/");
		driver.manage().window().maximize();	
		Thread.sleep(2000);
}
		//driver.quit();
	@Test(priority = 2)	
	public void ClickLocation () {
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[3]/div[2]/div[1]/div[2]/div/nav/div[2]/a")).click();
	}
	@Test(priority = 3)
		public void ClickNostrand() {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[3]/div[2]/div[1]/div[2]/div/nav/div[2]/div/div[10]/a")).click();
}
	@Test(priority = 4)
		public void ScrollDownToTakeOutNostrandAve() {
		JavascriptExecutor info = (JavascriptExecutor) driver;
		
		info.executeScript("window.scrollTo(0,500)");
		}
		
	@Test(priority = 5)
		public void ClickTakeOutNostrandAve() {
		driver.findElement(By.xpath("/html/body/div[1]/main/article/section[1]/div[2]/div/div/div/div/div/div[1]/div[3]/div/div/a")).click();
		
		}
		
	@Test(priority = 6)
	
		public void printdeline () throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		Thread.sleep(5000);
		
		String gettext   =	driver.findElement(By.xpath("//*[@id=\"chakra-modal-30\"]/footer/div[1]")).getText();

		System.out.println(gettext);
		
			
		}
	
	@Test(priority = 7)
	public void clickdecline() {
		driver.findElement(By.xpath("//*[@id=\"chakra-modal-30\"]/footer/div[1]")).click();
		//driver.quit();
		
	}

}
