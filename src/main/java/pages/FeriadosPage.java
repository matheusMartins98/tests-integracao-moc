package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import utils.PegaMassa;

public class FeriadosPage {

	By faturamento_tarifas = By.xpath("//span[text()='Faturamento e Tarifas']");
	By opc_feriados = By.xpath("//span[text()='Feriados']");
	By txt_nome_feriado = By.xpath("//input[@name='name']");
	By txt_nome_filtro = By.xpath("//input[contains(@class,'form-control ng-untouched')]");
	
	String nomeFeriado = "FeriádoAutomatizado";
	String nomeFeriadoEditado = "FeriádoAutomatizadoEditado";

	public void clicarFaturamentoTarifas() {

		getDriver().findElement(faturamento_tarifas).click();
	}

	public void clicarOpcFeriados() throws InterruptedException {

		getDriver().findElement(opc_feriados).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//span[text()='Feriados'])[2]")).click();

	}

	public void preencherNomeFeriado() throws Exception {

		getDriver().findElement(txt_nome_feriado).sendKeys((PegaMassa.getMassa("Cliente", 0)));

	}

	public void informarNomeFeriado() throws Exception {

		getDriver().findElement(txt_nome_filtro).sendKeys((PegaMassa.getMassa("Cliente", 0)));

	}
	
	public void alterarNomeFeriado() {

		getDriver().findElement(txt_nome_feriado).clear();
		getDriver().findElement(txt_nome_feriado).sendKeys(nomeFeriadoEditado);

	}
	
	public void informarNomeFeriadoEditado() {

		getDriver().findElement(txt_nome_filtro).sendKeys(nomeFeriadoEditado);

	}

}
