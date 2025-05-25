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
<<<<<<< HEAD
				  "json:target/cucumber.json",
=======
				  "json:target/Report.json",
>>>>>>> c234c72f264793363f85f02e745269598bfa9d0b
			 
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}

		)
public class TestRunner_02 {

}
