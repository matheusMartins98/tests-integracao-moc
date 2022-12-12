/**
 * 
 */
package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class GrupoFeriadosPage {

	By opc_grupo_feriados = By.xpath("(//span[text()='Grupo de feriados'])[1]");
	By nome_grupo_feriado = By.xpath("//input[@name='name']");
	By grupo_feriado = By.xpath("//select[@name='holidays']");
	By opc_grupo_feriado = By.xpath("//option[text()='Padrão']");
	By txt_nome_filtro = By.xpath("//input[contains(@class,'form-control ng-untouched')]");

	String nomeGrupoFeriado = "GrupoFeriádoAutomatizado";
	String grupoFeriadoEditado = "GrupoFeriádoAutomatizadoEditado";

	public void clicarGrupoFeriado() throws InterruptedException {

		getDriver().findElement(opc_grupo_feriados).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//span[text()='Grupo de feriados'])[2]")).click();
	}

	public void preencherNome() {

		getDriver().findElement(nome_grupo_feriado).sendKeys(nomeGrupoFeriado);
		getDriver().findElement(grupo_feriado).click();
		getDriver().findElement(opc_grupo_feriado).click();

	}
	
	public void informarNomeGrupo() {

		getDriver().findElement(txt_nome_filtro).sendKeys(nomeGrupoFeriado);
	
	}
	
	public void alterarNomeGrupo() {

		getDriver().findElement(nome_grupo_feriado).clear();
		getDriver().findElement(nome_grupo_feriado).sendKeys(grupoFeriadoEditado);
	
	}
	
	public void informarNomeGrupoEditado() {

		getDriver().findElement(txt_nome_filtro).sendKeys(grupoFeriadoEditado);
	
	}

}
