package PageObjectTDD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PesquisaLupa { 
	public WebDriver driver;

	public static WebDriver ClicarCampoPesquisa(WebDriver driver) {
		driver.findElement(By.id("search")).click();
		driver.findElement(By.id("autoComplete")).sendKeys("Speakers", Keys.RETURN);
		
//		WebElement element = driver.findElement(By.xpath("//span[@class='roboto-regular ng-binding']"));
//		String login = element.getText();
//		Assert.assertEquals("SPEAKERS", login);
		return driver;	
	}
	public static void Sair(WebDriver driver) {
		driver.close();
	}
}
