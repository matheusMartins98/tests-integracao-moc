package steps;

import io.cucumber.java.pt.Quando;
import pages.LotesPage;

public class LotesSteps {

	LotesPage lotes = new LotesPage();

	@Quando("clico em lotes")
	public void clico_em_lotes() throws InterruptedException {

		lotes.clicarLotes();

	}

	@Quando("preencho os campos nome e descrição")
	public void preencho_os_campos_nome_e_descrição() {

		lotes.preencherNomeLote();
		lotes.preencherDescricao();

	}

	@Quando("informo o nome do lote")
	public void informo_o_nome_do_lote() {

		lotes.informarNomeLote();
	}

	@Quando("altero o nome do lote")
	public void altero_o_nome_do_lote() {
		
		lotes.alterarNomeLote();

	}

	@Quando("informo o nome do lote editado")
	public void informo_o_nome_do_lote_editado() {
		
		lotes.informarNomeLoteEditado();

	}

}
