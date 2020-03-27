package stepsNegativo;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PesquisaLupa {
	public WebDriver driver;

	public static WebDriver ClicarCampoPesquisa(WebDriver driver) {
		driver.findElement(By.id("search")).click();
		driver.findElement(By.id("autoComplete")).sendKeys("smartphone", Keys.RETURN);
		
		WebElement elementNoResults = driver.findElement(By.xpath("//*[@id=\"searchPage\"]/div[3]/div/label/span"));
		String mensagem = elementNoResults.getText();
		Assert.assertEquals("No results for \"smartphone\"", mensagem);
		return driver;
		
	}
}
