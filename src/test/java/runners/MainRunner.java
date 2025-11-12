package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", 
				glue= {"stepDefinitions"}, 
				monochrome=true, dryRun=false,
				plugin= {"pretty", "html:target/cucmber", "json:target/cucumber.json"})
                 
public class MainRunner extends AbstractTestNGCucumberTests{

}
