package XpathCase3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case3 {
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//driver.get("https://www.amazo=0&opt_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D60456322738%26hvpone%3D%26hvptwo%3D%26hvadid%3D486393568012%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D1526120746424051201%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007788%26hvtargid%3Dkwd-360364908477%26hydadcr%3D14451_2154369%26gclid%3DEAIaIQobChMIwL_3786m9wIVhKiyCh07NwQpEAAYASAAEgLOp_D_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		
		//driver.findElement(By.cssSelector("input[name='username")).sendKeys("9370868997");//click();
		//Thread.sleep(1000);
		
		
		//Thread.sleep(10000);
		//driver.findElement(By.id("continue")).click();
		//driver.findElement(By.name("password")).sendKeys("Abhi@8484");
		
		driver.get("https://www.selenium.dev");
		//driver.findElement(By.xpath("//a[contains(@class,'webdriver')]")).click();			
		driver.findElement(By.xpath("//a[contains(@class,'webdriver') and contains(@class,'ide') and  contains(@class,'grid')]")).click();

}
}


