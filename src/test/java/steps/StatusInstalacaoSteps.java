package steps;

import io.cucumber.java.pt.Quando;
import pages.StatusInstalacaoPage;

public class StatusInstalacaoSteps {

	StatusInstalacaoPage statusInstalacao = new StatusInstalacaoPage();

	@Quando("clico em status de instalacao")
	public void clico_em_status_de_instalacao() {
		
		statusInstalacao.clicarStatusInstalacao();

	}
	
	@Quando("preencho os campos descricao e codigo")
	public void preencho_os_campos_descricao_e_codigo() {
		
		statusInstalacao.preencherDescricaoEcodigo();

	}
	
	// editar
	@Quando("informo o nome do status de instalacao")
	public void informo_o_nome_do_status_de_instalacao() {
		
		statusInstalacao.preencherDescricaoFiltro();

	}
	
	@Quando("altero o nome do status de instalacao")
	public void altero_o_nome_do_status_de_instalacao() {
		
		statusInstalacao.alterarNomeDescricao();

	}
	
	// excluir
	@Quando("informo o nome do status de instalacao editado")
	public void informo_o_nome_do_status_de_instalacao_editado() {
		
		statusInstalacao.preencherNomeEditado();

	}
	
	
	
	

	
}
