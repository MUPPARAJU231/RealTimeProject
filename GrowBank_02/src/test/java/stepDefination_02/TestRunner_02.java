package stepDefination_02;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src/test/java/featureFiles_02",
		glue= {"stepDefination_02"},
		dryRun=false,
		monochrome=false,
		plugin= {"pretty","html:target/HtmlReport/cucumberReport.html",
  				          "json:target/cucumber-report/cucumber.json",
			 
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}

		)
public class TestRunner_02 {

}
