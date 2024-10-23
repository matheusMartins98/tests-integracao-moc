package utils;

import static core.DriverFactory.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	

public class UtilidadesSelenium {
	
	By txt_externa1 = By.xpath("//input[@name='externalKey']");
	
	
	// metodo para fazer scroll na pagina
	// metodo faz scroll para localizar o elemento
	public void pageDown(By Elemento) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();  
		WebElement elemento = getDriver().findElement(Elemento);
		js.executeScript("arguments[0].scrollIntoView();", elemento);
		
	}
	
	public void aguardarElemento(By locator) {
		
		WebDriverWait espera = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
		espera.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		
	}
	
	public void scrool() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();  
		js.executeScript("scroll(0,400)");
		
	}

}
