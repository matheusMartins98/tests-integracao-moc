package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import utils.UtilidadesSelenium;

public class ClientePage extends UtilidadesSelenium{

	By opcao_Clientes = By.xpath("//span[text()='Cliente']");
	By txt_nome = By.xpath("//input[@name='name']");
	By txt_contrato = By.xpath("//input[@name='contract']");
	By txt_registro = By.xpath("//input[@name='register']");
	By campo_atividade = By.xpath("(//select[@name='activity'])[2]");
	By opc_atividade = By.xpath("(//option[text()='Banco'])[2]");
	By campo_controlador = By.xpath("//select[@name='reseller']");
	By opc_controlador = By.xpath("//option[text()='CAS-Tecnologia']");
	By txt_externa1 = By.xpath("//input[@name='externalKey']");
	By btn_salvar = By.xpath("//input[@name='externalKey']");
	By txt_nome_filtro = By.xpath("(//input[@type='text'])[4]");
	
	
	
	String NomeCliente = "ClienteAutomatizado";
	String NomeClienteEditado = "ClienteEditadoAutomatizado";
	
	
	public void opcClientes() {

		getDriver().findElement(opcao_Clientes).click();

	}

	// preenche os campos do incluir registro
	public void preencherCampos(String nome, String contrato, String registro) {

		getDriver().findElement(txt_nome).sendKeys(nome);
		getDriver().findElement(txt_contrato).sendKeys(contrato);
		getDriver().findElement(txt_registro).sendKeys(registro);

	}

	// clica e escolhe opções do campo, atividade e controlador
	public void clicarOpcoes(String chaveExterna1) {

		getDriver().findElement(campo_atividade).click();
		getDriver().findElement(opc_atividade).click();
		getDriver().findElement(campo_controlador).click();
		getDriver().findElement(opc_controlador).click();
		getDriver().findElement(txt_externa1).sendKeys(chaveExterna1);

	}
	
	public void preencherNomeFiltro() {
		
		getDriver().findElement(txt_nome_filtro).click();
		getDriver().findElement(txt_nome_filtro).sendKeys(NomeCliente);
		
	}
	
	public void inserirNovoNome() {
		
		getDriver().findElement(txt_nome).clear();
		getDriver().findElement(txt_nome).sendKeys(NomeClienteEditado);
	}
	
	public void InserirNomeEditado() {
		
		
		getDriver().findElement(txt_nome_filtro).click();
		getDriver().findElement(txt_nome_filtro).sendKeys(NomeClienteEditado);
		
	}

}
