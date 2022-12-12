package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import utils.UtilidadesSelenium;

public class NotificacaoEventosPage extends UtilidadesSelenium {

	By notificacao_eventos = By.xpath("//span[text()='Notificação de eventos']");
	By txt_nome = By.xpath("(//input[@name='name'])[2]");
	By controlador = By.xpath("//angular2-multiselect[@name='resellers']");
	By txt_buscar = By.xpath("(//input[@placeholder='Buscar...'])[6]");
	By opc_buscar = By.xpath("(//ul[@class='lazyContainer'])[6]");
	By tipo_alarme = By.xpath("//angular2-multiselect[@name='typeAlarm']");
	By opc_alarme = By.xpath("(//label[text()='05 - Alarme Físico'])[2]");
	By subtipo_alarme = By.xpath("//angular2-multiselect[@name='subTypeAlarm']");
	By opc_subtipo = By.xpath("(//label[text()='01 - Comunicando'])[2]");
	By usuario = By.xpath("//angular2-multiselect[@name='users']");
	By buscar_usuario = By.xpath("(//input[@placeholder='Buscar...'])[14]");
	By opc_usuario = By.xpath(
			"/html/body/modal-container/div/div/app-event-notification-modal/div/div[2]/div[1]/app-event-notification-detail/form/div[1]/div/div[3]/fieldset/div[1]/div[3]/div/angular2-multiselect/div/div[2]/div[3]/div[1]");
	By opc_residencial = By.xpath("(//input[@name='system']/following-sibling::span)[2]");

	String nome = "Noticação automatizada";
	String nomeEditado = "Noticação automatizada editado";
	String Controlador = "NÃO APAGAR";
	String Usuario = "Administrador";

	public void clicarNotificacaoEventos() throws InterruptedException {

		getDriver().findElement(notificacao_eventos).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//span[text()='Notificação de eventos'])[2]")).click();

	}

	public void preencherNome() {

		getDriver().findElement(txt_nome).sendKeys(nome);

	}

	public void selecionarControlador() {

		getDriver().findElement(controlador).click();
		getDriver().findElement(txt_buscar).sendKeys(Controlador);
		aguardarElemento(opc_buscar);
		getDriver().findElement(opc_buscar).click();

	}

	public void tipoAlarme() {

		pageDown(usuario);
		getDriver().findElement(tipo_alarme).click();
		aguardarElemento(opc_alarme);
		getDriver().findElement(opc_alarme).click();
	}

	public void subTipoAlarme() {

		getDriver().findElement(subtipo_alarme).click();
		aguardarElemento(opc_subtipo);
		getDriver().findElement(opc_subtipo).click();
	}

	public void selecionarUsuario() throws InterruptedException {

		getDriver().findElement(usuario).click();
		getDriver().findElement(buscar_usuario).sendKeys(Usuario);
		aguardarElemento(opc_usuario);
		getDriver().findElement(opc_usuario).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//button[text()='Salvar'])[2]")).click();

	}

	public void clicarNotificacao() {

		aguardarElemento(opc_residencial);
		getDriver().findElement(opc_residencial).click();

	}

	public void informarNomeNotificacao() {

		getDriver().findElement(txt_nome).sendKeys(nome);

	}

	public void alterarNomeNotificacao() {

		getDriver().findElement(txt_nome).clear();
		getDriver().findElement(txt_nome).sendKeys(nomeEditado);

	}

	public void informarNomeNotificacaoEditado() {

		getDriver().findElement(txt_nome).sendKeys(nomeEditado);

	}

}
