package Runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report.html"},
							features = {"src/test/java/Features"},//Package name containing Features
							glue = {"StepDefinitions"})//Package name containing Step definitions

public class TestRunner {

}
