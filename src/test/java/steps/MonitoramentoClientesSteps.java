package steps;

import io.cucumber.java.pt.Quando;
import pages.MonitoramentoClientesPage;

public class MonitoramentoClientesSteps {
	
	
	MonitoramentoClientesPage monitoramentoClientes = new MonitoramentoClientesPage();

	@Quando("clico em monitoramento de clientes")
	public void clico_em_monitoramento_de_clientes() throws InterruptedException {
		
		monitoramentoClientes.clicarMonitoramentoClientes();

	}
	
	@Quando("seleciono a atividade")
	public void seleciono_a_atividade() {
		
		monitoramentoClientes.selecionarAtividade();

	}

	@Quando("seleciono o registro")
	public void seleciono_o_registro() {
		
		monitoramentoClientes.marcarRegistros();

	}

	@Quando("clico em marcar monitoramento")
	public void clico_em_marcar_monitoramento() {
		
		monitoramentoClientes.btnMarcarMonitoramento();

	}

	@Quando("clico na opção somente clientes monitorados")
	public void clico_na_opção_somente_clientes_monitorados() {
		
		monitoramentoClientes.opcClientesMonitorados();

	}

	@Quando("clico no botão desmarcar monitoramento")
	public void clico_no_botão_desmarcar_monitoramento() {
		
		monitoramentoClientes.btnDesmarcarMonitoramento();

	}

	@Quando("clico na opção somente clientes não monitorados")
	public void clico_na_opção_somente_clientes_não_monitorados() {

		monitoramentoClientes.opcClientesNaoMonitorados();
	}

}
