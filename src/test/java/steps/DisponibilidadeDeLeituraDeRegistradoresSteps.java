package steps;

import java.io.IOException;

import io.cucumber.java.pt.Quando;
import junit.framework.Assert;
import pages.DisponibilidadeDeLeituraDeRegistradoresPage;
import utils.ConstantesPath;
import utils.LerDadosExcel;

@SuppressWarnings("deprecation")
public class DisponibilidadeDeLeituraDeRegistradoresSteps {

	DisponibilidadeDeLeituraDeRegistradoresPage disponibilidadeDeLeitura = new DisponibilidadeDeLeituraDeRegistradoresPage();

	@Quando("clico em Disponibilidade de leitura de registradores")
	public void clico_em_Disponibilidade_de_leitura_de_registradores() throws InterruptedException {

		disponibilidadeDeLeitura.clicarEmDisponibilidadeDeLeitura();

	}

	@Quando("clico no campo serial(.*)$")
	public void clico_no_campo_serial(String serial) {
		
		disponibilidadeDeLeitura.preencherSerial(serial);

	}

	@Quando("valido a emissão do Relatorio Disponibilidade de leitura de registradores")
	public void valido_a_emissão_do_Relatorio_Disponibilidade_de_leitura_de_registradores()
			throws InterruptedException, IOException {

		String arquivo = LerDadosExcel.listarArquivos(ConstantesPath.DIRETORIOBASE);
		String nome = LerDadosExcel.leituraExcel(ConstantesPath.DIRETORIOBASE, arquivo);
		Assert.assertTrue(arquivo.contains("Relatorio_de_Disponibilidade"));
		LerDadosExcel.deleteFile(ConstantesPath.DIRETORIOBASE, arquivo);

	}

}
