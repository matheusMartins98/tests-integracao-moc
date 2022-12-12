package steps;

import io.cucumber.java.pt.Quando;
import pages.PrioridadeAlarmePage;

public class PrioridadeAlarmeSteps {
	
	PrioridadeAlarmePage prioridadeAlarme = new PrioridadeAlarmePage();

	@Quando("clico em eventos")
	public void clico_em_ventos() {

		prioridadeAlarme.clicarEventos();

	}
	
	@Quando("clico em prioridade de alarmes")
	public void clico_em_prioridade_de_alarmes() throws InterruptedException {
			
		prioridadeAlarme.clicarPrioridade();
	}
	
	@Quando("preencho os campos nivel e nome da prioridade")
	public void preencho_os_campos_nivel_e_nome_da_prioridade() {
			
		prioridadeAlarme.preencherNomeEprioridade();
		prioridadeAlarme.clicarSalvar();

	}
	
	@Quando("informo o nome da prioridade de alarmes")
	public void informo_o_nome_da_prioridade_de_alarmes() {
			
		
		prioridadeAlarme.selecionarNomePrioridade();
	}
	
	@Quando("altero o nome da prioridade de alarmes")
	public void altero_o_nome_da_prioridade_de_alarmes() {
		
		prioridadeAlarme.alterarNomePrioridade();
		prioridadeAlarme.clicarSalvar();

	}
	
	@Quando("informo o nome da prioridade de alarmes editado")
	public void informo_o_nome_da_prioridade_de_alarmes_editado() {
			
		prioridadeAlarme.informarNomePrioridadeEditado();

	}


	
}
