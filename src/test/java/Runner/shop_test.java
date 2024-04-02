package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(features="features",
glue = "stepDefinitions",
plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
dryRun=true)
 
//plugin={"html:target/cucumber.html"})
//plugin={"pretty","json:target/cucumberReports.json"},
//plugin={"pretty","junit:target/cucumberReports.xml"})
 
 
public class shop_test extends AbstractTestNGCucumberTests {
}

