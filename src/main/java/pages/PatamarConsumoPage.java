package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class PatamarConsumoPage {

	String nomePatamar = "AutomatizadoAlto";
	String NomePatamarEditado = "AutomatizadoAltoEditado";

	By nome_patamar = By.xpath("//input[@name='name']");
	By limite_superior = By.xpath("//input[@name='superiorLimit']");
	By opc_patamar_consumo = By.xpath("(//span[text()='Patamar de consumo'])[1]");
	By filtro_nome_patamar = By.xpath("(//span[text()='Clique para selecionar...'])[2]");
	By filtro_opc_pamatar = By.xpath("//label[text()='"+nomePatamar+"']");
	By filtro_opc_editado = By.xpath("//label[text()='"+NomePatamarEditado+"']");

	// salvar
	public void preencherNomePatamar(String nomePatamar, String limiteSuperior) {

		getDriver().findElement(nome_patamar).sendKeys(nomePatamar);
		getDriver().findElement(limite_superior).sendKeys(limiteSuperior);
	}

	public void clicarEmPatamarConsumo() {

		getDriver().findElement(opc_patamar_consumo).click();

	}

	// editar
	public void clicarNomePamatar() {

		getDriver().findElement(filtro_nome_patamar).click();
		getDriver().findElement(filtro_opc_pamatar).click();

	}

	public void alterarNomePatamar() {

		getDriver().findElement(nome_patamar).clear();
		getDriver().findElement(nome_patamar).sendKeys(NomePatamarEditado);

	}

	// excluir
	public void clicarNomeEditado() {

		getDriver().findElement(filtro_nome_patamar).click();
		getDriver().findElement(filtro_opc_editado).click();

	}

}
