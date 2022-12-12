package steps;

import io.cucumber.java.pt.Quando;
import pages.RelatorioViolacaoIndicadoresPage;

public class RelatorioViolacaoIndicadoresSteps {

    RelatorioViolacaoIndicadoresPage relatorioViolacaoIndicadores = new RelatorioViolacaoIndicadoresPage();

    @Quando("clico em Violação dos Indicadores de DRP e DRC")
    public void clico_em_Violação_dos_Indicadores_de_DRP_e_DRC() throws InterruptedException {

        relatorioViolacaoIndicadores.clicarViolacaoIndicadores();

    }





    @Quando("seleciono o serial(.*)$")
    public void seleciono_o_serial(String serial) {

        relatorioViolacaoIndicadores.preencherSerial(serial);

    }

}
