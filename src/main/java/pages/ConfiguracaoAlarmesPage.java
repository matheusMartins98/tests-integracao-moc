package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import utils.UtilidadesSelenium;

public class ConfiguracaoAlarmesPage extends UtilidadesSelenium {

	By configuracao_alarmes = By.xpath("//span[text()='Configuração de alarmes']");
	By tipo = By.xpath("(//div[@class='c-btn']//span)[3]");
	By opc_tipo = By.xpath("//label[text()='06 - Alarme Lógico']");
	By subTipo = By.xpath("(//span[text()='Clique para selecionar...'])[3]");
	By opc_Subtipo = By.xpath("//label[text()='04 - Registrador']");
	By prioridade = By.xpath("(//tr[@class='ng-star-inserted']//select)[2]");
	By opc_prioridade = By.xpath("//option[text()='2 - Muito alta']");
	
	
	
	

	public void clicarConfiguracaoAlarmes() throws InterruptedException {

		getDriver().findElement(configuracao_alarmes).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//span[text()='Configuração de alarmes'])[2]")).click();

	}

	public void selecionarTipo() {

		getDriver().findElement(tipo).click();
		getDriver().findElement(opc_tipo).click();

	}

	public void selecionarSubTipo() {

		getDriver().findElement(subTipo).click();
		getDriver().findElement(opc_Subtipo).click();

	}
	
	public void selecionarPrioridade() {

		getDriver().findElement(prioridade).click();
		getDriver().findElement(opc_prioridade).click();

	}
	
	public void verTexto() {
		
		String nivel = getDriver().findElement(prioridade).getText();
		System.out.println(nivel);
	}
	

}
