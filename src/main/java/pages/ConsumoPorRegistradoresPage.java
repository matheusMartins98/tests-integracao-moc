package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import utils.UtilidadesSelenium;

public class ConsumoPorRegistradoresPage extends UtilidadesSelenium {


    By consumoRegistradores = By.xpath("(//span[text()='Consumo por registradores'])[1]");
    By Serial = By.name("serials");
    By txt_buscar = By.xpath("(//input[@placeholder='Buscar...'])[2]");
    By opc_buscar = By.xpath("//label[text()='11809089']");
    By data_inicial = By.xpath("(//label[text()='Selecione o mês e ano']/following::input)[1]");




    public void clicarConsumoRegistradores() throws InterruptedException {

        getDriver().findElement(consumoRegistradores).click();
        Thread.sleep(2000);
       // getDriver().findElement(By.xpath("(///span[text()='Consumo por registradores']")).click();


    }

    public void SelecionarDatasConsumo() throws InterruptedException {

        Thread.sleep(2000);
        getDriver().findElement(data_inicial).click();
        getDriver().findElement(data_inicial).clear();
        getDriver().findElement(data_inicial).sendKeys("11/2021");

    }

}
