package steps;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.RelatoriosEnergiaPage;

public class IndicadoresEnergiaSteps {


    RelatoriosEnergiaPage relatorios = new RelatoriosEnergiaPage();

    @Quando("clico em relatóriosE")
    public void clico_em_relatóriose() throws InterruptedException {

        relatorios.clicarRelatorioe();

    }

    @Quando("clico em Qualidade de EnergiaE")
    public void clico_em_Qualidade_de_Energiae() {

        relatorios.clicarQualidadeEnergiae();

    }

    @Quando("clico na opção Indicadores consolidadosE")
    public void clico_na_opção_indicadores_consolidadose() throws InterruptedException {

        relatorios.clicarConsolidadose();

    }

    @Quando("seleciono o periodoE")
    public void seleciono_o_periodoe() {

        relatorios.SelecionarDatase();

    }

    @Quando("escolho os campos do filtroE (.*)$")
    public void escolho_os_campos_do_filtroe(String Serial) throws InterruptedException {

        relatorios.EscreverSeriale(Serial);

    }

    @Quando("clico no botão filtrarE")
    public void clico_no_botão_filtrae() {

        relatorios.clicarBtnFiltrare();

    }

    @Então("visualizo a exibição do relatório geradoE")
    public void visualizo_a_exibição_do_relatório_geradoe() {

        relatorios.pegarTextoe();

    }

}

