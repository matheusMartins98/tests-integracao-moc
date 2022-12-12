package steps;

import io.cucumber.java.pt.Quando;
import pages.InibicaoEventosPage;

public class InibicaoEventosSteps {

	InibicaoEventosPage inibicaoEventos = new InibicaoEventosPage();

	@Quando("clico em inibição de eventos")
	public void clico_em_inibição_de_eventos() throws InterruptedException {

		inibicaoEventos.clicarInibicaoEventos();

	}

	@Quando("seleciono os campos Controlador, Tipo de alarme, Subtipo de alarme e data")
	public void seleciono_os_campos_Controlador_Tipo_de_alarme_Subtipo_de_alarme_e_data() {

		inibicaoEventos.selecionarControlador();
		inibicaoEventos.selecionarTipoAlarme();
		inibicaoEventos.selecionarSubTipoAlarme();
		inibicaoEventos.selecionarPeriodo();

	}

	@Quando("seleciono o alvo e o controlador")
	public void seleciono_o_alvo_e_o_controlador() {

		inibicaoEventos.selecionarAlvo();
		inibicaoEventos.selecionarControladorFiltro();

	}

	@Quando("altero o subtipo de alarme")
	public void altero_o_subtipo_de_alarme() {

		inibicaoEventos.alterarSubtipoAlarme();

	}

	@Quando("seleciono o controlador editado")
	public void seleciono_o_controlador_editado() {

		inibicaoEventos.selecionarAlvo();
		inibicaoEventos.selecionarControladorFiltro();

	}

}
