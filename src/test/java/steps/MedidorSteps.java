package steps;

import io.cucumber.java.pt.Quando;
import pages.MedidorPage;

public class MedidorSteps {
	
	MedidorPage medidor = new MedidorPage();

	@Quando("clico em medidor")
	public void clico_em_medidor() throws InterruptedException {
		
		medidor.clicarMedidor();

	}

	@Quando("preencho os campos ponto de medição, nome, serial, identificação, data inical, data final, horario de verão e modelo do medidor")
	public void preencho_os_campos_ponto_de_medição_nome_serial_identificação_data_inical_data_final_horario_de_verão_e_modelo_do_medidor() {
		
		medidor.selecionarPontoMedicao();
		medidor.preencherNome();
		medidor.preencherSerial();
		medidor.preencherIdentificacao();
		medidor.preencherDatas();
		medidor.selecionarHrVerao();
		medidor.selecionarModeloMedidor();

	}

	@Quando("informo o medidor Serial")
	public void informo_o_medidor_Serial() {
		
		medidor.informarMedidorSerial();

	}
	
	@Quando("altero o nome do medidor Serial")
	public void altero_o_nome_do_medidor_Serial() {
		
		medidor.alterarNomeMedidor();

	}
	
	@Quando("informo o medidor Serial editado")
	public void informo_o_medidor_Serial_editado() {
		
		medidor.informarMedidorSerial();

	}

}
