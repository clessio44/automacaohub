package testes;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import PageObjectTDD.CadastroComSucesso;
import PageObjectTDD.CadastroSemSucesso;
import PageObjectTDD.Drive;
import PageObjectTDD.ExtentReport;
import PageObjectTDD.Login;
import PageObjectTDD.PesquisaInexistenteComLupa;
import PageObjectTDD.PesquisaInexistentePorClick;
import PageObjectTDD.PesquisaLupa;
import PageObjectTDD.PesquisarPorClick;

public class TestNG {
	
	private static final String testName = null;
	public static ExtentTest test;
	public WebDriver driver;
	
	
	@BeforeSuite
	public void extent() {
		new ExtentReport();
		ExtentReport.ConfigurationReport("Login");
	}
	 @BeforeMethod 
	  public void Abrir() {
				new Drive();
				driver = Drive.AbrirNavegador();
	  }
	
	@Test(priority = 0)
	public void EntrarNaTelaDeLoginComSucesso() throws Exception {
		new Login();
		Login.EntrarTelaLogin(driver);
		Login.PreencherLoginComSucesso(driver);
		Login.FazerLoginComSucesso(driver);
		Login.Sair(driver);
	}
	@Test(priority = 1)
	public void EntrarNaTelaDeLoginSemSucesso() throws Exception {
		new Login();
		Login.EntrarTelaLogin(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Login.PreencherLoginSemSucesso(driver);
		Login.FazerLoginSemSucesso(driver);
		Login.Sair(driver);
	}
	@Test(priority = 2)//(enabled = false)
	public void EntrarNaTelaDeCadastroComSucesso() throws Exception {
		new CadastroComSucesso();
		CadastroComSucesso.AbrirLink(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		CadastroComSucesso.DetalhesDaConta(driver);
		CadastroComSucesso.PersonalDetails(driver);
		CadastroComSucesso.Address(driver);
		CadastroComSucesso.check(driver);
		CadastroComSucesso.Sair(driver);
	}
	@Test(priority = 3)//(enabled = false)
	public void TelaCadastroComDadosInvalidos() throws Exception {
		new CadastroComSucesso();
		CadastroSemSucesso.AbrirLink(driver);
		CadastroSemSucesso.DetalhesDaContaComDadosInvalidos(driver);
		CadastroSemSucesso.PersonalDetailsComDadosInvalidos(driver);
		CadastroSemSucesso.AddressComDadosInvalidos(driver);
		CadastroSemSucesso.check(driver);
		CadastroSemSucesso.Sair(driver);
	}
	@Test(priority = 4)//(enabled = false)
	public void ClickProduto() {
		new PesquisarPorClick();
		// driver = PesquisarPorClick.ClicarCampoPesquisa();
		PesquisarPorClick.ClicarCampoPesquisa(driver);
		PesquisarPorClick.Sair(driver);
	}
	@Test(priority = 5)//(enabled = false)
	public void PesquisaDeItensInexistentesPorClick() {
		new PesquisaInexistentePorClick();
		PesquisaInexistentePorClick.ClicarCampoPesquisa(driver);
		PesquisaInexistentePorClick.Sair(driver);
	}
	@Test(priority = 6)
	public void PesquisarComLupa() {
		new PesquisaLupa();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		PesquisaLupa.ClicarCampoPesquisa(driver);
		PesquisaLupa.Sair(driver);
	}
	@Test(priority = 7)
	public void PesquisarComItensInexistentesComLupa() {
		new PesquisaInexistenteComLupa();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		PesquisaInexistenteComLupa.ClicarCampoPesquisaComItensInexistente(driver);
		PesquisaInexistenteComLupa.Sair(driver);
	}
	@AfterMethod
	public void reporting (ITestResult result) throws IOException{
		test = ExtentReport.ReportRelatorio(testName);
		ExtentReport.relatorioReport(test, result, driver);
		
	}
//	@AfterSuite
//	public void closereporting() {
//		ExtentReport
//	}
}
