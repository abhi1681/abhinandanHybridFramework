package ScenariosAssignement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Senarious5 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
        driver.get("https://www.bluestone.com/");
       Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(4000);
		WebElement mousehourElement=driver.findElement(By.xpath("//span[@class='caret hs']/ancestor::a[@title='Rings']"));
		Thread.sleep(4000);
		Actions act1 = new Actions(driver);
		act1.moveToElement(mousehourElement).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@title='Diamond Rings']")).click();
		List<WebElement> defaultprice=driver.findElements(By.xpath("//span[@class='new-price']"));
		 
		for(int i=0;i<defaultprice.size();i++)
		{
			WebElement price=defaultprice.get(i);
			String textprice=price.getText();
			System.out.println(textprice);
			
		}
		System.out.println("==========================================");
		WebElement popular=driver.findElement(By.xpath("//span[.=' Popular ']"));
		act1.moveToElement(popular).perform();
		driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
		List<WebElement> lowToHighPriceSort= driver.findElements(By.xpath("//span[@class='new-price']"));
		//driver.findElement(By.xpath("//")).click();
		//"//button[contains(.,'Double')]"
		for(int i=0;i<lowToHighPriceSort.size();i++)
		{
		WebElement lowToHigh = lowToHighPriceSort.get(i);
		String price=lowToHigh.getText();
		System.out.println(price);
		}
		if(defaultprice.equals(lowToHighPriceSort))
		{
		System.out.println("defaultprice and soted price are same");
	}
		else {
			System.out.println("good bye");
		}
		}
}