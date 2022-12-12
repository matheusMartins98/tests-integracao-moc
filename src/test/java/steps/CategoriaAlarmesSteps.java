package steps;

import io.cucumber.java.pt.Quando;
import pages.CategoriaAlarmesPage;

public class CategoriaAlarmesSteps {

	CategoriaAlarmesPage categoriaAlarmes = new CategoriaAlarmesPage();

	@Quando("clico em categoria de alarmes")
	public void clico_em_categoria_de_alarmes() throws InterruptedException {

		categoriaAlarmes.clicarCategoria();

	}

	@Quando("preencho o campo descrição")
	public void preencho_o_campo_descrição() {

		categoriaAlarmes.preencherDescricao();

	}

	@Quando("informo o nome da categoria de alarmes")
	public void informo_o_nome_da_categoria_de_alarmes() {

		categoriaAlarmes.informarNomeCategoria();

	}

	@Quando("altero o nome da categoria de alarmes")
	public void altero_o_nome_da_categoria_de_alarmes() {

		categoriaAlarmes.alterarNomeCategoria();

	}

	@Quando("informo o nome da categoria de alarmes editado")
	public void informo_o_nome_da_categoria_de_alarmes_editado() {

		categoriaAlarmes.informarNomeCategoriaEditada();

	}

}
