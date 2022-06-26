package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\TestLeaf\\Learning\\src\\test\\java\\features\\EditLead.feature",glue="stepDefinition",monochrome=true)
public class Edit_LeadRun extends AbstractTestNGCucumberTests {

}
