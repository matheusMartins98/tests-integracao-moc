package steps;

import java.io.IOException;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import junit.framework.Assert;
import pages.RegistradoresParaUmMedidorPage;
import utils.ConstantesPath;
import utils.LerDadosExcel;

public class RegistradoresParaUmMedidorSteps {

	RegistradoresParaUmMedidorPage registradoresParaUmMedidor = new RegistradoresParaUmMedidorPage();

	@Quando("clico em Leitura de Registradores para um medidor")
	public void clico_em_Leitura_de_Registradores_para_um_medidor() throws InterruptedException {

		registradoresParaUmMedidor.clicarLeituraUmRegistrador();

	}

	@Quando("clico no campo Medidor Serial")
	public void clico_no_campo_Medidor_Serial() {

		registradoresParaUmMedidor.clicarMedidorSerial();

	}

	@Quando("informo o numero de serial(.*)$")
	public void informo_o_numero_de_serial(String serial) {

		registradoresParaUmMedidor.preencherSerial(serial);

	}

	@Quando("clico em pesquisar")
	public void clico_em_pesquisar() {

		registradoresParaUmMedidor.clicarPesquisar();
		registradoresParaUmMedidor.ClicarSelecionar();

	}

	@Quando("seleciono o mes e ano")
	public void seleciono_o_mes_e_ano() {

		registradoresParaUmMedidor.preencherMes();

	}

	@Quando("Seleciono a primeira Leitura Disponível")
	public void Seleciono_a_primeira_Leitura_Disponível() {

		registradoresParaUmMedidor.selecionarLeituras();

	}

	@SuppressWarnings({ "deprecation", "unused" })
	@Quando("valido a emissão do Relatorio Leitura de Registradores para um medidor")
	public void valido_a_emissão_do_Relatorio_Leitura_de_Registradores_para_um_medidor()
			throws InterruptedException, IOException {

		String arquivo = LerDadosExcel.listarArquivos(ConstantesPath.DIRETORIOBASE);
		String nome = LerDadosExcel.leituraExcel(ConstantesPath.DIRETORIOBASE, arquivo);
		Assert.assertTrue(arquivo.contains("Relatorio_de_Registradores"));
		LerDadosExcel.deleteFile(ConstantesPath.DIRETORIOBASE, arquivo);

	}

}
