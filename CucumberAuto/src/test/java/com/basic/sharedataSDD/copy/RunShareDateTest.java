package com.basic.sharedataSDD.copy;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
	
			monochrome=true,
			//dryRun=true,
			features = {"src/test/resources/com/basic/sharedataFF/"},
			glue = {"com/basic/sharedataSDD"},	
			
			plugin={"pretty",
					"html:target/cucumber-htlmreport",
					"json:target/cucumber-report.json7",
			}
			)
	
	public class RunShareDateTest{
	
}
