package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import utils.UtilidadesSelenium;

public class GraficoDeFasorialPage extends UtilidadesSelenium {
	
	By grafico = By.xpath("//span[text()='Gráfico de Fasorial']");
	By opc_cliente = By.xpath("(//div[@class='checkbox'])[3]");
	By btn_selecionar = By.xpath("//button[text()='Selecionar']");
	By pesquisar = By.xpath("//button[text()='Pesquisar']");
	By personalizado = By.xpath("//label[text()='Personalizado']");
	By DtInicial = By.name("dtInicial");
	By DtFinal = By.name("dtFinal");
	
	String DataInicial = "01/10/2022";
	String DataFinal = "31/10/2022";
	
	public void clicarEmGraficoFasorial() throws InterruptedException {

		getDriver().findElement(grafico).click();
		
//		Thread.sleep(200000);
	}
	
	public void clicarEmSelecionar()  {

		getDriver().findElement(pesquisar).click();
		aguardarElemento(opc_cliente);
		getDriver().findElement(opc_cliente).click();
		getDriver().findElement(btn_selecionar).click();

	}
	
	
	public void periodoPersonalizado() {

		getDriver().findElement(personalizado).click();
		getDriver().findElement(DtInicial).clear();
		getDriver().findElement(DtInicial).sendKeys(DataInicial);
		getDriver().findElement(DtFinal).clear();
		getDriver().findElement(DtFinal).sendKeys(DataFinal);

	}
	
	
	

}
