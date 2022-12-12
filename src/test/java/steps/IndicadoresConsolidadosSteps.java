package steps;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.RelatoriosConsolidadosPage;

public class IndicadoresConsolidadosSteps {


    RelatoriosConsolidadosPage relatorios = new RelatoriosConsolidadosPage();

    @Quando("clico em relatóriosC")
    public void clico_em_relatórios() throws InterruptedException {

        relatorios.clicarRelatorioc();

    }

    @Quando("clico em Qualidade de EnergiaC")
    public void clico_em_Qualidade_de_Energiac() {

        relatorios.clicarQualidadeEnergiac();

    }

    @Quando("clico na opção Indicadores consolidadosC")
    public void clico_na_opção_indicadores_consolidados() throws InterruptedException {

        relatorios.clicarConsolidadosc();

    }

    @Quando("seleciono o periodoC")
    public void seleciono_o_periodoc() {

        relatorios.SelecionarDatasc();

    }

    @Quando("escolho os campos do filtroC (.*)$")
    public void escolho_os_campos_do_filtroc(String Serial) throws InterruptedException {

        relatorios.EscreverSerialc(Serial);

    }

    @Quando("clico no botão filtrarC")
    public void clico_no_botão_filtrar() {

        relatorios.clicarBtnFiltrarc();

    }

    @Então("visualizo a exibição do relatório geradoC")
    public void visualizo_a_exibição_do_relatório_geradoc() {

        relatorios.pegarTextoc();

    }

}

