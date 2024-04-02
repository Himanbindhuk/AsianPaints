package Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue="stepDefinitions",
		//plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				//plugin={"pretty","json:target/cucumberReports.json"})
         //plugin={"pretty","junit:target/cucumberReports.xml"})
				plugin={"html:target/cucumber.html"},
		dryRun=true)
		//tags="@pin")


public class shop_Runner{

  
}
