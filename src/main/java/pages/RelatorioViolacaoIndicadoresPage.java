package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import utils.UtilidadesSelenium;

public class RelatorioViolacaoIndicadoresPage extends UtilidadesSelenium {


    By violacaoIndicadores = By.xpath("//span[text()='Violação dos Indicadores de DRP e DRC']");
    By Serial = By.name("serials");
    By txt_buscar = By.xpath("(//input[@placeholder='Buscar...'])[2]");
    By opc_buscar = By.xpath("//label[text()='11809089']");



    public void clicarViolacaoIndicadores() throws InterruptedException {

        getDriver().findElement(violacaoIndicadores).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("(//span[text()='Violação dos Indicadores de DRP e DRC'])[2]")).click();

    }

    public void preencherSerial(String serial) {

        getDriver().findElement(Serial).click();
        getDriver().findElement(txt_buscar).sendKeys(serial);
        aguardarElemento(opc_buscar);
        getDriver().findElement(opc_buscar).click();

    }
}
