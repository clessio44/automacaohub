package PageObjectTDD;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroComSucesso {
	
	public static WebDriver driver;
	
	public static void AbrirLink(WebDriver driver) {
		driver.findElement(By.id("menuUser")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='create-new-account ng-scope']")));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).click();
		//driver.findElement(By.className("create-new-account ng-scope")).click();
	}
	
	public static void DetalhesDaConta(WebDriver driver) throws InterruptedException {
//		WebElement validacao = driver.findElement(By.xpath("//a[@class='create-new-account ng-scope']"));
//		String esperado = "CREATE NEW ACCOUNT";
//		Assert.assertEquals(esperado, validacao.getText());
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).click();
		String name = "Cadastro04";
		String email = "cadastro04@gmail.com";
		String password = "Cadastro04";
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("usernameRegisterPage")));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.name("usernameRegisterPage")).sendKeys(name);
		driver.findElement(By.name("emailRegisterPage")).sendKeys(email);
		driver.findElement(By.name("passwordRegisterPage")).sendKeys(password);
		driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys(password);
		
		JavascriptExecutor detalhes = (JavascriptExecutor)driver;
		detalhes.executeScript("window.scrollBy(0,100)");
	}
	 
	public static void PersonalDetails(WebDriver driver) {
		String name = "Cadastro04";
		String lastname = "LastCadastro";
		String phone = "11 99999999";
		
		driver.findElement(By.name("first_nameRegisterPage")).sendKeys(name);
		driver.findElement(By.name("last_nameRegisterPage")).sendKeys(lastname);
		driver.findElement(By.name("phone_numberRegisterPage")).sendKeys(phone);
		
		JavascriptExecutor personal = (JavascriptExecutor)driver;
		personal.executeScript("window.scrollBy(0,100)");
	}
	
	public static void Address(WebDriver driver) {
		
		String city = "Barueri";
		String rua = "Antonio Jo�o";
		String state = "S�o Paulo";
		String postalcode = "06226-230";
		
		WebElement element = driver.findElement(By.name("countryListboxRegisterPage"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Brazil");
		driver.findElement(By.name("cityRegisterPage")).sendKeys(city);
		driver.findElement(By.name("addressRegisterPage")).sendKeys(rua);
		driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys(state);
		driver.findElement(By.name("postal_codeRegisterPage")).sendKeys(postalcode);
		
		JavascriptExecutor address = (JavascriptExecutor)driver;
		address.executeScript("window.scrollBy(0,100)");
	}
	
	public static void check(WebDriver driver) throws InterruptedException {
				
		JavascriptExecutor enderecofinal = (JavascriptExecutor)driver;
		enderecofinal.executeScript("window.scrollBy(0,050)");
		
		driver.findElement(By.name("i_agree")).click();
		driver.findElement(By.id("register_btnundefined")).click();
		
		//element = driver.findElement(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']"));
		//String login = element.getText();
		//Assert.assertEquals(name, login);
	}
	public static void Sair(WebDriver driver) {
		driver.close();
	}
}
