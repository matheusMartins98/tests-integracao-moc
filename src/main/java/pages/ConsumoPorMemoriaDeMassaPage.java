package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import utils.UtilidadesSelenium;

public class ConsumoPorMemoriaDeMassaPage extends UtilidadesSelenium {

	By consumo_massa = By.xpath("//span[text()='Consumo por memória de massa']");
	By personalizado = By.xpath("//label[text()='Personalizado']");
	By DtInicial = By.name("dtInicial");
	By DtFinal = By.name("dtFinal");
	By ModoSumarizacao = By.name("sumType");
	By opc_ModoSumarizacao = By.xpath("//option[text()='AVG - Média']");
	By opc_medidor = By.xpath("(//label[@class='input-icheck'])[4]");
	By btn_pesquisar = By.xpath("//button[text()='Pesquisar']");
	By btn_selecionar = By.xpath("//button[text()='Selecionar']");

	String DataInicial = "01/09/2022";
	String DataFinal = "30/09/2022";

	public void clicaronsumoPorMemoria() throws InterruptedException {

		getDriver().findElement(consumo_massa).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//span[text()='Consumo por memória de massa'])[2]")).click();

	}

	public void periodoPersonalizado() {

		getDriver().findElement(personalizado).click();
		getDriver().findElement(DtInicial).clear();
		getDriver().findElement(DtInicial).sendKeys(DataInicial);
		getDriver().findElement(DtFinal).clear();
		getDriver().findElement(DtFinal).sendKeys(DataFinal);

	}

	public void pesquisar() {

		getDriver().findElement(btn_pesquisar).click();

	}

	public void modoSumarizacao() {

		getDriver().findElement(ModoSumarizacao).click();
		getDriver().findElement(opc_ModoSumarizacao).click();

	}

	public void selecionarMedidor() {

		aguardarElemento(opc_medidor);
		getDriver().findElement(opc_medidor).click();
		getDriver().findElement(btn_selecionar).click();

	}
}
