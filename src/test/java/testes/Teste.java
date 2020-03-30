package testes;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;

import PageObjectTDD.CadastroComSucesso;
import PageObjectTDD.Drive;

public class Teste {

	public WebDriver driver;

	@Before
	public void Abrir() {
		new Drive();
		driver = Drive.AbrirNavegador();
	}
//	@Test
//	public void EntrarNaTelaDeLoginComSucesso() throws Exception {
//		new Login();
//		Login.EntrarTelaLogin(driver);
//		Login.PreencherLoginComSucesso(driver);
//		Login.FazerLoginComSucesso(driver);
//		Login.Sair(driver);
//		
//	}
//	@Test
//	public void EntrarNaTelaDeLoginSemSucesso() throws Exception {
//		new Login();
//		Login.EntrarTelaLogin(driver);
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		Login.PreencherLoginSemSucesso(driver);
//		Login.FazerLoginSemSucesso(driver);
//		Login.Sair(driver);
//	}
	@Test
	public void EntrarNaTelaDeCadastroComSucesso() throws Exception {
		new CadastroComSucesso();
		CadastroComSucesso.AbrirLink(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		CadastroComSucesso.DetalhesDaConta(driver);
		

	
	}


//	@Test
//	public void RealizarCadastro() throws InterruptedException {
//		new CadastroComSucesso().AbrirMenuUserEIniciarCadastroPositivo(driver);
//	}
//
////	@ParameterizedTest
////	@ValueSource(strings = {"Cadastro02,","Cadastro02"})
////	public void palindromes(String user, String password) {
////	    //assertTrue(StringUtils.isPalindrome(candidate));
////	}
//
//	@Test
//	public void ClickProduto() {
//		new PesquisarPorClick();
//		// driver = PesquisarPorClick.ClicarCampoPesquisa();
//		PesquisarPorClick.ClicarCampoPesquisa(driver);
//	}
//
//	@Test
//	public void PesquisarComLupa() {
//		new stepsPostivo.PesquisaLupa();
//		PesquisaLupa.ClicarCampoPesquisa(driver);
//	}

}
