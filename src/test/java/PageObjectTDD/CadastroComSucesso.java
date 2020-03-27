package PageObjectTDD;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroComSucesso {
	
	public WebDriver driver;
	
	public void AbrirMenuUserEIniciarCadastroPositivo(WebDriver driver) throws InterruptedException {
		
		
		String name = "Cadastro04";
		String lastname = "Usuario";
		String email = "cadastro04@gmail.com";
		String password = "Cadastro04";
		String phone = "11 99999999";
		String city = "Barueri";
		String rua = "Antonio João";
		String state = "São Paulo";
		String postalcode = "06226-230";
		 
		
		driver.findElement(By.id("menuUserLink")).click();
	
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='create-new-account ng-scope']")));
		
		driver.findElement(By.xpath("//a[@class='create-new-account ng-scope']")).click();
		WebElement validacao = driver.findElement(By.xpath("//a[@class='create-new-account ng-scope']"));
		String esperado = "CREATE NEW ACCOUNT";
		Assert.assertEquals(esperado, validacao.getText());
		driver.findElement(By.xpath("//a[@class='create-new-account ng-scope']")).click();
	
		driver.findElement(By.name("usernameRegisterPage")).sendKeys(name);
		driver.findElement(By.name("emailRegisterPage")).sendKeys(email);
		driver.findElement(By.name("passwordRegisterPage")).sendKeys(password);
		driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys(password);
		
		JavascriptExecutor senha = (JavascriptExecutor)driver;
		senha.executeScript("window.scrollBy(0,200)");
		
		driver.findElement(By.name("first_nameRegisterPage")).sendKeys(name);
		driver.findElement(By.name("last_nameRegisterPage")).sendKeys(lastname);
		driver.findElement(By.name("phone_numberRegisterPage")).sendKeys(phone);
		
		JavascriptExecutor fone = (JavascriptExecutor)driver;
		fone.executeScript("window.scrollBy(0,200)");
		
		WebElement element = driver.findElement(By.name("countryListboxRegisterPage"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Brazil");
		
		driver.findElement(By.name("cityRegisterPage")).sendKeys(city);
		
		JavascriptExecutor endereco = (JavascriptExecutor)driver;
		endereco.executeScript("window.scrollBy(0,300)");
		
		driver.findElement(By.name("addressRegisterPage")).sendKeys(rua);
		driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys(state);
		driver.findElement(By.name("postal_codeRegisterPage")).sendKeys(postalcode);
		
		JavascriptExecutor enderecofinal = (JavascriptExecutor)driver;
		enderecofinal.executeScript("window.scrollBy(0,050)");
		
		driver.findElement(By.name("i_agree")).click();
		driver.findElement(By.id("register_btnundefined")).click();
		
		
		element = driver.findElement(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']"));
		String login = element.getText();
		Assert.assertEquals(name, login);
		
	}
}
