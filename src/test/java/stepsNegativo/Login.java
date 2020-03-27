package stepsNegativo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	public static WebDriver driver;
	public static WebElement element;

	public static void FazerLogin(WebDriver driver) {
		String name = "aaaaaaaaaaaaaaaa";
		String password = "aaaaaaaaaaaa";
		
		driver.findElement(By.id("menuUserLink")).click();
		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("sign_in_btnundefined")).click();
		
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("signInResultMessage")));
		
		
		
	}
	
	
}
