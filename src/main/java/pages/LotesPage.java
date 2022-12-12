package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class LotesPage {

	By lotes = By.xpath("//span[text()='Lotes']");
	By nome = By.name("name");
	By descricao = By.name("description");
	By nome_filtro = By.xpath("//label[text()='Nome']/following::input");

	String nomeLote = "Lote Automatizado";
	String nomeLoteEditado = "Lote Automatizado Editadó";

	public void clicarLotes() throws InterruptedException {

		getDriver().findElement(lotes).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//span[text()='Lotes'])[2]")).click();

	}

	public void preencherNomeLote() {

		getDriver().findElement(nome).sendKeys(nomeLote);

	}

	public void preencherDescricao() {

		getDriver().findElement(descricao).sendKeys(nomeLote);

	}
	
	public void informarNomeLote() {

		getDriver().findElement(nome_filtro).sendKeys(nomeLote);

	}
	
	public void alterarNomeLote() {

		getDriver().findElement(nome).clear();
		getDriver().findElement(nome).sendKeys(nomeLoteEditado);
		

	}

	public void informarNomeLoteEditado() {

		getDriver().findElement(nome_filtro).sendKeys(nomeLoteEditado);

	}
}
