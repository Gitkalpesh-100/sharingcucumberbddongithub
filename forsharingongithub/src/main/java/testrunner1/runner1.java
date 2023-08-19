package testrunner1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "userlogin.feature", glue= {"stepdefinitions"})
public class runner1 extends AbstractTestNGCucumberTests{
	
}
