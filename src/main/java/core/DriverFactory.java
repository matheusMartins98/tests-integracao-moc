package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.Propriedades;

public class DriverFactory {

	private static WebDriver driver;

	public DriverFactory() {
	}

	public static WebDriver getDriver() {
		String Bowser = Propriedades.getInstance().getProperty("browser").trim();
		if (driver == null) {
			if (Bowser.equals("CHROME")) {
				driver = new ChromeDriver();
			} else if (Bowser.equals("FIREFOX")) {
				driver = new FirefoxDriver();
			}
		}
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}