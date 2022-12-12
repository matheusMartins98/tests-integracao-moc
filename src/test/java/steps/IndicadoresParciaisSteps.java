package steps;

import java.io.IOException;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import junit.framework.Assert;
import pages.RelatoriosPage;
import utils.ConstantesPath;
import utils.LerDadosExcel;

public class IndicadoresParciaisSteps {

	RelatoriosPage relatorios = new RelatoriosPage();
	LerDadosExcel excel = new LerDadosExcel();

	@Quando("clico em relatórios")
	public void clico_em_relatórios() throws InterruptedException {

		relatorios.clicarRelatorio();

	}

	@Quando("clico em Qualidade de Energia")
	public void clico_em_Qualidade_de_Energia() {

		relatorios.clicarQualidadeEnergia();

	}

	@Quando("clico na opção indicadores de DRP e DRC parciais")
	public void clico_na_opção_indicadores_de_DRP_e_DRC_parciais() throws InterruptedException {

		relatorios.clicarDRPeDRC();

	}

	@Quando("seleciono o periodo")
	public void seleciono_o_periodo() throws InterruptedException {

		relatorios.SelecionarDatas();

	}

	@Quando("escolho os campos do filtro (.*)$")
	public void escolho_os_campos_do_filtro(String Serial) throws InterruptedException {

		relatorios.EscreverSerial(Serial);

	}

	@Quando("clico no botão filtrar")
	public void clico_no_botão_filtrar() {

		relatorios.clicarBtnFiltrar();

	}

	@Então("visualizo a exibição do relatório gerado")
	public void visualizo_a_exibição_do_relatório_gerado() {

		relatorios.pegarTexto();

	}

	@Então("realizo o download do relatorio")
	public void realizo_o_download_do_relatorio() {

		relatorios.downloadRelatorio();

	}

	@SuppressWarnings("deprecation")
	@Então("realizo a validação dos dados do excel")
	public void realizo_a_validação_dos_dados_do_excel() throws InterruptedException, IOException {

		String arquivo = LerDadosExcel.listarArquivos(ConstantesPath.DIRETORIOBASE);
		String nome = LerDadosExcel.leituraExcel(ConstantesPath.DIRETORIOBASE, arquivo);
		Assert.assertTrue(arquivo.contains("indicadores_de_DRP_e_DRC"));
		LerDadosExcel.deleteFile(ConstantesPath.DIRETORIOBASE, arquivo);

	}
}
