package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import utils.UtilidadesSelenium;

public class RelatorioFasorialPage extends UtilidadesSelenium {


    By relatoriofasorial = By.xpath("(//span[text()='Relatório de Fasorial'])[1]");
    By Serial = By.name("serials");
    By txt_buscar = By.xpath("(//input[@placeholder='Buscar...'])[2]");
    By opc_buscar = By.xpath("//label[text()='11809089']");
    By txt_controlador_filtro = By.xpath("(//span[text()='Clique para selecionar...'])[3]");
    By txt_busca_filtro = By.xpath("(//label[text()='Controlador']/following::input)[1]");
    By opc_busca_filtro = By.xpath("(//label[text()='QA-ZEUS'])[2]");
    By data_inicial = By.name("dtInicial");
    By data_final = By.name("dtFinal");
    By txt_grandeza = By.xpath("(//span[text()='Clique para selecionar...'])[2]");
    By opc_grandeza = By.xpath("(//span[text()='Marcar todos'])[2]");
    By data_personalizada = By.xpath("(//label[contains(@class,'btn btn-success')])[2]");





    public void clicarRelatorioFasorial() throws InterruptedException {
        Thread.sleep(2000);
        getDriver().findElement(relatoriofasorial).click();
        Thread.sleep(2000);
        // getDriver().findElement(By.xpath("(///span[text()='Consumo por registradores']")).click();


    }


    public void selecionarControladorFiltroFasorial() {

        getDriver().findElement(txt_controlador_filtro).click();
        getDriver().findElement(txt_busca_filtro).sendKeys("zeus");
        aguardarElemento(opc_busca_filtro);
        getDriver().findElement(opc_busca_filtro).click();

    }

    public void selecionarGrandeza() throws InterruptedException {

        getDriver().findElement(txt_grandeza).click();
        //getDriver().findElement(txt_busca_filtro).sendKeys("zeus");
        aguardarElemento(opc_grandeza);
        getDriver().findElement(opc_grandeza).click();
        Thread.sleep(2000);
        getDriver().findElement(data_personalizada).click();

    }

    public void SelecionarDatasFasorial() throws InterruptedException {

        Thread.sleep(2000);
        getDriver().findElement(data_inicial).click();
        getDriver().findElement(data_inicial).clear();
        getDriver().findElement(data_inicial).sendKeys("18/11/2017 00:00");
        Thread.sleep(2000);
        getDriver().findElement(data_final).click();
        getDriver().findElement(data_final).clear();
        getDriver().findElement(data_final).sendKeys("26/11/2022 00:00");

    }


}
