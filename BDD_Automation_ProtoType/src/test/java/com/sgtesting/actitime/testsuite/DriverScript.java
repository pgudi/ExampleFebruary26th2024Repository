package com.sgtesting.actitime.testsuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "src/test/resources/FeatureFiles",
		glue = "com.sgtesting.actitime.stepdefinitions",
		tags = "@Run"
		)
public class DriverScript extends AbstractTestNGCucumberTests{

}
