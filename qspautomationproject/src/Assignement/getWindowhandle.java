package Assignement;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class getWindowhandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		//driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Samsang galaxy F12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F12 (Sea Green, 64 GB)']")).click();
		
	String parentHandle=driver.getWindowHandle();
	Set <String> allHandles=driver.getWindowHandles();
	for (String wh: allHandles)
	{
		if(!parentHandle.equals(wh))
		{driver.switchTo().window(wh);
	    }
	
	else
	{
		
	}
		}
	driver.findElement(By.xpath("//a[.='128 GB']")).click();
	Thread.sleep(4000);
	//driver.findElement()
	driver.findElement(By.xpath("//li[@id='swatch-2-color']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='pincodeInputId']")).clear();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("411033");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
	
	}

}
