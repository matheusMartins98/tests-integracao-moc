package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class MonitoramentoClientesPage {

	By monitoramento_clientes = By.xpath("//span[text()='Monitoramento de clientes']");
	By registros = By.xpath("(//label[@class='input-icheck']//span)[1]");
	By marcar_monitoramento = By.xpath("//button[@title='Marcar monitoramento']");
	By clientes_monitorados = By.xpath("(//input[@name='typeMonitorCustomer'])[2]");
	By desmarcar_monitoramento = By.xpath("//button[@title='Desmarcar monitoramento']");
	By clientes_NãoMonitorados = By.xpath("(//input[@name='typeMonitorCustomer'])[3]");
	By atividade = By.name("activity");
	By opc_atividade = By.xpath("//option[text()='Banco']");

	public void clicarMonitoramentoClientes() throws InterruptedException {

		getDriver().findElement(monitoramento_clientes).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//span[text()='Monitoramento de clientes'])[2]")).click();

	}

	public void marcarRegistros() {

		getDriver().findElement(registros).click();

	}

	public void btnMarcarMonitoramento() {

		getDriver().findElement(marcar_monitoramento).click();

	}

	public void opcClientesMonitorados() {

		getDriver().findElement(clientes_monitorados).click();

	}

	public void btnDesmarcarMonitoramento() {

		getDriver().findElement(desmarcar_monitoramento).click();

	}

	public void opcClientesNaoMonitorados() {

		getDriver().findElement(clientes_NãoMonitorados).click();

	}
	
	public void selecionarAtividade() {

		getDriver().findElement(atividade).click();
		getDriver().findElement(opc_atividade).click();
	}
}
