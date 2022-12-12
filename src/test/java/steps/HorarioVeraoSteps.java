package steps;

import io.cucumber.java.pt.Quando;
import pages.HorarioVeraoPage;

public class HorarioVeraoSteps {
	
	HorarioVeraoPage horarioVerao = new HorarioVeraoPage();
	
	
	@Quando("clico em horario de verão")
	public void clico_em_horario_de_verão() throws InterruptedException {
		
		horarioVerao.clicarHorarioVerao();

	}
	
	@Quando("preencho o campo nome do horario")
	public void preencho_o_campo_nome_do_horario() {
		
		horarioVerao.preencherNomeHorario();
		
	}
	
	
	@Quando("informo o nome do horario de verão")
	public void informo_o_nome_do_horario_de_verão() {
		
		horarioVerao.informarNomeHorario();

	}
	
	@Quando("altero o nome do horario de verão")
	public void altero_o_nome_do_horario_de_verão() {
		
		horarioVerao.alterarNomeHorario();

	}
	
	@Quando("informo o nome do horario de verão editado")
	public void informo_o_nome_do_horario_de_verão_editado() {
		
		horarioVerao.informarNomeHorarioEditado();

	}
	
	
	
	
	
	


}
