package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import utils.UtilidadesSelenium;

public class RegistradoresParaUmaListaDeMedidoresPage extends UtilidadesSelenium{

	By medicao = By.xpath("//span[text()='Medição']");
	By lista_medidores = By.xpath("//span[text()='Leitura de Registradores para uma lista de medidores']");
	By serial = By.name("serials");
	By data = By.xpath("(//input[@name='typeFindRead'])[2]");
	By txt_buscar = By.xpath("(//input[@placeholder='Buscar...'])[2]");
	By XLS = By.linkText("Exportar .XLS");
	By btn_filtrar = By.xpath("(//button[@type='button'])[2]");
	
	
	String nSerial = "14753530";
	
	

	public void clicarMedicao() {

		getDriver().findElement(medicao).click();

	}

	public void clicarListaDeMedidores() {

		getDriver().findElement(lista_medidores).click();

	}
	
	public void clicarSerial() {

		getDriver().findElement(serial).click();
		getDriver().findElement(txt_buscar).sendKeys(nSerial);
		

	}
	
	public void clicarOpcData() {

		getDriver().findElement(data).click();
		pageDown(btn_filtrar);
		

	}
	
	
	public void clicarOpcXLS() {

		getDriver().findElement(XLS).click();

	}
	

}
