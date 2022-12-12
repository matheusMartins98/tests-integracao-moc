package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import utils.UtilidadesSelenium;

public class ParametrosDRPeDRCPage extends UtilidadesSelenium {

	By qualidade_energia = By.xpath("//span[text()='Qualidade de Energia']");
	By parametros_indicadores = By.xpath("//span[text()='Parâmetros dos Indicadores de DRP e DRC']");
	By txt_controlador = By.name("reseller");
	By opc_controlador = By.xpath("//option[text()='CAS-Tecnologia']");
	By txt_busca_filtro = By.xpath("//input[@placeholder='Buscar...']");
	By opc_busca_filtro = By.xpath("(//label[text()='CAS-Tecnologia'])[1]");
	By txt_controlador_filtro = By.xpath("//div[@class='c-btn']");
	By tensao_nominal = By.name("nominalTension");
	By opc_tensao_nominal = By.xpath("//option[@value='1: 2']");
	By opc_tensao = By.xpath("//option[@value='3: 4']");

	String controlador = "CAS-Tecnologia";

	public void clicarQualidadeEnergia() {

		getDriver().findElement(qualidade_energia).click();

	}

	public void clicarParamentrosDRP() throws InterruptedException {

		getDriver().findElement(parametros_indicadores).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//span[text()='Parâmetros dos Indicadores de DRP e DRC'])[2]")).click();

	}

	public void selecionarControlador() {

		getDriver().findElement(txt_controlador).click();
		getDriver().findElement(opc_controlador).click();

	}

	public void selecionarTensaoNominal() {

		getDriver().findElement(tensao_nominal).click();
		getDriver().findElement(opc_tensao_nominal).click();

	}

	public void selecionarControladorFiltro() {

		getDriver().findElement(txt_controlador_filtro).click();
		getDriver().findElement(txt_busca_filtro).sendKeys(controlador);
		aguardarElemento(opc_busca_filtro);
		getDriver().findElement(opc_busca_filtro).click();

	}

	public void alterarTensaoNominal() {

		getDriver().findElement(tensao_nominal).click();
		getDriver().findElement(opc_tensao).click();

	}

}
