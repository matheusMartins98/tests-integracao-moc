package steps;

import java.io.IOException;

import io.cucumber.java.pt.Quando;
import junit.framework.Assert;
import pages.ConsumoPorMemoriaDeMassaPage;
import utils.ConstantesPath;
import utils.LerDadosExcel;

public class ConsumoPorMemoriaDeMassaSteps {

	ConsumoPorMemoriaDeMassaPage consumoPorMemoriaDeMassa = new ConsumoPorMemoriaDeMassaPage();

	@Quando("clico em Consumo por memória de massa")
	public void clico_em_Consumo_por_memória_de_massa() throws InterruptedException {

		consumoPorMemoriaDeMassa.clicaronsumoPorMemoria();

	}

	@Quando("clico em pesquisar o medidor")
	public void clico_em_pesquisar_o_medidor() {

		consumoPorMemoriaDeMassa.pesquisar();

	}

	@Quando("seleciono o medidor serial")
	public void seleciono_o_medidor_serial() {

		consumoPorMemoriaDeMassa.selecionarMedidor();

	}

	@Quando("seleciono o periodo personalizado")
	public void seleciono_o_periodo_personalizado() {

		consumoPorMemoriaDeMassa.periodoPersonalizado();

	}

	@Quando("seleciono Modo de sumarização de tensão e corrente AVG - Média")
	public void seleciono_Modo_de_sumarização_de_tensão_e_corrente_AVG_Média() {

		consumoPorMemoriaDeMassa.modoSumarizacao();

	}
	
	@SuppressWarnings({ "deprecation", "unused" })
	@Quando("valido a emissão do Relatorio Consumo por memória de massa")
	public void valido_a_emissão_do_Relatorio_Consumo_por_memória_de_massa()
			throws InterruptedException, IOException {

		String arquivo = LerDadosExcel.listarArquivos(ConstantesPath.DIRETORIOBASE);
		String nome = LerDadosExcel.leituraExcel(ConstantesPath.DIRETORIOBASE, arquivo);
		Assert.assertTrue(arquivo.contains("Relatório_de_consumo_por_memória_de_massa"));
		LerDadosExcel.deleteFile(ConstantesPath.DIRETORIOBASE, arquivo);

	}

}
