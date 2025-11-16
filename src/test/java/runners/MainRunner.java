package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", 
				glue= {"stepDefinitions"}, 
				monochrome=true, dryRun=false,
<<<<<<< HEAD
				plugin= {"pretty", "html:target/cucmber", "json:target/cucumber.json"})
=======
				plugin= {"pretty", "html:target/ranani.html", "json:target/cucumber.json"})
>>>>>>> 1a0b864 (update commit)
                 
public class MainRunner extends AbstractTestNGCucumberTests{

}
