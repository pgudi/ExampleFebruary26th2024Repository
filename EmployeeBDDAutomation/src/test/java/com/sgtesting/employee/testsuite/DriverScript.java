package com.sgtesting.employee.testsuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/FeatureFiles",
		glue = "com.sgtesting.employee.stepdefinitions",
		plugin = {
				"pretty",
				"html:Reports/cucumber-report.html",
				"json:Reports/cucumber.json"
		},
		tags = "@Smoke or @Regression"
		)
public class DriverScript extends AbstractTestNGCucumberTests{



}
