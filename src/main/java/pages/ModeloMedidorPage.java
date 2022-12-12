package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class ModeloMedidorPage {

	By adicionais_negocios = By.xpath("//span[text()='Adicionais ao negócio']");
	By modelo_medidor = By.xpath("//span[text()='Modelo do medidor']");
	By txt_nome_medidor = By.xpath("//input[@name='name']");
	By campo_protocolo = By.xpath("//select[@name='meterProtocol']");
	By opc_protocolo = By.xpath("//option[@value='3']");
	By campo_fabricante = By.xpath("//select[@name='meterManufacturer']");
	By opc_fabricante = By.xpath("//option[@value='6']");
	By txt_nome_filtro = By.xpath("//label[text()='Nome']/following-sibling::input");
	
	
	String nomeMedidor = "MedidorAutomatizado";
	String NovoNomeMedidor = "MedidorAutomatizadoEditado";
	

	public void clicarAdicionaisNegocios() {

		getDriver().findElement(adicionais_negocios).click();
	}

	public void clicarModeloMedidor() {

		getDriver().findElement(modelo_medidor).click();
	}

	public void preencherNome() {

		getDriver().findElement(txt_nome_medidor).sendKeys(nomeMedidor);

	}

	public void EscolherProtocolo() {

		getDriver().findElement(campo_protocolo).click();
		getDriver().findElement(opc_protocolo).click();

	}

	public void EscolherFabricante() {

		getDriver().findElement(campo_fabricante).click();
		getDriver().findElement(opc_fabricante).click();

	}
	
	public void preencherNomeMedidor() {
		
		getDriver().findElement(txt_nome_filtro).sendKeys(nomeMedidor);
		
	}
	
	public void preencherNovoNome() {
		
		getDriver().findElement(txt_nome_medidor).clear();
		getDriver().findElement(txt_nome_medidor).sendKeys(NovoNomeMedidor);
		
	}
}
