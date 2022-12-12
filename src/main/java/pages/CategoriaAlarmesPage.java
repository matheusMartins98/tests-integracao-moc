package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class CategoriaAlarmesPage {

	By categoria_alarmes = By.xpath("//span[text()='Categoria de Alarmes']");
	By txt_descricao = By.xpath("//input[@name='name']");
	By txt_filtro = By.xpath("//label[text()='Descrição']/following::input");

	String descricao = "Descrição Automátizado";
	String descricaoEditada = "Descrição Automátizado Editada";

	public void clicarCategoria() throws InterruptedException {

		getDriver().findElement(categoria_alarmes).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//span[text()='Categoria de Alarmes'])[2]")).click();
	}

	public void preencherDescricao() {

		getDriver().findElement(txt_descricao).sendKeys(descricao);

	}

	public void informarNomeCategoria() {

		getDriver().findElement(txt_filtro).sendKeys(descricao);

	}
	
	public void alterarNomeCategoria() {

		getDriver().findElement(txt_descricao).clear();
		getDriver().findElement(txt_descricao).sendKeys(descricaoEditada);

	}
	
	public void informarNomeCategoriaEditada() {

		getDriver().findElement(txt_filtro).sendKeys(descricaoEditada);
	

	}

}
