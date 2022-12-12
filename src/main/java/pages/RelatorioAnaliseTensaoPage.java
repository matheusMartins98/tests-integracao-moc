package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class RelatorioAnaliseTensaoPage {

	By analise_tensao = By.xpath("(//span[text()='Análise de tensão'])[1]");
	By medidor_serial = By.xpath("(//input[@name='meterSerial'])[2]");
	By busca_medidor = By.xpath("((//label[text()='Medidor (Serial)'])[3]/following::input)[1]");
	By btn_pesquisar = By.xpath("//button[text()='Pesquisar']");
	By opc_medidor = By.xpath("(//i[contains(@class,'cr-icon glyphicon')])[3]");
	By btn_selecionar = By.xpath("//button[text()='Selecionar']");
	By mes_ano = By.xpath("//input[@name='dataMensal']");
	By btn_filtrar = By.xpath("(//button[@type='button'])[2]");
	By btn_exportar = By.xpath("//button[text()[normalize-space()='Exportar']]");
	By opc_CSV = By.xpath("//a[text()='Exportar .CSV']");

	String data = "08/2022";

	public void clicarAnaliseTensao() {

		getDriver().findElement(analise_tensao).click();
	}

	public void clicarMedidorSerial() {

		getDriver().findElement(medidor_serial).click();
	}

	public void preencherMedidorSerial(String serial) {

		getDriver().findElement(busca_medidor).click();
		getDriver().findElement(busca_medidor).sendKeys(serial);

	}

	public void clicarPesquisar() {

		getDriver().findElement(btn_pesquisar).click();
	}

	public void clicarOpcMedidor() {

		getDriver().findElement(opc_medidor).click();
		getDriver().findElement(btn_pesquisar).click();

	}

	public void clicarBtnSelecionar() {

		getDriver().findElement(btn_selecionar).click();

	}

	public void selecionarMesAno() {

		getDriver().findElement(mes_ano).click();
		getDriver().findElement(mes_ano).clear();
		getDriver().findElement(mes_ano).sendKeys(data);

	}

	public void clicarBtnFiltrar() {

		getDriver().findElement(btn_filtrar).click();

	}

	public void clicarBtnExportar() {

		getDriver().findElement(btn_exportar).click();

	}

	public void clicarOpcCsv() {

		getDriver().findElement(opc_CSV).click();

	}

}
