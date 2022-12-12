package steps;

import io.cucumber.java.pt.Quando;
import pages.FeriadosPage;

public class FeriadoSteps {

	FeriadosPage feriados = new FeriadosPage();
	
	// Salvar cadastro
	@Quando("clico em faturamento e tarifas")
	public void clico_em_faturamento_e_tarifas() {
		
		feriados.clicarFaturamentoTarifas();

	}

	@Quando("clico em feriados")
	public void clico_em_feriados() throws InterruptedException {
		
		feriados.clicarOpcFeriados();

	}

	@Quando("preencho o campo nome do feriado")
	public void preencho_o_campo_nome_do_feriado() throws Exception {
		
		feriados.preencherNomeFeriado();

	}

	// Editar cadastro
	@Quando("informo o nome do feriado")
	public void informo_o_nome_do_feriado() throws Exception {
		
		feriados.informarNomeFeriado();

	}

	@Quando("altero o nome do feriado")
	public void altero_o_nome_do_feriado() {
		
		feriados.alterarNomeFeriado();
		

	}
	
	// Excluir cadastro
	@Quando("informo o nome do feriado editado")
	public void informo_o_nome_do_feriado_editado() {
		
		feriados.informarNomeFeriadoEditado();
	}
	
	 
}
