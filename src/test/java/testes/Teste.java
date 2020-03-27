package testes;

import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;

import stepsPostivo.CadastroComSucesso;
import stepsPostivo.Drive;
import stepsPostivo.Login;
import stepsPostivo.PesquisaLupa;
import stepsPostivo.PesquisarPorClick;

public class Teste {

	public WebDriver driver;

	@Before
	public void Abrir() {
		new Drive();
		driver = Drive.AbrirNavegador();

	}

	@Test
	public void FazerLogin() throws Exception {
		new Login();
		Login.FazerLogin(driver);
//		Login.FazerLogin(name, password, driver);
	}

	@Test
	public void RealizarCadastro() throws InterruptedException {
		new CadastroComSucesso().AbrirMenuUserEIniciarCadastroPositivo(driver);
	}

//	@ParameterizedTest
//	@ValueSource(strings = {"Cadastro02,","Cadastro02"})
//	public void palindromes(String user, String password) {
//	    //assertTrue(StringUtils.isPalindrome(candidate));
//	}

	@Test
	public void ClickProduto() {
		new PesquisarPorClick();
		// driver = PesquisarPorClick.ClicarCampoPesquisa();
		PesquisarPorClick.ClicarCampoPesquisa(driver);
	}

	@Test
	public void PesquisarComLupa() {
		new stepsPostivo.PesquisaLupa();
		PesquisaLupa.ClicarCampoPesquisa(driver);
	}

}
