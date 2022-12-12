package steps;

import java.io.IOException;

import io.cucumber.java.pt.Quando;
import junit.framework.Assert;
import pages.GraficoDeFasorialPage;
import utils.ConstantesPath;
import utils.LerDadosExcel;

public class GraficoDeFasorialSteps {

	GraficoDeFasorialPage graficoFasorial = new GraficoDeFasorialPage();

	@Quando("clico em Gráfico de Fasorial")
	public void clico_em_Gráfico_de_Fasorial() throws InterruptedException {

		graficoFasorial.clicarEmGraficoFasorial();

	}

	@Quando("escolho o cliente")
	public void escolho_o_cliente() {

		graficoFasorial.clicarEmSelecionar();

	}
	
	@Quando("preencho a data personalizada")
	public void preencho_a_data_personalizada() {
		
		graficoFasorial.periodoPersonalizado();

		

	}

	@SuppressWarnings({ "deprecation", "unused" })
	@Quando("valido a emissão do Relatorio Gráfico de Fasorial")
	public void valido_a_emissão_do_Relatorio_Gráfico_de_Fasorial() throws InterruptedException, IOException {

		String arquivo = LerDadosExcel.listarArquivos(ConstantesPath.DIRETORIOBASE);
		String nome = LerDadosExcel.leituraExcel(ConstantesPath.DIRETORIOBASE, arquivo);
		Assert.assertTrue(arquivo.contains("Gráfico_de_Fasorial"));
		LerDadosExcel.deleteFile(ConstantesPath.DIRETORIOBASE, arquivo);

	}

}
