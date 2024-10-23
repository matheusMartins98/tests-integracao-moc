package runner;

import static core.DriverFactory.killDriver;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "test.features",
        tags = "@Cadastros",
        glue = "steps",
        plugin = {"html:target/cucumber-report/report.html"},
        snippets = SnippetType.CAMELCASE,
         monochrome = true
        )   
public class TestRunner {
	
	@AfterClass
	 public static void fecharChrome() {
    	killDriver();
    }

	
    
	 }

	

 