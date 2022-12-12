package pages;

import org.openqa.selenium.By;

import static core.DriverFactory.getDriver;

public class RelatoriosEnergiaPage {

    By btn_relatoriose = By.xpath("//a[@title='Relatórios']");
    By gp_qualidadee = By.xpath("//span[text()='Qualidade de Energia']");
    By opc_drpe = By.xpath("//span[text()='Interrupção de energia']");
    By data_iniciale = By.xpath("//input[@name='dtInicial']");
    By data_finale = By.xpath("//input[@name='dtFinal']");
    By C_seriale = By.xpath("(//angular2-multiselect//span)[7]");
    By txt_buscare = By.xpath("(//angular2-multiselect//input)[33]");
    By opc_buscae = By.xpath("(//angular2-multiselect//li)[31]");
    By btn_filtrare = By.xpath("//button[text()='Filtrar']");
    By DRP_E = By.xpath("(//td[@class='center ui-resizable-column'])[2]");
    By DRC_E = By.xpath("(//td[@class='right ui-resizable-column'])[2]");


    public void clicarRelatorioe() throws InterruptedException {
        Thread.sleep(2000);
        getDriver().findElement(btn_relatoriose).click();

    }

    public void clicarQualidadeEnergiae() {

        getDriver().findElement(gp_qualidadee).click();
    }

    public void clicarConsolidadose() throws InterruptedException {

        Thread.sleep(2000);
        getDriver().findElement(opc_drpe).click();
    }

    public void SelecionarDatase() {

        getDriver().findElement(data_iniciale).click();
        getDriver().findElement(data_iniciale).clear();
        getDriver().findElement(data_iniciale).sendKeys("01/01/2022");
       getDriver().findElement(data_finale).click();
       getDriver().findElement(data_finale).clear();
        getDriver().findElement(data_finale).sendKeys("01/05/2022");

    }

    public void EscreverSeriale(String Serial) throws InterruptedException {

        getDriver().findElement(C_seriale).click();
        Thread.sleep(2000);
        getDriver().findElement(txt_buscare).sendKeys(Serial);
        Thread.sleep(1000);
        getDriver().findElement(opc_buscae).click();
    }

    public void clicarBtnFiltrare() {

        getDriver().findElement(btn_filtrare).click();
    }

    public void pegarTextoe() {

        String texto1 = getDriver().findElement(DRP_E).getText();
        System.out.println("DRP = " + texto1);
        String texto2 = getDriver().findElement(DRC_E).getText();
        System.out.println("DRC = " + texto2);
//        String texto3 = getDriver().findElement(DRP_Cc).getText();
//        System.out.println("DRP Fase C = " + texto3);
    }




}
