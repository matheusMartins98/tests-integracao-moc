package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import utils.UtilidadesSelenium;

public class DisponibilidadeDeLeituraDeRegistradoresPage extends UtilidadesSelenium{
	
	By disponibilidadeDeLeitura = By.xpath("//span[text()='Disponibilidade de leitura de registradores']");
	By campo_Serial = By.name("serials");
	By buscar_Serial = By.xpath("(//input[@placeholder='Buscar...'])[2]");
	By opc_buscar = By.xpath("//label[text()='11809200']");
	
	public void clicarEmDisponibilidadeDeLeitura() throws InterruptedException {

		getDriver().findElement(disponibilidadeDeLeitura).click();

	}
	
	public void preencherSerial(String serial) {
		
		getDriver().findElement(campo_Serial).click();
		getDriver().findElement(buscar_Serial).click();
		getDriver().findElement(buscar_Serial).sendKeys(serial);
		aguardarElemento(opc_buscar);
		getDriver().findElement(opc_buscar).click();
		
	}
	
}
