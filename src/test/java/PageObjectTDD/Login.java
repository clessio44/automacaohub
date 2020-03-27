package PageObjectTDD;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login { 

	public static WebDriver driver; 
	
	public static void EntrarTelaLogin(WebDriver driver) {
		
		driver.findElement(By.id("menuUserLink")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public static void PreencherLoginComSucesso(WebDriver driver) throws Exception { 

		XSSFWorkbook src = new XSSFWorkbook("src/test/resources/TestData.xlsx");
		XSSFSheet st = src.getSheetAt(0);
		
		String data0 = st.getRow(1).getCell(0).getStringCellValue();
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(data0);
		
		String data01 = st.getRow(1).getCell(1).getStringCellValue();
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(data01);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		src.close();
	}
	
	public static void FazerLoginComSucesso(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("sign_in_btnundefined")).click();
	}
	public static void PreencherLoginSemSucesso(WebDriver driver) throws Exception { 
		
		XSSFWorkbook src = new XSSFWorkbook("src/test/resources/TestData.xlsx");
		XSSFSheet st = src.getSheetAt(0);
		
		String data2 = st.getRow(2).getCell(1).getStringCellValue();
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(data2);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String data03 = st.getRow(2).getCell(1).getStringCellValue();
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(data03);
		
		
		src.close();	
	}
	
	public static void FazerLoginSemSucesso(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("sign_in_btnundefined")).click();
	}
	
	public static void Sair(WebDriver driver) {
		driver.close();
	}
}
