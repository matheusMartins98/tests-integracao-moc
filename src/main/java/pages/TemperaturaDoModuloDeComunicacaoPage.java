package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import utils.PegaMassa;
import utils.UtilidadesSelenium;

public class TemperaturaDoModuloDeComunicacaoPage extends UtilidadesSelenium{

	By comunicacao = By.xpath("//span[text()='Comunicação']");
	By temperaturaDoModulo = By.xpath("//span[text()='Temperatura do Módulo de Comunicação']");
	By medidorSerial = By.xpath("((//label[text()='Medidor (Serial)'])[2]/following::input)[1]");
	By btn_pesquisar = By.xpath("//button[text()='Pesquisar']");
	By opc_medidor = By.xpath("(//label[@class='input-icheck'])[6]");
	By btn_selecionar = By.xpath("//button[text()='Selecionar']");
	By dtMensal = By.name("dtMensal");
	By opc_mensal = By.xpath("//label[text()='Mensal']");
	
	
	public void clicarEmComunicao() {

		getDriver().findElement(comunicacao).click();

	}

	public void clicarEmTemperaturaDoModulo() {

		getDriver().findElement(temperaturaDoModulo).click();

	}
	
	public void preencherSerial() throws Exception {

		getDriver().findElement(medidorSerial).sendKeys((PegaMassa.getMassa("RelatorioTemperatura", 0)));
		getDriver().findElement(btn_pesquisar).click();

	}
	
	public void selecionarMedidor() {
		
		aguardarElemento(opc_medidor);
		getDriver().findElement(opc_medidor).click();
		getDriver().findElement(btn_selecionar).click();
		
	}
	
	public void preencherData() throws Exception {

		getDriver().findElement(opc_mensal).click();
		getDriver().findElement(dtMensal).clear();
		getDriver().findElement(dtMensal).sendKeys((PegaMassa.getMassa("RelatorioTemperatura", 1)));

	}


}
