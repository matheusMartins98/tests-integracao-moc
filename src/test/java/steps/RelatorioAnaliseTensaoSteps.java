package steps;

import java.io.IOException;

import io.cucumber.java.pt.Dado;
import junit.framework.Assert;
import pages.RelatorioAnaliseTensaoPage;
import utils.ConstantesPath;
import utils.LerDadosExcel;

public class RelatorioAnaliseTensaoSteps {
	
	RelatorioAnaliseTensaoPage analiseTensao = new RelatorioAnaliseTensaoPage();

	@Dado("clico em Análise de tensão")
	public void clico_em_Análise_de_tensão() {
		
		analiseTensao.clicarAnaliseTensao();

	}

	@Dado("clico em Medidor Serial")
	public void clico_em_Medidor_Serial() {
		
		analiseTensao.clicarMedidorSerial();

	}

	@Dado("preencho o campo Medidor Serial (.*)$")
	public void preencho_o_campo_Medidor_Serial(String serial) {
		
		analiseTensao.preencherMedidorSerial(serial);

	}

	@Dado("clico em Pesquisar")
	public void clico_em_Pesquisar() {
		
		analiseTensao.clicarPesquisar();

	}

	@Dado("seleciono o medidor")
	public void seleciono_o_medidor() {
		
		analiseTensao.clicarOpcMedidor();

	}

	@Dado("clico em Selecionar")
	public void clico_em_Selecionar() {
		
		analiseTensao.clicarBtnSelecionar();

	}

	@Dado("preencho Selecione o mês e ano")
	public void preencho_Selecione_o_mês_e_ano() {
		
		analiseTensao.selecionarMesAno();

	}

	@Dado("clico no botão Filtrar")
	public void clico_no_botão_Filtrar() {
		
		analiseTensao.clicarBtnFiltrar();

	}

	@Dado("clico no botão Exportar")
	public void clico_no_botão_Exportar() {
		
		analiseTensao.clicarBtnExportar();

	}

	@Dado("seleciono a opção Exportar .CSV")
	public void seleciono_a_opção_Exportar_CSV() throws InterruptedException {
		
		analiseTensao.clicarOpcCsv();
		Thread.sleep(2000);

	}

	@SuppressWarnings({ "deprecation", "unused" })
	@Dado("valido os dados emitidos")
	public void valido_os_dados_emitidos() throws InterruptedException, IOException {
		
		String arquivo = LerDadosExcel.listarArquivos(ConstantesPath.DIRETORIOBASE);
		String nome = LerDadosExcel.leituraExcel(ConstantesPath.DIRETORIOBASE, arquivo);
		Assert.assertTrue(arquivo.contains("Análise_de_tensão"));
		LerDadosExcel.deleteFile(ConstantesPath.DIRETORIOBASE, arquivo);

	}

}
