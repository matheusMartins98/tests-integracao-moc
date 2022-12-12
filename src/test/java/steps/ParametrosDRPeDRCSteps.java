package steps;

import io.cucumber.java.pt.Quando;
import pages.ParametrosDRPeDRCPage;

public class ParametrosDRPeDRCSteps {

	ParametrosDRPeDRCPage ParametrosDRPeDRC = new ParametrosDRPeDRCPage();

	@Quando("clico em qualidade de energia")
	public void clico_em_qualidade_de_energia() {

		ParametrosDRPeDRC.clicarQualidadeEnergia();

	}

	@Quando("clico em parâmetros dos indicadores")
	public void clico_em_parâmetros_dos_indicadores() throws InterruptedException {

		ParametrosDRPeDRC.clicarParamentrosDRP();

	}

	@Quando("seleciono os campos Controlador, tensão nominal, limite DRC e limite DRP")
	public void seleciono_os_campos_Controlador_tensão_nominal_limite_DRC_e_limite_DRP() {

		ParametrosDRPeDRC.selecionarControlador();
		ParametrosDRPeDRC.selecionarTensaoNominal();

	}

	@Quando("seleciono o controlador")
	public void seleciono_o_controlador() {

		ParametrosDRPeDRC.selecionarControladorFiltro();

	}

	@Quando("altero o valor da tensão nominal")
	public void altero_o_valor_da_tensão_nominal() {

		ParametrosDRPeDRC.alterarTensaoNominal();
	}

}
