package pages;

import org.openqa.selenium.By;

import org.apache.poi.ss.formula.ThreeDEval;
import static core.DriverFactory.getDriver;

public class RelatoriosConsolidadosPage {

    By btn_relatoriosc = By.xpath("//a[@title='Relatórios']");
    By gp_qualidadec = By.xpath("//span[text()='Qualidade de Energia']");
    By opc_drpc = By.xpath("//span[text()='Indicadores consolidados']");
    By data_inicialc = By.xpath("//input[@name='dtMensal']");
    By data_finalc = By.xpath("//input[@name='dtFinal']");
    By C_serialc = By.xpath("(//angular2-multiselect//span)[7]");
    By txt_buscarc = By.xpath("(//angular2-multiselect//input)[33]");
    By opc_buscac = By.xpath("(//angular2-multiselect//li)[31]");
    By btn_filtrarc = By.xpath("//button[text()='Filtrar']");
    By DRP_C = By.xpath("(//tr//td)[8]");
    By DRC_C = By.xpath("(//tr//td)[9]");


    public void clicarRelatorioc() throws InterruptedException {
    	 Thread.sleep(2000);
        getDriver().findElement(btn_relatoriosc).click();

    }

    public void clicarQualidadeEnergiac() {

        getDriver().findElement(gp_qualidadec).click();
    }

    public void clicarConsolidadosc() throws InterruptedException {

        Thread.sleep(2000);
        getDriver().findElement(opc_drpc).click();
    }

    public void SelecionarDatasc() {

        getDriver().findElement(data_inicialc).click();
        getDriver().findElement(data_inicialc).clear();
        getDriver().findElement(data_inicialc).sendKeys("01/2022");
//        getDriver().findElement(data_finalc).click();
//        getDriver().findElement(data_finalc).clear();
//        getDriver().findElement(data_finalc).sendKeys("01/05/2022");

    }

    public void EscreverSerialc(String Serial) throws InterruptedException {

        getDriver().findElement(C_serialc).click();
        Thread.sleep(2000);
        getDriver().findElement(txt_buscarc).sendKeys(Serial);
        Thread.sleep(1000);
        getDriver().findElement(opc_buscac).click();
    }

    public void clicarBtnFiltrarc() {

        getDriver().findElement(btn_filtrarc).click();
    }

    public void pegarTextoc() {

        String texto1 = getDriver().findElement(DRP_C).getText();
        System.out.println("DRP = " + texto1);
        String texto2 = getDriver().findElement(DRC_C).getText();
        System.out.println("DRC = " + texto2);
//        String texto3 = getDriver().findElement(DRP_Cc).getText();
//        System.out.println("DRP Fase C = " + texto3);
    }




}
