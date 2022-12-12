package steps;

import java.io.IOException;

import io.cucumber.java.pt.Quando;
import junit.framework.Assert;
import pages.RegistradoresParaUmaListaDeMedidoresPage;
import utils.ConstantesPath;
import utils.LerDadosExcel;

public class RegistradoresParaUmaListaDeMedidoresSteps {

	RegistradoresParaUmaListaDeMedidoresPage registradoresDeMedidores = new RegistradoresParaUmaListaDeMedidoresPage();

	@Quando("clico em Medição")
	public void clico_em_Medição() {

		registradoresDeMedidores.clicarMedicao();

	}

	@Quando("clico em Leitura de Registradores para uma Lista de medidores")
	public void clico_em_Leitura_de_Registradores_para_uma_Lista_de_medidores() {

		registradoresDeMedidores.clicarListaDeMedidores();

	}

	@Quando("preencho a data")
	public void preencho_a_data() {

		registradoresDeMedidores.clicarOpcData();

	}

	@Quando("preencho o serial")
	public void preencho_o_serial() {

		registradoresDeMedidores.clicarSerial();
	}

	@Quando("seleciono a opção Exportar .XLS")
	public void seleciono_a_opção_Exportar_XLS() {

		registradoresDeMedidores.clicarOpcXLS();

	}

	@SuppressWarnings({ "deprecation", "unused" })
	@Quando("valido a emissão do Relatorio Leitura de Registradores para uma Lista de medidores")
	public void valido_a_emissão_do_Relatorio_Leitura_de_Registradores_para_uma_Lista_de_medidores()
			throws InterruptedException, IOException {

		String arquivo = LerDadosExcel.listarArquivos(ConstantesPath.DIRETORIOBASE);
		String nome = LerDadosExcel.leituraExcel(ConstantesPath.DIRETORIOBASE, arquivo);
		Assert.assertTrue(arquivo.contains("Relatorio_de_Registradores"));
		LerDadosExcel.deleteFile(ConstantesPath.DIRETORIOBASE, arquivo);

	}

}
