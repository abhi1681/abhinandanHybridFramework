package ScenariosAssignement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class ebay {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
        driver.get("https://www.ebay.com/");
		//login to gmail with correct cred
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Apple Watches");
		driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']")).click();
       List<WebElement> WA=driver.findElements(By.xpath("//h3[@class='s-item__title']"));
		//Thread.sleep(2000);
	for(int i=0;i<WA.size();i++)
	{
		WebElement prod=WA.get(i);
		String prodText=prod.getText();
		System.out.println(prodText);	
		}
	
		System.out.println("---------------------------------------------------------------------------");	
     for(int j=10;j<=10;j++)
{
	WebElement nProd=WA.get(j);
	String nProdText=nProd.getText();
	System.out.println(nProdText);
}
	}

}
