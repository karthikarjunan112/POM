package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//test//resources//features//Login.feature",
		glue ={"stepdefs"},
		dryRun = false,
		monochrome =true,
		strict =true,
	
		plugin ={"pretty"}
		)
public class LoginRunner {

}
