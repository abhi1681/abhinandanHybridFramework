package ScenariosAssignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ga {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?hl=en-GB&passive=true&continue=http%3A%2F%2Fsupport.google.com%2Faccounts%2Fanswer%2F7675428%3Fhl%3Den-GB&ec=GAZAdQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//login to gmail with correct cred
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("bopalkarabhi32@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='Learn more']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[target='_top']")).click();
		
//		driver.findElement(By.name("//input[id='identifierId']")).
		//driver.findElement(By.xpath("//span[.='Next']")).click();
		//driver.findElement(By.name("//input[@type='password']")).sendKeys("rohan@1996");
		//Thread.sleep(4000);
		//driver.close();
	}

}