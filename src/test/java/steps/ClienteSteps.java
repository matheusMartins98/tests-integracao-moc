package steps;

import io.cucumber.java.pt.Quando;
import pages.ClientePage;

public class ClienteSteps {

	ClientePage cliente = new ClientePage();

	@Quando("seleciono a opcao cliente")
	public void seleciono_a_opcao_cliente() {

		cliente.opcClientes();

	}

	// cadastro
	@Quando("preencho os campos nome contrato registro e chaveExternal1 (.*) (.*) (.*) (.*)$")
	public void preencho_os_campos_nome_contrato_registro_e_chaveExternal1(String nome, String contrato, String registro, String chaveExterna1) {

		cliente.preencherCampos(nome, contrato, registro);
		cliente.clicarOpcoes(chaveExterna1);

	}

	// edição
	@Quando("informo o nome do cliente")
	public void informo_o_nome_do_cliente() {

		cliente.preencherNomeFiltro();

	}

	@Quando("altero o nome do cliente")
	public void altero_o_nome_do_cliente() {

		cliente.inserirNovoNome();

	}

	// exclusão
	@Quando("informo o nome do cliente editado")
	public void informo_o_nome_do_cliente_editado() {

		cliente.InserirNomeEditado();

	}

}
