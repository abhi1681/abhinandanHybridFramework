package Loginandlogout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameAttributeLoginLogout {

	

	private static final CharSequence KeysENTER = null;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");//opening HOME PAGE
	
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("1234");
driver.findElement(By.name("Submit")).click();
	//driver.findElement(By.className("btnLogin")).click();
driver.findElement(By.tagName("input")).sendKeys("Admin12");
Thread.sleep(10000);

//FACEBOOK




driver.get("https://Facebook.com");//opening HOME PAGE

driver.findElement(By.name("email")).sendKeys("Admin");
driver.findElement(By.name("pass")).sendKeys("1234");
driver.findElement(By.name("login")).click();
driver.findElement(By.className("_39g9")).click();
driver.findElement(By.className("_97w4")).click();
Thread.sleep(4000);
driver.findElement(By.name("email")).sendKeys("8484884010");
//driver.findElement(By.name("did_submit5")).click();
//driver.findElement(By.className("btnLogin")).click();
driver.close();
//driver.switchTo().activeElement().sendKeys("java",KeysENTER);


}

	public static CharSequence getKeysenter() {
		return KeysENTER;
	}
}