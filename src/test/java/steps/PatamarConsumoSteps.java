package steps;

import io.cucumber.java.pt.Dado;
import pages.PatamarConsumoPage;

public class PatamarConsumoSteps {

	PatamarConsumoPage patamarConsumo = new PatamarConsumoPage();

	// salvar
	@Dado("clico em patamar de consumo")
	public void clico_em_patamar_de_consumo() {

		patamarConsumo.clicarEmPatamarConsumo();

	}

	@Dado("preencho os campos nome do patamar e limite superior (.*) (.*)$")
	public void preencho_os_campos_nome_do_patamar_e_limite_superior(String nomePatamar, String limiteSuperior) {

		patamarConsumo.preencherNomePatamar(nomePatamar, limiteSuperior);

	}

	// editar
	@Dado("seleciono o patamar de consumo")
	public void seleciono_o_patamar_de_consumo() {

		patamarConsumo.clicarEmPatamarConsumo();
	}

	@Dado("altero o nome do patamar de consumo")
	public void altero_o_nome_do_patamar_de_consumo() {

		patamarConsumo.alterarNomePatamar();

	}

	// excluir
	@Dado("seleciono o patamar de consumo editado")
	public void seleciono_o_patamar_de_consumo_editado() {

		patamarConsumo.clicarNomeEditado();
	}

}
