package Windowpopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupwindow {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://abhinandan/login.do");

		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");//click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");//click();	
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[.='Login']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Settings']")).click();
		driver.findElement(By.xpath("//div[.='Settings']")).click();
	}

}
