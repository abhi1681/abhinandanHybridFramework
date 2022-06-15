package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartASS {
 
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		//driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("lenovo");
		Thread.sleep(2000);
		// 	Abhinandan
		//driver.findElement(By.xpath("//button[@classname='L0Z3Pu']")).click();
		//driver.findElement(By.className("//button[@className='L0Z3Pu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		driver.findElement(By.xpath("//div[.='lenovo Yoga 7 Core i7 11th Gen Intel EVO - (16 GB/512 GB SSD/Windows 10 Home) 14ITL5 2 in 1 Laptop']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		Thread.sleep(2000);
		driver.close();
}
}
