package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class AtividadesPage {

	String nomeAtividade = "AtívidadeAutomatizado";
	String codigoAtividade = "1425366656";
	String descricaoAtividade = "Magna libero phasellus aliquet tristique torquen - Magna libero phasellus aliquet tristique torquen";
	String nomeAtividadeEditado = "AtívidadeAutomatizadoEditado";

	// elementos da pagina ATIVIDADES
	By menu_atividades = By.xpath("//span[text()='Atividades']");
	By atividade = By.xpath("(//span[text()='Atividade'])[1]");
	By txt_nome = By.xpath("//input[@name='name']");
	By txt_codigo = By.xpath("//input[@name='code']");
	By classe_atividade = By.xpath("//select[@name='class']");
	By opc_ativdade = By.xpath("//option[text()='Serviços']");
	By horario_funcionamento = By.xpath("//select[@name='business']");
	By opc_horario = By.xpath("//option[text()='Padrão']");
	By descricao = By.xpath("//textarea[@name='description']");
	By txt_descricao = By.xpath("//input[@name='description']");
	By txt_nome_filtro = By.xpath("//input[contains(@class,'form-control ng-untouched')]");

	// elementos da pagina CLASSE ATIVIDADE
	String nomeClasse = "ClasseAtividadeAútomatizado";
	String nomeClasseEditado = "ClasseAtividadeAútomatizadoEditado";
	String codigoClasse = "12235879";
	By opc_classe_Atividade = By.xpath("//span[text()='Classe de Atividade']");
	
	// elementos da pagina HRS FUNCIONAMENTO
	By opc_Hrs_funcionamento = By.xpath("(//span[text()='Hrs. Funcionamento'])[1]");
	String nomeHrsFuncionamento = "HorarioFuncionamentoAútomatizado";
	String nomeHrsFuncionamentoEditado = "HorarioFuncionamentoAútomatizadoEditado";
	String DescricaoHrsFuncionamento = "Horário padrão de funcionamento";
	
	

	// metodos da pagina ATIVIDADE
	public void menuAtividades() {

		getDriver().findElement(menu_atividades).click();

	}

	public void opcAtividade() throws InterruptedException {

		getDriver().findElement(atividade).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//span[text()='Atividade'])[2]")).click();

	}

	// preenche os campos nome, codigo atividade e descrição
	public void PreencherCampos() {

		getDriver().findElement(txt_nome).sendKeys(nomeAtividade);
		getDriver().findElement(txt_codigo).sendKeys(codigoAtividade);
		getDriver().findElement(descricao).sendKeys(descricaoAtividade);
	}

	public void selecionarOpcoes() {

		getDriver().findElement(classe_atividade).click();
		getDriver().findElement(opc_ativdade).click();

		getDriver().findElement(horario_funcionamento).click();
		getDriver().findElement(opc_horario).click();

	}

	public void informarNomeAtividade() {

		getDriver().findElement(txt_nome_filtro).sendKeys(nomeAtividade);
	}

	public void alterarNomeAtividade() {

		getDriver().findElement(txt_nome).clear();
		getDriver().findElement(txt_nome).sendKeys(nomeAtividadeEditado);
	}

	public void informarNomeAtividadeEditado() {

		getDriver().findElement(txt_nome_filtro).sendKeys(nomeAtividadeEditado);

	}

	// metodos da pagina CLASSE DE ATIVIDADE
	public void opcClasse() throws InterruptedException {

		getDriver().findElement(opc_classe_Atividade).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//span[text()='Classe de Atividade'])[2]")).click();

	}
	
	public void PreencherCamposClasse() {

		getDriver().findElement(txt_nome).sendKeys(nomeClasse);
		getDriver().findElement(txt_codigo).sendKeys(codigoClasse);
		getDriver().findElement(descricao).sendKeys(descricaoAtividade);
	}

	public void informarNomeClasse() {

		getDriver().findElement(txt_nome_filtro).sendKeys(nomeClasse);
	}
	
	public void alterarNomeClasse() {

		getDriver().findElement(txt_nome).clear();
		getDriver().findElement(txt_nome).sendKeys(nomeClasseEditado);
	}
	
	public void informarNomeClasseEditado() {

		getDriver().findElement(txt_nome_filtro).sendKeys(nomeClasseEditado);

	}
	
	//Metodos HRS FUNCIONAMENTO
	public void opcHrsFuncionamento() throws InterruptedException {

		getDriver().findElement(opc_Hrs_funcionamento).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//span[text()='Hrs. Funcionamento'])[2]")).click();

	}
	
	public void PreencherCamposHrs() {

		getDriver().findElement(txt_nome).sendKeys(nomeHrsFuncionamento);
		getDriver().findElement(txt_descricao).sendKeys(DescricaoHrsFuncionamento);
	}
	
	public void informarNomeHrsFuncionamento() {

		getDriver().findElement(txt_nome_filtro).sendKeys(nomeHrsFuncionamento);
	}
	
	public void alterarNomeHrsFuncionamento() {

		getDriver().findElement(txt_nome).clear();
		getDriver().findElement(txt_nome).sendKeys(nomeHrsFuncionamentoEditado);
	}
	
	public void informarNomeHrsFuncionamentoEditado() {

		getDriver().findElement(txt_nome_filtro).sendKeys(nomeHrsFuncionamentoEditado);

	}

}
