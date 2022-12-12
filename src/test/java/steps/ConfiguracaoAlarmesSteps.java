package steps;

import io.cucumber.java.pt.Quando;
import pages.ConfiguracaoAlarmesPage;

public class ConfiguracaoAlarmesSteps {
	
	ConfiguracaoAlarmesPage configuracaoAlarmes = new ConfiguracaoAlarmesPage();

	@Quando("clico em configuração de alarmes")
	public void clico_em_configuração_de_alarmes() throws InterruptedException {
		
		configuracaoAlarmes.clicarConfiguracaoAlarmes();

	}

	@Quando("seleciono o tipo e subtipo")
	public void seleciono_o_tipo_e_subtipo() {
		
		configuracaoAlarmes.selecionarTipo();
//		configuracaoAlarmes.selecionarSubTipo();

	}

	@Quando("altero a prioridade")
	public void altero_a_prioridade() {
		
		configuracaoAlarmes.selecionarPrioridade();

	}

	@Quando("valido que a troca foi realizada com sucesso")
	public void valido_que_a_troca_foi_realizada_com_sucesso() {

		configuracaoAlarmes.verTexto();
	}

}
