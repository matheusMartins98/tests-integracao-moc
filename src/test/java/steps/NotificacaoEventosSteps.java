package steps;

import io.cucumber.java.pt.Quando;
import pages.NotificacaoEventosPage;

public class NotificacaoEventosSteps {

	NotificacaoEventosPage notificacaoEventos = new NotificacaoEventosPage();

	@Quando("clico em notificação de eventos")
	public void clico_em_notificação_de_eventos() throws InterruptedException {

		notificacaoEventos.clicarNotificacaoEventos();

	}

	@Quando("preencho os campos nome, controlador, tipo de alarme, subitipo de alarme e usuario")
	public void preencho_os_campos_nome_controlador_tipo_de_alarme_subitipo_de_alarme_e_usuario()
			throws InterruptedException {

		notificacaoEventos.preencherNome();
		notificacaoEventos.selecionarControlador();
		notificacaoEventos.tipoAlarme();
		notificacaoEventos.subTipoAlarme();
		notificacaoEventos.selecionarUsuario();
		notificacaoEventos.clicarNotificacao();

	}

	@Quando("informo o nome da notificação de eventos")
	public void informo_o_nome_da_notificação_de_eventos() {

		notificacaoEventos.informarNomeNotificacao();

	}

	@Quando("altero o nome da notificação de eventos")
	public void altero_o_nome_da_notificação_de_eventos() {

		notificacaoEventos.alterarNomeNotificacao();

	}

	@Quando("informo o nome da notificação de eventos editado")
	public void informo_o_nome_da_notificação_de_eventos_editado() {

		notificacaoEventos.informarNomeNotificacaoEditado();

	}

}
