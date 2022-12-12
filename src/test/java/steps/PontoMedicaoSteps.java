package steps;

import io.cucumber.java.pt.Quando;
import pages.PontoMedicaoPage;

public class PontoMedicaoSteps {

	PontoMedicaoPage pontoMedicao = new PontoMedicaoPage();

	@Quando("seleciono a opcao ponto de medição")
	public void seleciono_a_opcao_ponto_de_medição() {

		pontoMedicao.selecionarPontoMedicao();

	}

	@Quando("preencho os campos nome, codigo ANEEL, Latitude, Longitude e Chave Externa1")
	public void preencho_os_campos_nome_codigo_ANEEL_Latitude_Longitude_Chave_Externa1() {

		pontoMedicao.IncluirRegistro();

	}

	@Quando("salvo o registro")
	public void salvo_o_registro() throws InterruptedException {

		pontoMedicao.Salvar();

	}

	@Quando("seleciono o cliente")
	public void seleciono_o_cliente() throws InterruptedException {

		pontoMedicao.preencherControlador();
		pontoMedicao.preencherAtividade();

	}

	// edição ponto de medição
	@Quando("informo o nome do ponto de medição")
	public void informo_o_nome_do_ponto_de_medição() {
		
		pontoMedicao.buscarNomeMedicao();

	}
	
	@Quando("altero o nome do ponto de medição")
	public void altero_o_nome_do_ponto_de_medição() {
		
		pontoMedicao.alterarNomeMedicao();

	}
	
	//exclusão ponto de medição
	@Quando("informo o nome do ponto de medição editado")
	public void informo_o_nome_do_ponto_de_medição_editado() {
		
		pontoMedicao.buscarNomeEditado();

	}
	


	
	

}
