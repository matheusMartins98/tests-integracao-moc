package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class GrupoClientesPage extends CadastroPage{
	
	
	By opcao_grupoClientes = By.xpath("//span[text()='Grupo de Clientes']");
	By txt_nome = By.xpath("//input[@name='name']");
	By txt_descricao = By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[3]");
	By btn_cancelar = By.xpath("//button[text()='Cancelar']");
	By btn_salvar = By.xpath("(//button[text()='Salvar'])[2]");
	By grupo_associado = By.xpath("//select[@name='idGrouping']");
	By opc_grupo = By.xpath("//option[text()='AutomatizadoBase']");
	By txt_nome_filtro = By.xpath("(//input[@type='text'])[4]");
	By btn_pesquisar = By.xpath("//button[text()='Pesquisar']");
	By txt_mensagem = By.xpath("/html/body/app-root/div/simple-notifications/div");
	
	String NomeGrupoBase = "AutomatizadoBase";
	String nomeSubGrupo = "AutomatizadoBaseSub";
	String NomeSubGrupoEditado = "AutomatizadoBaseSubEditado";
	String NomeGrupoBaseEditado = "AutomatizadoBaseEditado";
	
	
	
	public void clicarGrupoClientes() {
		
		getDriver().findElement(opcao_grupoClientes).click();
	}
	
	public void preencherCampos(String nome, String descricao) {
		
		
		getDriver().findElement(txt_nome).click();
		getDriver().findElement(txt_nome).sendKeys(nome);
		getDriver().findElement(txt_descricao).click();
		getDriver().findElement(txt_descricao).sendKeys(descricao);
		
	}
	
public void preencherCamposSub(String nomeSub, String descricaoSub) {
		
		
		getDriver().findElement(txt_nome).click();
		getDriver().findElement(txt_nome).sendKeys(nomeSub);
		getDriver().findElement(txt_descricao).click();
		getDriver().findElement(txt_descricao).sendKeys(descricaoSub);
		
	}
	
	public void salvar() {
		
		aguardarElemento(btn_salvar);
		getDriver().findElement(btn_salvar).click();
	}
	
	public void grupoAssociado() {
		
		getDriver().findElement(grupo_associado).click();
		getDriver().findElement(opc_grupo).click();
		
	}
	
	public void preencherNomeFiltro() {
		
		getDriver().findElement(txt_nome_filtro).click();
		getDriver().findElement(txt_nome_filtro).sendKeys(nomeSubGrupo);
	}
	
	public void clicarBtnPesquisar() {
		
		getDriver().findElement(btn_pesquisar).click();
		
		
	}
	
	public void novoNomeSubGrupo() {
		
		getDriver().findElement(txt_nome).clear();
		getDriver().findElement(txt_nome).sendKeys(NomeSubGrupoEditado);
		
	}
	
	public void novoNomeGrupoBase() {
		
		getDriver().findElement(txt_nome).clear();
		getDriver().findElement(txt_nome).sendKeys(NomeGrupoBaseEditado);
	}
	
	public void preencherNomeGrupo() {
		
		getDriver().findElement(txt_nome_filtro).click();
		getDriver().findElement(txt_nome_filtro).sendKeys(NomeGrupoBase);
	}
	
	
	//metodo para escrever nome do sub grupo editado
	public void subGrupoEditado() {
		
		getDriver().findElement(txt_nome_filtro).click();
		getDriver().findElement(txt_nome_filtro).sendKeys(NomeSubGrupoEditado);
		
	}
	
	
	//metodo para escrever nome do grupo base editado
	public void grupoBaseEditado() {
		
		getDriver().findElement(txt_nome_filtro).click();
		getDriver().findElement(txt_nome_filtro).sendKeys(NomeGrupoBaseEditado);
		
	}
	
}

