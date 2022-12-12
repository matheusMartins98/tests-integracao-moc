package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;


public class ModuloComunicacaoPage {

    By btn_cadastro = By.xpath("//a[@title='Cadastros']");
    By btn_negocios = By.xpath("//span[text()='Negócios']");
    By opcao_modulo = By.xpath("(//span[text()='Módulo de comunicação'])[1]");
    By btn_adicionar = By.xpath("(//button[contains(@class,'btn btn-block')])");
    By txt_nome = By.xpath("//input[@name='name']");
    By txt_ssn = By.xpath("//input[@name='ssn']");
    By txt_min = By.xpath("//input[@name='min']");
    By campo_ativado = By.xpath("//select[@name='activated']");
    By opc_ativado = By.xpath("(//option[@value='0'])[2]");
    By campo_comuni = By.xpath("//select[@name='idModuleComm']");
    By opc_comuni = By.xpath("(//option[@value='0'])[3]");
    By opc_comuni2 = By.xpath("(//option[text()='Landis SBE'])[2]");
    By campo_telem = By.xpath("//select[@name='idModuleType']");
    By opc_telem = By.xpath("(//option[@value='10'])");
    By campo_ope = By.xpath("//select[@name='idCellCompany']");
    By opc_ope = By.xpath("(//option[text()='Claro'])[2]");
    //By txt_identificacao = By.xpath("//input[@name='register']");
    By btn_salvar = By.xpath("(//button[text()='Salvar'])[2]");
    By txt_mensagem = By.xpath("//div[text()='Registro incluído com sucesso']");
    By btn_filtro = By.xpath("//h3[text()='Filtros']");
    By txt_nome_filtro = By.xpath("(//label[text()='Nome']/following::input)[1]");
    By btn_pesquisar = By.xpath("//button[text()='Pesquisar']");
    By btn_editar = By.xpath("//a[text()='EDITAR']");
    By btn_deletar = By.xpath("//a[text()='DELETAR']");
    By btn_sim = By.xpath("//button[text()='Sim']");

    public void clicarCadastro() throws InterruptedException {

        Thread.sleep(2000);
        getDriver().findElement(btn_cadastro).click();

    }

    public void clicarNegocios() throws InterruptedException {
        Thread.sleep(2000);

        getDriver().findElement(btn_negocios).click();
    }

    public void opcaoModulo() throws InterruptedException {

        Thread.sleep(2000);
        getDriver().findElement(opcao_modulo).click();
    }

    public void adicionar() {

        getDriver().findElement(btn_adicionar).click();

    }

    public void incluirRegistro(String nome, String ssn) throws InterruptedException {

        getDriver().findElement(txt_nome).sendKeys(nome);
        getDriver().findElement(txt_ssn).sendKeys(ssn);
        getDriver().findElement(txt_min).sendKeys(ssn);
        Thread.sleep(2000);
        getDriver().findElement(campo_ativado).click();
        Thread.sleep(2000);
        getDriver().findElement(opc_ativado).click();
        getDriver().findElement(campo_comuni).click();
        getDriver().findElement(opc_comuni).click();
        getDriver().findElement(campo_telem).click();
        getDriver().findElement(opc_telem).click();
        getDriver().findElement(campo_telem).click();
        getDriver().findElement(opc_telem).click();
        Thread.sleep(2000);
        getDriver().findElement(campo_ope).click();
        Thread.sleep(2000);
        getDriver().findElement(opc_ope).click();
    }

    public void salvar() {

        getDriver().findElement(btn_salvar).click();
    }

    public void validarMensagem() throws InterruptedException {

        String Text = getDriver().findElement(txt_mensagem).getText();
        System.out.println(Text);
        Thread.sleep(4000);


    }


    public void clicarFiltro() {
        getDriver().findElement(btn_filtro).click();
    }

    public void nomeControlador() {

        getDriver().findElement(txt_nome_filtro).click();
        getDriver().findElement(txt_nome_filtro).sendKeys("Willian");

    }

    public void pesquisar() {
        getDriver().findElement(btn_pesquisar).click();
    }

    public void editar() {
        getDriver().findElement(btn_editar).click();

    }

    public void alterarNomeModulo() {

        getDriver().findElement(txt_nome).click();
        getDriver().findElement(txt_nome).clear();
        getDriver().findElement(txt_nome).sendKeys("Modulo novo cas");
        getDriver().findElement(campo_comuni).click();
        getDriver().findElement(opc_comuni2).click();
    }

    public void pesquisarNovoNome() {

        getDriver().findElement(txt_nome_filtro).click();
        getDriver().findElement(txt_nome_filtro).clear();
        getDriver().findElement(txt_nome_filtro).sendKeys("modulo novo cas");

        getDriver().findElement(btn_pesquisar).click();

    }

    public void deletar() {

        getDriver().findElement(btn_deletar).click();

    }

    public void opcaoSim() {
        getDriver().findElement(btn_sim).click();
    }


}
