package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CadastroPage;
import pages.LoginPage;

public class CadastrarControladorSteps {

	LoginPage login = new LoginPage();
	CadastroPage cadastro = new CadastroPage();

	
	@Dado("que eu acesse o Residencial Smart")
	public void que_eu_acesse_o_Residencial_Smart() {

	}

	@Quando("informo o usuario e senha")
	public void informo_o_usuario_e_senha() {
		login.inserirUsuario();

	}

	@Quando("realizo o login com sucesso")
	public void realizo_o_login_com_sucesso() {

	}

	@Quando("clico em cadastros")
	public void clico_em_cadastros() throws InterruptedException {

		cadastro.clicarCadastro();
		

	}

	@Quando("clico em Negocios")
	public void clico_em_Negocios() {

		cadastro.clicarNegocios();

	}

	@Entao("seleciono a opcao controlador")
	public void seleciono_a_opcao_controlador() throws InterruptedException {

		cadastro.opcaoControlador();

	}

	@Quando("clico no botao adicionar")
	public void clico_no_botao_adicionar() {

		cadastro.adicionar();

	}

	
	@Quando("preencho as informacoes do registro (.*) (.*)$")
	public void preencho_as_informacoes_do_registro_nome_identificacao(String nome, String identificacao) {
		
		cadastro.incluirRegistro(nome, identificacao);
	}

	@Quando("clico no botao salvar")
	public void clico_no_botao_salvar() {

		cadastro.salvar();
	}

	@Quando("valido que o registro foi criado com sucesso")
	public void valido_que_o_registro_foi_criado_com_sucesso() {

		cadastro.validarMensagem();

	}

	@Entao("finalizo o cadastro")
	public void finalizo_o_cadastro() {
			

		
	}
	

	
}