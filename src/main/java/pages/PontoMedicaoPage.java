package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import utils.UtilidadesSelenium;

public class PontoMedicaoPage extends UtilidadesSelenium {

	By opcao_pontoMedicao = By.xpath("//span[text()='Ponto de medição']");
	By txt_nome = By.xpath("//input[@name='name']");
	By txt_aneel = By.xpath("//input[@name='register']");
	By txt_latitude = By.xpath("//input[@name='latitude']");
	By txt_longitude = By.xpath("//input[@name='longitude']");
	By txt_externa1 = By.xpath("//input[@name='externalKey']");
	By salvar = By.xpath("(//button[text()='Salvar'])[2]");
	By txt_cliente = By.xpath("//input[@placeholder='Selecione uma opção']");
	By txt_clique_selecionar = By.xpath("(//div[@class='c-btn'])[3]");
	By txt_buscar = By.xpath("(//input[@placeholder='Buscar...'])[3]");
	By opc_buscar = By.xpath("(//div[@class='ng-star-inserted'])[3]");
	By txt_atividade = By.xpath("//div[@class='form-group col-md-6']//select[1]");
	By opc_banco = By.xpath("//option[text()='Banco']");
	By btn_pesquisar = By.xpath("(//button[contains(@class,'btn btn-sm')]/following-sibling::button)[3]");
	By opc_cliente = By.xpath("(//div[@class='checkbox'])[3]");
	By btn_selecionar = By.xpath("//button[text()='Selecionar']");
	By horario_funcionamento = By.xpath("//select[@name='business']");
	By opc_funcionamento = By.xpath("//option[@value='1']");
	By timezone = By.xpath("//select[@name='timezone']");
	By opc_timezone = By.xpath("//option[@value='100']");
	By txt_nome_filtro = By.xpath("(//input[@type='text'])[4]");
	By btn_pesquisar_filtro = By.xpath("(//button[@type='button'])[2]");

	String nome = "PontoMediçãoAutomatizado";
	String codigoAneel = "11809216";
	String Latitude = "-23.560466";
	String Longitude = "-46.5978249";
	String chaveExterna1 = "11809216";
	String controlador = "cas-tecnologia";
	String novoNome = "PontoMediçãoAutomatizadoEditado";

	public void selecionarPontoMedicao() {

		getDriver().findElement(opcao_pontoMedicao).click();
	}

	public void IncluirRegistro() {

		getDriver().findElement(txt_nome).sendKeys(nome);
		getDriver().findElement(txt_aneel).sendKeys(codigoAneel);
		getDriver().findElement(horario_funcionamento).click();
		getDriver().findElement(opc_funcionamento).click();
		getDriver().findElement(timezone).click();
		getDriver().findElement(opc_timezone).click();
		pageDown(txt_externa1);
		getDriver().findElement(txt_latitude).sendKeys(Latitude);
		getDriver().findElement(txt_longitude).sendKeys(Longitude);
		getDriver().findElement(txt_externa1).sendKeys(chaveExterna1);

	}

	public void Salvar() throws InterruptedException {
		Thread.sleep(1000);
		getDriver().findElement(salvar).click();

	}

	public void preencherControlador() {

		getDriver().findElement(txt_cliente).click();
		getDriver().findElement(txt_clique_selecionar).click();
		getDriver().findElement(txt_buscar).sendKeys(controlador);
		getDriver().findElement(opc_buscar).click();

	}

	public void preencherAtividade() throws InterruptedException {

		getDriver().findElement(txt_atividade).click();
		getDriver().findElement(opc_banco).click();
		getDriver().findElement(btn_pesquisar).click();
		Thread.sleep(1000);
		getDriver().findElement(opc_cliente).click();
		getDriver().findElement(btn_selecionar).click();
	}

	public void buscarNomeMedicao() {

		getDriver().findElement(txt_nome_filtro).click();
		getDriver().findElement(txt_nome_filtro).sendKeys(nome);
		getDriver().findElement(btn_pesquisar_filtro).click();

	}

	public void alterarNomeMedicao() {

		getDriver().findElement(txt_nome).clear();
		getDriver().findElement(txt_nome).sendKeys(novoNome);

	}

	public void buscarNomeEditado() {

		getDriver().findElement(txt_nome_filtro).click();
		getDriver().findElement(txt_nome_filtro).sendKeys(novoNome);

	}

}
