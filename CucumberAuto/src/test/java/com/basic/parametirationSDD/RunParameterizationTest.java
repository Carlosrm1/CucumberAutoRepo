package com.basic.parametirationSDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
	
			monochrome=true,
			//dryRun=true,
			features = {"src/test/resources/com/basic/parameterizacionFF/"},
			glue = {"com/basic/parametirationSDD"},	
			
			plugin={"pretty",
					"html:target/cucumber-htlmreport",
					"json:target/cucumber-report.json2",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtenReport.html",
			}
			)
	
	public class RunParameterizationTest{
	
}
