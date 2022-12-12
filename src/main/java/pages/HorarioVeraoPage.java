package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class HorarioVeraoPage {
	
	
	By opc_horario_verao = By.xpath("(//span[text()='Horário de verão'])[1]");
	By txt_nome = By.xpath("//input[@name='name']");
	By btn_salvar = By.xpath("//input[@name='externalKey']");
	By txt_nome_filtro = By.xpath("//label[text()='Nome']/following::input");
	
	
	
	String NomeHorario = "Horário de Verão Automatizado";
	String NomeHorarioEditado = "Horário de Verão Automatizado Editado";
	
	
	
	public void clicarHorarioVerao() throws InterruptedException {

		getDriver().findElement(opc_horario_verao).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//span[text()='Horário de verão'])[2]")).click();
	}

	public void preencherNomeHorario() {

		getDriver().findElement(txt_nome).sendKeys(NomeHorario);
	

	}
	
	public void informarNomeHorario() {

		getDriver().findElement(txt_nome_filtro).sendKeys(NomeHorario);
	
	}
	
	public void alterarNomeHorario() {

		getDriver().findElement(txt_nome).clear();
		getDriver().findElement(txt_nome).sendKeys(NomeHorarioEditado);
	
	}
	
	public void informarNomeHorarioEditado() {

		getDriver().findElement(txt_nome_filtro).sendKeys(NomeHorarioEditado);
	
	}

}
