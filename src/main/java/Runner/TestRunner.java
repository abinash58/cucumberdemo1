package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Project\\cookandchefBDDframework\\src\\main\\java\\Features\\login_dataTable.feature"
		,glue = { "stepDefination" }
		,format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome=true,
		strict=true,
		 dryRun=false
		)
public class TestRunner {

}
