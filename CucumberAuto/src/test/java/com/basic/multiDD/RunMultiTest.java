package com.basic.multiDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
	
			monochrome=true,
			//dryRun=true,
			features = {"src/test/resources/com/basic/multiFF/"},
			glue = {"com/basic/multiSDD"},	
			
			plugin={"pretty",
					"html:target/cucumber-htlmreport",
					"json:target/cucumber-report.json5",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtenReport5.html",
			}
			)
	
	public class RunMultiTest{
	
}
