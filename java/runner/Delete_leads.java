package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\TestLeaf\\Learning\\src\\test\\java\\features\\DeleteLead.feature",glue="stepDefinition",monochrome=true)
public class Delete_leads  extends AbstractTestNGCucumberTests{

}
