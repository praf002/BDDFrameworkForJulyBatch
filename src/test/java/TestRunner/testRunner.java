package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features= {"features"},
			glue= {"StepDefination"},
			monochrome=true,
			dryRun=false,
			plugin= {"html:target/cucumber_html.html"},
			tags= "@End2EndDealsPage"
		
		)
public class testRunner {

}
