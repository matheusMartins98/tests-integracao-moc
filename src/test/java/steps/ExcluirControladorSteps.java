package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CadastroPage;

public class ExcluirControladorSteps extends CadastroPage {
	
	@Quando("informo o nome do controlador")
	public void informo_o_nome_do_controlador_editado_teste() {
		
		pesquisarNovoNome();
	}
	
	@Quando("clico no botão deletar")
	public void clico_no_botão_deletar() {
	   
		deletar();
	}

	@Quando("clico no botão sim")
	public void clico_no_botão_sim() {
		opcaoSim();
	}

	@Entao("valido que o controlador foi excluido com sucesso")
	public void valido_que_o_controlador_foi_excluido_com_sucesso() {
		
	   validarMensagem();
	   
	}

}





