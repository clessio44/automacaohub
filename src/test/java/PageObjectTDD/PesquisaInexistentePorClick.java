package PageObjectTDD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PesquisaInexistentePorClick {
	
	public static WebElement element = null;
	public static WebDriver driver;
	 
	public static WebDriver ClicarCampoPesquisa(WebDriver driver)  {
		
		List<WebElement> elements = driver.findElements(By.id("our_products"));
		
		for (WebElement objCurrentLink : elements) {
			String strLinkText = objCurrentLink.getText();
			
			
		if(objCurrentLink.getText().equals(strLinkText));
			System.out.println("Produtos existentes: " + strLinkText);
		}

		return driver;
	
	}
	public static void Sair(WebDriver driver) {
		driver.close();
	}

}
