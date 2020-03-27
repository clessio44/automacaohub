package stepsNegativo;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroSemSucesso {
	
	public WebDriver driver;
	
	public void AbrirMenuUserEIniciarCadastroDadosInvalidos(WebDriver driver) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		String name = "aaaaaaaaaaaaaaaa";
		String user = "aaaaaaaaaaaaaaaaaaaa";
		String lastname = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		String email = "---------------------------";
		String password = "aaaaaaaaaaaa";
		String confirmpassword = "333";
		String phone = "1234567890asdfghjklçz";
		String city = "Barueri Barueri Barueri Barueri ";
		String rua = "Antonio João";
		String state = "São Paulo";
		String postalcode = "asdfghjkkkklç";
		
		driver.findElement(By.id("menuUserLink")).click();
	
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='create-new-account ng-scope']")));
		
		driver.findElement(By.xpath("//a[@class='create-new-account ng-scope']")).click();
			WebElement validacao = driver.findElement(By.xpath("//a[@class='create-new-account ng-scope']"));
			String esperado = "CREATE NEW ACCOUNT";
			Assert.assertEquals(esperado, validacao.getText());
			driver.findElement(By.xpath("//a[@class='create-new-account ng-scope']")).click();
		
		driver.findElement(By.xpath("//input[@name='usernameRegisterPage']")).sendKeys(user);
//			WebElement uservalidar = driver.findElement(By.xpath("//label[@class='animated invalid']"));
//			String textUser = "Use maximum 15 character";
//			Assert.assertEquals(textUser, uservalidar.getText());
			driver.findElement(By.xpath("//div[@id='formCover']//div[1]//div[1]//sec-view[2]//div[1]")).click();
			
		driver.findElement(By.name("emailRegisterPage")).sendKeys(email);
			
//			WebElement emailvalidar = driver.findElement(By.xpath("//label[contains(text(),'Email field is required')]"));
//			String textemail = "Email field is required";
//			Assert.assertEquals(textemail, emailvalidar.getText());
//			driver.findElement(By.xpath("//label[contains(text(),'Email field is required')]")).click();
				
		driver.findElement(By.name("passwordRegisterPage")).sendKeys(password);
//			WebElement senhavalidar = driver.findElement(By.xpath("//label[contains(text(),'Password field is required')]"));
//			String textsenha = "Password field is required";
//			Assert.assertEquals(textsenha, senhavalidar.getText());
//			//driver.findElement(By.xpath("//font[contains(text(),'O campo senha é obrigatório')]")).click();
			
		driver.findElement(By.xpath("//input[@name='confirm_passwordRegisterPage']")).sendKeys(confirmpassword);
//			WebElement senhavalidar2 = driver.findElement(By.xpath("//label[contains(text(),'Confirm password field is required')]"));
//			String textsenha2 = "Confirm password field is required";
//			Assert.assertEquals(textsenha2, senhavalidar2.getText());
//			//driver.findElement(By.xpath("//font[contains(text(),'O campo Confirmar Senha é obrigatório')]")).click();
//		
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
		
		WebElement validacao4 = driver.findElement(By.xpath("//label[contains(text(),'Use maximum 10 character')]"));
		String esperado4 = "Use maximum 10 character";
		Assert.assertEquals(esperado4, validacao4.getText());
		
		
//		element = driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[3]/sec-view/div/label"));
//		String login = element.getText();
//		Assert.assertEquals(name, login);
		
		
		
	}
}
