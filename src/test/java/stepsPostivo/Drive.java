package stepsPostivo;
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drive {
	public WebDriver driver; 

	public static WebDriver AbrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		driver.get("https://www.advantageonlineshopping.com/#/");
		return driver;
	}

	
}
