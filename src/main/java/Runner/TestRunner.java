package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Project\\cookandchefBDDframework\\src\\main\\java\\Features\\tagging.feature"//path of feature file
		,glue = { "stepDefination" } //the path of step defination file
		,format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}, //generate different types of report
		monochrome=true, //display console output readable format
		strict=true, // will check if any step is not defined in step defination file
		dryRun=false, // check mapping between feature & step def file
		tags= {"~@SmokeTest","~@Regression","~@E2E"} 
		)
public class TestRunner {

}
//OR : tags= {"@SmokeTest","@Regression"}  - "@SmokeTest OR @Regression"
//AND : tags= {"@SmokeTest","@Regression"}  - "@SmokeTest" and "@Regression"
//AND : tags= {"@SmokeTest","@Regression"}  - "@SmokeTest" and "@Regression"