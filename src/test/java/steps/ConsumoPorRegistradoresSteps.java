package steps;

import java.io.IOException;

import io.cucumber.java.pt.Quando;
import junit.framework.Assert;
import pages.ConsumoPorRegistradoresPage;
import utils.ConstantesPath;
import utils.LerDadosExcel;

public class ConsumoPorRegistradoresSteps {

    ConsumoPorRegistradoresPage relatorioConsumoRegistradores = new ConsumoPorRegistradoresPage();


    @Quando("clico em Consumo por Registradores")
    public void clicar_Consumo_Registradores() throws InterruptedException {

        relatorioConsumoRegistradores.clicarConsumoRegistradores();

    }

    @Quando("seleciono o periodoConsumo")
    public void selecionar_periodo() throws InterruptedException {

        relatorioConsumoRegistradores.SelecionarDatasConsumo();

    }
    
    @SuppressWarnings({ "deprecation", "unused" })
	@Quando("valido a emissão do Relatorio Consumo por Registradores")
	public void valido_a_emissão_do_Relatorio_Consumo_por_Registradores()
			throws InterruptedException, IOException {

		String arquivo = LerDadosExcel.listarArquivos(ConstantesPath.DIRETORIOBASE);
		String nome = LerDadosExcel.leituraExcel(ConstantesPath.DIRETORIOBASE, arquivo);
		Assert.assertTrue(arquivo.contains("Relatorio_de_Consumo"));
		LerDadosExcel.deleteFile(ConstantesPath.DIRETORIOBASE, arquivo);

	}


}
