package steps;

import java.io.IOException;

import io.cucumber.java.pt.Quando;
import junit.framework.Assert;
import utils.ConstantesPath;
import utils.LerDadosExcel;

public class SinalDoModuloDeComunicacaoSteps {
	
	@Quando("clico em Sinal do Módulo de Comunicação")
	public void clico_em_Sinal_do_Módulo_de_Comunicação() {

		

	}
	
	@Quando("seleciono o mes e ano do Módulo de Comunicação Sinal")
	public void seleciono_o_mes_e_ano_do_Módulo_de_Comunicação_Sinal() {

		

	}
	
	@SuppressWarnings({ "deprecation", "unused" })
	@Quando("valido a emissão do Relatorio Sinal do Módulo de Comunicação")
	public void valido_a_emissão_do_Relatorio_Sinal_do_Módulo_de_Comunicação()
			throws InterruptedException, IOException {

		String arquivo = LerDadosExcel.listarArquivos(ConstantesPath.DIRETORIOBASE);
		String nome = LerDadosExcel.leituraExcel(ConstantesPath.DIRETORIOBASE, arquivo);
		Assert.assertTrue(arquivo.contains("Relatório_de_Temperatura"));
		LerDadosExcel.deleteFile(ConstantesPath.DIRETORIOBASE, arquivo);

	}

}
