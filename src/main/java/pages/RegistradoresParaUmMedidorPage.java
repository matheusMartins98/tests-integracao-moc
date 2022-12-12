package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import utils.UtilidadesSelenium;

public class RegistradoresParaUmMedidorPage extends UtilidadesSelenium {

	By Registradores1_medidor = By.xpath("//a[contains(.,'Leitura de Registradores para um medidor')]");
	By medidor_serial = By.name("meterSerial");
	By medidor = By.xpath("((//label[text()='Medidor (Serial)'])[2]/following::input)[1]");
	By opc_serial = By.xpath("(//label[@class='input-icheck'])[2]");
	By data_mensal = By.name("dtMensal");
	By btn_pesquisar = By.xpath("//button[text()='Pesquisar']");
	By leituras_disponiveis = By.name("reads");
	By opc_leituras_disponiveis = By.xpath("//label[text()='Periodo Atual - 30/08/2022 02:00:03']");
	
	

	String data = "08/2022";

	public void clicarLeituraUmRegistrador() throws InterruptedException {

		getDriver().findElement(Registradores1_medidor).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//span[text()='Leitura de Registradores para um medidor'])[2]")).click();
	}

	public void clicarMedidorSerial() {

		getDriver().findElement(medidor_serial).click();

	}

	public void preencherSerial(String serial) {

		getDriver().findElement(medidor).sendKeys(serial);

	}

	public void clicarPesquisar() {

		getDriver().findElement(btn_pesquisar).click();
	}

	public void ClicarSelecionar() {

		aguardarElemento(opc_serial);
		getDriver().findElement(opc_serial).click();
	}

	public void preencherMes() {

		getDriver().findElement(data_mensal).clear();
		getDriver().findElement(data_mensal).sendKeys(data);
	}
	
	
	public void selecionarLeituras() {

		getDriver().findElement(leituras_disponiveis).click();
		aguardarElemento(opc_leituras_disponiveis);
		getDriver().findElement(opc_leituras_disponiveis).click();
	}

}
