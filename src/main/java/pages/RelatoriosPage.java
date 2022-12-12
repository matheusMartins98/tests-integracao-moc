package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class RelatoriosPage {
	
	// Relatorio Indicadores de DRP e DRC parciais
	By btn_relatorios = By.xpath("//a[@title='Relatórios']");
	By gp_qualidade = By.xpath("//span[text()='Qualidade de Energia']");
	By opc_drp = By.xpath("//span[text()='Indicadores de DRP e DRC parciais']");
	By data_inicial = By.xpath("//input[@name='dtInicial']");
	By data_final = By.xpath("//input[@name='dtFinal']");
	By C_serial = By.xpath("(//angular2-multiselect//span)[7]");
	By txt_buscar = By.xpath("(//angular2-multiselect//input)[33]");
	By opc_busca = By.xpath("(//angular2-multiselect//li)[31]");
	By btn_filtrar = By.xpath("//button[text()='Filtrar']");
	By DRP_A = By.xpath("(//tr//td)[9]");
	By DRP_B = By.xpath("(//tr//td)[10]");
	By DRP_C = By.xpath("(//tr//td)[11]");
	By DRC_A = By.xpath("(//tr//td)[12]");
	By DRC_B = By.xpath("(//tr//td)[13]");
	By DRC_C = By.xpath("(//tr//td)[14]");
	By btn_exportar = By.xpath("//button[@class='btn btn-default export-button dropdown-toggle']");
	By exportar_xls = By.xpath("//a[text()='Exportar .CSV']");
	
	

	public void clicarRelatorio() throws InterruptedException {
		
		Thread.sleep(2000);
		getDriver().findElement(btn_relatorios).click();

	}

	public void clicarQualidadeEnergia() {

		getDriver().findElement(gp_qualidade).click();
	}

	public void clicarDRPeDRC() throws InterruptedException {

		Thread.sleep(2000);
		getDriver().findElement(opc_drp).click();
	}

	public void SelecionarDatas() throws InterruptedException {

		Thread.sleep(2000);
		getDriver().findElement(data_inicial).click();
		getDriver().findElement(data_inicial).clear();
		getDriver().findElement(data_inicial).sendKeys("18/11/2021");
		getDriver().findElement(data_final).click();
		getDriver().findElement(data_final).clear();
		getDriver().findElement(data_final).sendKeys("26/11/2021");

	}

	public void EscreverSerial(String Serial) throws InterruptedException {

		getDriver().findElement(C_serial).click();
		Thread.sleep(2000);
		getDriver().findElement(txt_buscar).click();
		getDriver().findElement(txt_buscar).sendKeys(Serial);
		Thread.sleep(1000);
		getDriver().findElement(opc_busca).click();
	}

	public void clicarBtnFiltrar() {

		getDriver().findElement(btn_filtrar).click();
	}


	public void pegarTexto() {
		
		// campos DRP A, B E C		
		String texto1 = getDriver().findElement(DRP_A).getText();
		Assert.assertEquals("51,48%", texto1);
		System.out.println("DRP_A= " + texto1);
		String texto2 = getDriver().findElement(DRP_B).getText();
		Assert.assertEquals("0,00%", texto2);
		System.out.println("DRP_B= " + texto2);
		String texto3 = getDriver().findElement(DRP_C).getText();
		Assert.assertEquals("51,58%", texto3);
		System.out.println("DRP_C= " + texto3);
		
		// campos DRC A, B E C	
		String texto4 = getDriver().findElement(DRC_A).getText();
		Assert.assertEquals("0,00%", texto4);
		System.out.println("DRC_A= " + texto4);
		String texto5 = getDriver().findElement(DRC_B).getText();
		Assert.assertEquals("0,00%", texto5);
		System.out.println("DRC_B= " + texto5);
		String texto6 = getDriver().findElement(DRC_C).getText();
		Assert.assertEquals("0,00%", texto6);
		System.out.println("DRC_C= " + texto6);
	}
	
	public void downloadRelatorio() {
		
		getDriver().findElement(btn_exportar).click();
		getDriver().findElement(exportar_xls).click();
	}
	
	
	

}
