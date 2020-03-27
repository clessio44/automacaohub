package testes;	

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import stepsNegativo.CadastroSemSucesso;
import stepsNegativo.Driver;
import stepsNegativo.Login;
import stepsNegativo.PesquisaLupa;
import stepsNegativo.PesquisarPorClick;
import stepsPostivo.Drive;

public class TesteNegativo {

	public WebDriver driver;

	@Before
	public void Abrir() {
		new Drive();
		driver = Driver.AbrirNavegador();
	}
	@Test
	public void RealizarCadastro() throws InterruptedException {
		new CadastroSemSucesso().AbrirMenuUserEIniciarCadastroDadosInvalidos(driver);
	}
	@Test
	public void FazerLogin() throws InterruptedException {
		new Login();
		Login.FazerLogin(driver);
		
	}
	@Test
	public void ClickProduto() {
		new PesquisarPorClick();
		//driver = PesquisarPorClick.ClicarCampoPesquisa();
		PesquisarPorClick.ClicarCampoPesquisa(driver);
	}
	@Test
	public void PesquisarComLupa() {
		new stepsPostivo.PesquisaLupa();
		PesquisaLupa.ClicarCampoPesquisa(driver);
	}
}
