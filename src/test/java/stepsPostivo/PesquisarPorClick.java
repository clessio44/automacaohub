package stepsPostivo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PesquisarPorClick {
	
	public static WebElement element = null;
	public static WebDriver driver;
	
	public static WebDriver ClicarCampoPesquisa(WebDriver driver)  {
		driver.findElement(By.id("tabletsImg")).click();
		element = driver.findElement(By.xpath("//a[contains(@class,'titleItemsCount ng-binding')]"));
		String login = element.getText();
		Assert.assertEquals("3 ITEMS", login);
		return driver;
	
	}

}
