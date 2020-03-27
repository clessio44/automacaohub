package stepsPostivo;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilizandoExcel.ExcelUtils;

public class Login { 

	public static WebDriver driver; 

	public static void FazerLogin(WebDriver driver) throws Exception { 
		driver.findElement(By.id("menuUserLink")).click();
		ExcelUtils.setExcelFile(ExcelUtils.Path_TestData + ExcelUtils.File_TestData, "Sheet1"); 
		//driver.findElement(By.id("menuUserLink")).click();
		int linha = 0;
		int coluna = 0; 
		String name = ExcelUtils.getCellData(linha, coluna);
		driver.findElement(By.name("username")).sendKeys(name);
		linha = 1;
		String password = ExcelUtils.getCellData(linha, coluna);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("sign_in_btnundefined")).click();
		
		
//		driver.findElement(By.id("menuUserLink")).click();
//		driver.findElement(By.name("username")).sendKeys(name);
//		driver.findElement(By.name("password")).sendKeys(password);
//		driver.findElement(By.id("sign_in_btnundefined")).click();

//		WebElement element = driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]"));
//		String loginOk = element.getText();
//		Assert.assertEquals(element, loginOk);

		WebElement element = driver.findElement(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']"));
		String login = element.getText();
		Assert.assertEquals(name, login);

	}



}
