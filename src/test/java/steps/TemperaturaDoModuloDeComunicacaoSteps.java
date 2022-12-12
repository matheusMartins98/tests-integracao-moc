package steps;

import java.io.IOException;

import io.cucumber.java.pt.Quando;
import junit.framework.Assert;
import pages.TemperaturaDoModuloDeComunicacaoPage;
import utils.ConstantesPath;
import utils.LerDadosExcel;

public class TemperaturaDoModuloDeComunicacaoSteps {

	TemperaturaDoModuloDeComunicacaoPage temperaturaDoModulo = new TemperaturaDoModuloDeComunicacaoPage();

	@Quando("clico em Comunicação")
	public void clico_em_Comunicação() {

		temperaturaDoModulo.clicarEmComunicao();

	}

	@Quando("clico em Temperatura do Módulo de Comunicação")
	public void clico_em_Temperatura_do_Módulo_de_Comunicação() {

		temperaturaDoModulo.clicarEmTemperaturaDoModulo();
	}

	@Quando("preencho o campo serial")
	public void preencho_o_campo_serial() throws Exception {

		temperaturaDoModulo.preencherSerial();

	}

	@Quando("clico para selecionar o medidor")
	public void clico_para_selecionar_o_medidor() {

		temperaturaDoModulo.selecionarMedidor();

	}
	
	@Quando("seleciono o mes e ano do Módulo de Comunicação")
	public void seleciono_o_mes_e_ano_do_Módulo_de_Comunicação() throws Exception {

		temperaturaDoModulo.preencherData();

	}

	@SuppressWarnings({ "deprecation", "unused" })
	@Quando("valido a emissão do Relatorio Temperatura do Módulo de Comunicação")
	public void valido_a_emissão_do_Relatorio_Temperatura_do_Módulo_de_Comunicação()
			throws InterruptedException, IOException {

		String arquivo = LerDadosExcel.listarArquivos(ConstantesPath.DIRETORIOBASE);
		String nome = LerDadosExcel.leituraExcel(ConstantesPath.DIRETORIOBASE, arquivo);
		Assert.assertTrue(arquivo.contains("Relatório_de_Temperatura"));
		LerDadosExcel.deleteFile(ConstantesPath.DIRETORIOBASE, arquivo);

	}

}
