package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.ActualMain;
import org.openqa.selenium.interactions.Action;
public class MoveToElement {
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("denyBtn")).click();
		//driver.close();
		Thread.sleep(2000);
		WebElement targetToMouseHover=driver.findElement(By.xpath("//li[@class='menuparent repb']/a[.='Rings']"));
		//
		//driver.findElement(By.name("")).sendKeys("");
		//
	}
}
