package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class StatusInstalacaoPage {

	By status_instalacao = By.xpath("//span[text()='Status de instalação']");
	By txt_descricao = By.xpath("//input[@name='description']");
	By txt_codigo = By.xpath("//input[@name='code']");
	By txt_descricao_filtro = By.xpath("//label[text()='Descrição']/following::input");

	String Descricao = "StatusAutomatizado";
	String codigo = "1234567890";
	String DescricaoEditado = "StatusAutomatizadoEditado";

	public void clicarStatusInstalacao() {

		getDriver().findElement(status_instalacao).click();
	}

	public void preencherDescricaoEcodigo() {

		getDriver().findElement(txt_descricao).sendKeys(Descricao);
		getDriver().findElement(txt_codigo).sendKeys(codigo);

	}
	
	public void preencherDescricaoFiltro() {
		
		getDriver().findElement(txt_descricao_filtro).sendKeys(Descricao);
		
	}
	
	public void alterarNomeDescricao() {
		
		getDriver().findElement(txt_descricao).clear();
		getDriver().findElement(txt_descricao).sendKeys(DescricaoEditado);
		
		
		
	}
	
	public void preencherNomeEditado() {
		
		getDriver().findElement(txt_descricao_filtro).sendKeys(DescricaoEditado);
		
	}

}
