package cucumberJava;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class) 
//@CucumberOptions(format = {"pretty", "html:target/Destination"})
//@CucumberOptions(format = {"pretty", "html:target/cucumber-html-report", "pretty:target/cucumber-report.json"})
@CucumberOptions( monochrome = true,plugin = {"html:target/cucumber-html-report1", "json:target/cucumber-json-report.json" })
public class runTest { }
