package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import utils.UtilidadesSelenium;

public class PrioridadeAlarmePage extends UtilidadesSelenium {
	
	
	
	
	By eventos = By.xpath("//span[text()='Eventos']");
	By opc_prioridade = By.xpath("//span[text()='Prioridade de alarmes']");
	By txt_nivel = By.xpath("//input[@name='numPriority']");
	By txt_nome = By.xpath("//input[@name='name']");
	By btn_salvar = By.xpath("(//button[text()='Salvar'])[2]");
	By selecionar_prioridade = By.xpath("(//input[@type='number'])[1]");
	By nivel_prioridade = By.xpath("//label[text()='99 - Prioridade Aútomatizado']");
	By nivel_prioridade_editado = By.xpath("//label[text()='99 - Prioridade Aútomatizado']");

	String nivel = "99";
	String NomePrioridade = "Prioridade Aútomatizado";
	String NomePrioridadeEditado = "Prioridade Aútomatizado Editado";
	
	public void clicarEventos() {

		getDriver().findElement(eventos).click();
	

	}
	
	public void clicarPrioridade() throws InterruptedException {

		getDriver().findElement(opc_prioridade).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//span[text()='Prioridade de alarmes'])[2]")).click();
	}

	public void preencherNomeEprioridade() {

		getDriver().findElement(txt_nivel).sendKeys(nivel);
		getDriver().findElement(txt_nome).sendKeys(NomePrioridade);
		

	}
	
	public void clicarSalvar() {
		
		getDriver().findElement(btn_salvar).click();
		
	}
	
	public void selecionarNomePrioridade() {

		getDriver().findElement(selecionar_prioridade).click();
		getDriver().findElement(selecionar_prioridade).sendKeys(nivel);
	
	}
	
	public void alterarNomePrioridade() {

		getDriver().findElement(txt_nome).clear();
		getDriver().findElement(txt_nome).sendKeys(NomePrioridadeEditado);
	
	}
	
	public void informarNomePrioridadeEditado() {

		getDriver().findElement(selecionar_prioridade).click();
		getDriver().findElement(selecionar_prioridade).sendKeys(nivel);
	
	}

}
