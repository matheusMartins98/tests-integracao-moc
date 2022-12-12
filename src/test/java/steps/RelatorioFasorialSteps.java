package steps;

import io.cucumber.java.pt.Quando;
import pages.RelatorioFasorialPage;

import static core.DriverFactory.getDriver;

public class RelatorioFasorialSteps {

    RelatorioFasorialPage relatorioFasorial = new RelatorioFasorialPage();


    @Quando("clico em relatório fasorial")
    public void clicar_Fasorial() throws InterruptedException {

        relatorioFasorial.clicarRelatorioFasorial();

    }




    @Quando("seleciono o controlador fasorial")
    public void clicar_ControladorFiltroFasorial()  {

        relatorioFasorial.selecionarControladorFiltroFasorial();

    }

   // selecionarGrandeza

    @Quando("seleciono a grandeza")
    public void clicar_Grandeza() throws InterruptedException {

        relatorioFasorial.selecionarGrandeza();

    }

    @Quando("preencho Selecione o mês e ano personalizado")
    public void seleciona_datapersonalizada() throws InterruptedException {

        relatorioFasorial.SelecionarDatasFasorial();

    }




}
