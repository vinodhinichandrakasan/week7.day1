package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\TestLeaf\\Learning\\src\\test\\java\\features\\create_Contact.feature",glue="stepDefinition",monochrome=true)


public class New_Contact extends AbstractTestNGCucumberTests{

}
