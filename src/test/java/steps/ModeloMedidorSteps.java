package steps;

import io.cucumber.java.pt.Quando;
import pages.CadastroPage;
import pages.ModeloMedidorPage;

public class ModeloMedidorSteps {
	
	ModeloMedidorPage modeloMedidor = new ModeloMedidorPage();
	CadastroPage cadastro = new CadastroPage();
	
	//salvar
	@Quando("clico em adicionais ao negocio")
	public void clico_em_adicionais_ao_negocio() {

		modeloMedidor.clicarAdicionaisNegocios();
	}
	
	@Quando("clico em modelo do medidor")
	public void clico_em_modelo_do_medidor() {

		modeloMedidor.clicarModeloMedidor();
	}
	
	@Quando("preencho os campos nome, protocolo e fabricante")
	public void preencho_os_campos_nome_protocolo_e_fabricante() {

		modeloMedidor.preencherNome();
		modeloMedidor.EscolherProtocolo();
		modeloMedidor.EscolherFabricante();
	}
	
	//editar
	@Quando("informo o nome do medidor")
	public void informo_o_nome_do_medidor() {
		
		modeloMedidor.preencherNomeMedidor();

		
	}
	
	@Quando("altero o nome do modelo do medidor")
	public void altero_o_nome_do_modelo_do_medidor() {
		
		modeloMedidor.preencherNovoNome();

		
	}
	
	@Quando("valido que o registro foi editado com sucesso")
	public void valido_que_o_registro_foi_editado_com_sucesso() {
		
		cadastro.validarMensagem();

		
	}
	
	
	//excluir
	@Quando("valido que o registro foi excluido com sucesso")
	public void valido_que_o_registro_foi_excluido_com_sucesso() {
		
		cadastro.validarMensagem();

		
	}
	
	
	
	
	
	

}
