package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class LoginPage {
	

	By txt_usuario = By.xpath("//input[@placeholder='usuário']");
	By txt_senha = By.xpath("//input[@placeholder='senha']");
	By btn_entrar = By.xpath("//input[@value='Login']");

	public void inserirUsuario() {

		getDriver().findElement(txt_usuario).sendKeys("admin");
		getDriver().findElement(txt_senha).sendKeys("admin");
		getDriver().findElement(btn_entrar).click();

	}
	
	

}
