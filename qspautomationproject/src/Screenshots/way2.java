package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class way2 {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.selenium.dev");

	//way1
	RemoteWebDriver rw=(RemoteWebDriver)driver;
	File src =driver.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/selenium1.png");
	Files.copy(src, dest);
	driver.close();
	
}
}
