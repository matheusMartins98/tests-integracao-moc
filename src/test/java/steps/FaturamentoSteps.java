package steps;

import java.io.IOException;

import io.cucumber.java.pt.Quando;
import junit.framework.Assert;
import pages.FaturamentoPage;
import utils.ConstantesPath;
import utils.LerDadosExcel;

public class FaturamentoSteps {

	FaturamentoPage faturamento = new FaturamentoPage();

	@Quando("clico em Faturamento")
	public void clico_em_Faturamento() throws InterruptedException {

		faturamento.clicarEmFaturamento();

	}

	@Quando("preencho serial(.*)$")
	public void preencho_serial(String serial) {

		faturamento.escreverSerial(serial);

	}

	@Quando("preencho Selecione mês e ano")
	public void preencho_Selecione_mês_e_ano() {

	}

	@SuppressWarnings("deprecation")
	@Quando("valido a emissão do Relatorio de Faturamento")
	public void valido_a_emissão_do_Relatorio_de_Faturamento() throws InterruptedException, IOException {

		String arquivo = LerDadosExcel.listarArquivos(ConstantesPath.DIRETORIOBASE);
		String nome = LerDadosExcel.leituraExcel(ConstantesPath.DIRETORIOBASE, arquivo);
		Assert.assertTrue(arquivo.contains("Relatório_de_Faturamento"));
		LerDadosExcel.deleteFile(ConstantesPath.DIRETORIOBASE, arquivo);

	}
}
