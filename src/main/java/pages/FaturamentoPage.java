package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import utils.UtilidadesSelenium;

public class FaturamentoPage extends UtilidadesSelenium {
	
	By faturamento = By.xpath("//span[text()='Faturamento']");
	By Serial = By.name("serials");
	By txt_buscar = By.xpath("(//input[@placeholder='Buscar...'])[3]");
	private String serial;
	By opc_buscar = By.xpath("//label[text()='"+serial+"']");
	
	
	public void clicarEmFaturamento() throws InterruptedException {

		getDriver().findElement(faturamento).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//span[text()='Faturamento'])[2]")).click();

	}
	
	public void escreverSerial(String serial) {
		
		getDriver().findElement(Serial).click();
		getDriver().findElement(txt_buscar).click();
		getDriver().findElement(txt_buscar).sendKeys(serial);
		aguardarElemento(opc_buscar);
		getDriver().findElement(opc_buscar).click();
		
	}

}
