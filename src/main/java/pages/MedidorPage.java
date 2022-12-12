package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import utils.UtilidadesSelenium;

public class MedidorPage extends UtilidadesSelenium {

	By medidor = By.xpath("//span[text()='Medidor']");
	By ponto_medicao = By.name("measurePoint");
	By controlador = By.xpath("(//div[@class='c-btn'])[3]");
	By txt_buscar = By.xpath("(//input[@placeholder='Buscar...'])[3]");
	By opc_buscar = By.xpath("(//label[text()='CAS-Tecnologia'])[2]");
	By btn_pesquisar = By.xpath("(//button[text()='Pesquisar'])[2]");
	By opc_registro = By.xpath("(//label[@class='input-icheck'])[4]");
	By btn_selecionar = By.xpath("//button[text()='Selecionar']");
	By txt_nome = By.name("name");
	By txt_serial = By.name("serial");
	By txt_identificacao = By.name("register");
	By DtInicial = By.name("dtInitial");
	By DtFinal = By.name("dtFinal");
	By HrVerao = By.name("daylight");
	By opc_HrVerao = By.xpath("(//option[text()='Padrão'])[2]");
	By modelo_medidor = By.name("meterModel");
	By opc_modelo_medidor = By.xpath("//option[text()='ABNT']");
	By medidorSerial_filtro = By.xpath("(//label[text()='Medidor (Serial)']/following::input)[1]");

	String Controlador = "CAS-Tecnologia";
	String NomeMedidor = "Mêdidor Automatizado";
	String NomeMedidorEditado = "Mêdidor Automatizado Editado";
	String Serial = "142536";
	String DataInicial = "01/10/2022";
	String DataFinal = "31/10/2022";

	public void clicarMedidor() throws InterruptedException {

		getDriver().findElement(medidor).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//span[text()='Medidor'])[2]")).click();

	}

	public void selecionarPontoMedicao() {

		getDriver().findElement(ponto_medicao).click();
		getDriver().findElement(controlador).click();
		getDriver().findElement(txt_buscar).sendKeys(Controlador);
		aguardarElemento(opc_buscar);
		getDriver().findElement(opc_buscar).click();
		getDriver().findElement(btn_pesquisar).click();
		aguardarElemento(opc_registro);
		getDriver().findElement(opc_registro).click();
		getDriver().findElement(btn_selecionar).click();

	}

	public void preencherNome() {

		getDriver().findElement(txt_nome).sendKeys(NomeMedidor);

	}

	public void preencherSerial() {

		getDriver().findElement(txt_serial).sendKeys(Serial);

	}

	public void preencherIdentificacao() {

		pageDown(txt_identificacao);
		getDriver().findElement(txt_identificacao).sendKeys(NomeMedidor);

	}

	public void preencherDatas() {

		getDriver().findElement(DtInicial).sendKeys(DataInicial);
		getDriver().findElement(DtFinal).sendKeys(DataFinal);
		pageDown(HrVerao);

	}

	public void selecionarHrVerao() {

		getDriver().findElement(HrVerao).click();
		getDriver().findElement(opc_HrVerao).click();

	}

	public void selecionarModeloMedidor() {
		pageDown(modelo_medidor);
		getDriver().findElement(modelo_medidor).click();
		getDriver().findElement(opc_modelo_medidor).click();

	}

	public void informarMedidorSerial() {

		getDriver().findElement(medidorSerial_filtro).click();
		getDriver().findElement(medidorSerial_filtro).sendKeys(Serial);

	}

	public void alterarNomeMedidor() {

		getDriver().findElement(txt_nome).clear();
		getDriver().findElement(txt_nome).sendKeys(NomeMedidorEditado);
		

	}
	



}
