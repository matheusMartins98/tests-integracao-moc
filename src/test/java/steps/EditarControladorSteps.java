package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CadastroPage;

public class EditarControladorSteps extends CadastroPage {

	CadastroPage cadastro = new CadastroPage();

	
	@Quando("clico em filtros")
	public void clico_em_filtross() {

		clicarFiltro();

	}

	@Quando("informo o nome do controlador cadastrado")
	public void informo_o_nome_do_controlador_cadastrado() {

		nomeControlador();
		pesquisar();
	}

	@Quando("clico no botão editar")
	public void clico_no_botão_editarr() {

		editar();

	}

	@Quando("altero o nome do controladorr")
	public void altero_o_nome_do_controladorr() {

		alterarNomeControlador();

	}

	@Quando("clico no botão salvarr")
	public void clico_no_botão_salvarr() {

		salvar();
	}

	@Quando("valido que o nome do controlador foi editado com sucesso")
	public void valido_que_o_nome_do_controlador_foi_editado_com_sucesso() {

		pesquisarNovoNome();
	}

	@Entao("finalizo a edicao")
	public void finalizo_a_edicao() {

		validarMensagem();

	}
}
