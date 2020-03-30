package PageObjectTDD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PesquisaInexistenteComLupa { 
	public WebDriver driver;
	
	public static WebDriver ClicarCampoPesquisaComItensInexistente(WebDriver driver) {
		driver.findElement(By.id("search")).click();
		driver.findElement(By.id("autoComplete")).sendKeys("smartphone", Keys.RETURN);
		
//		WebElement elementNoResults = driver.findElement(By.xpath("//*[@id=\"searchPage\"]/div[3]/div/label/span"));
//		String mensagem = elementNoResults.getText();
//		Assert.assertEquals("No results for \"smartphone\"", mensagem);
		return driver;
		 
	}
	public static void Sair(WebDriver driver) {
		driver.close();
	}
}
