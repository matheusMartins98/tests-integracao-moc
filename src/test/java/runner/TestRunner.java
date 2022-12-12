package runner;

import static core.DriverFactory.killDriver;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "test.features",
        tags = {"@TemperaturaDoModuloDeComunicacao"},
        glue = "steps",
        plugin = {"html:target/cucumber-report, pretty"},
        snippets = SnippetType.CAMELCASE,
         monochrome = true
        )   
public class TestRunner {
	
	@AfterClass
	 public static void fecharChrome() {
    	killDriver();
    }

	
    
	 }

	

 