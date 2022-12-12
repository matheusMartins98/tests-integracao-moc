package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import utils.UtilidadesSelenium;

public class InibicaoEventosPage extends UtilidadesSelenium {

	By inibicao_eventos = By.xpath("(//span[text()='Inibição de eventos'])[1]");
	By controlador = By.xpath("//div[@class='form-group ng-star-inserted']//angular2-multiselect[1]");
	By txt_busca_controlador = By.xpath("(//input[@placeholder='Buscar...'])[5]");
	By opc_controlador = By.xpath("(//label[text()='QA-ZEUS'])[2]");
	By tipo_alarme = By.xpath("//angular2-multiselect[@name='typeAlarm']");
	By opc_tipoAlarme = By.xpath("(//label[text()='05 - Alarme Físico'])[2]");
	By Subtipo_alarme = By.xpath("//angular2-multiselect[@name='subTypeAlarm']");
	By opc_Subtipo_alarme = By.xpath("(//label[text()='01 - Comunicando'])[2]");
	By personalizado = By.xpath("(//input[@name='typeDate'])[3]");
	By data_inicial = By.xpath("(//label[@for='inputError']/following-sibling::input)[1]");
	By data_final = By.xpath("(//label[@for='inputError']/following-sibling::input)[2]");
	By alvo = By.xpath("//select[@name='target']");
	By opc_alvo = By.xpath("//option[text()='Controlador']");
	By campo_controlador = By.name("resellers");
	By campo_bucar = By.xpath("//input[@placeholder='Buscar...']");
	By opc_bucar_filtro = By.xpath("//label[text()='QA-ZEUS']");
	By opc_Subtipo2 = By.xpath("(//label[text()='02 - Sensor 2'])[2]");

	String Controlador = "QA-ZEUS";
	String DataInicial = "01/10/2022";
	String DataFinal = "30/10/2022";

	public void clicarInibicaoEventos() throws InterruptedException {

		getDriver().findElement(inibicao_eventos).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//span[text()='Inibição de eventos'])[2]")).click();

	}

	public void selecionarControlador() {

		getDriver().findElement(controlador).click();
		getDriver().findElement(txt_busca_controlador).sendKeys(Controlador);
		aguardarElemento(opc_controlador);
		getDriver().findElement(opc_controlador).click();
		getDriver().findElement(controlador).click();

	}

	public void selecionarTipoAlarme() {

		getDriver().findElement(tipo_alarme).click();
		aguardarElemento(opc_tipoAlarme);
		getDriver().findElement(opc_tipoAlarme).click();

	}

	public void selecionarSubTipoAlarme() {

		getDriver().findElement(Subtipo_alarme).click();
		aguardarElemento(opc_Subtipo_alarme);
		getDriver().findElement(opc_Subtipo_alarme).click();
		getDriver().findElement(Subtipo_alarme).click();
		pageDown(data_inicial);

	}

	public void selecionarPeriodo() {

		getDriver().findElement(personalizado).click();

		getDriver().findElement(data_inicial).click();
		getDriver().findElement(data_inicial).sendKeys(DataInicial);
		getDriver().findElement(data_final).click();
		getDriver().findElement(data_final).sendKeys(DataFinal);
		getDriver().findElement(data_final).click();
	}

	public void selecionarAlvo() {

		getDriver().findElement(alvo).click();
		getDriver().findElement(opc_alvo).click();

	}

	public void selecionarControladorFiltro() {

		getDriver().findElement(campo_controlador).click();
		getDriver().findElement(campo_bucar).click();
		getDriver().findElement(campo_bucar).sendKeys(Controlador);
		aguardarElemento(opc_bucar_filtro);
		getDriver().findElement(opc_bucar_filtro).click();
		getDriver().findElement(campo_controlador).click();

	}

	public void alterarSubtipoAlarme() {

		pageDown(Subtipo_alarme);
		getDriver().findElement(Subtipo_alarme).click();
		getDriver().findElement(opc_Subtipo2).click();
		getDriver().findElement(Subtipo_alarme).click();

	}

}
