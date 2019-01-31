package com.basic.hooksSDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
	
			monochrome=true,
			//dryRun=true,
			features = {"src/test/resources/com/basic/hooksFF/"},
			glue = {"com/basic/hooksSDD"},	
			
			plugin={"pretty",
					"html:target/cucumber-htlmreport",
					"json:target/cucumber-report.json4",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtenReport4.html",
			}
			)
	
	public class RunHooksTest{
	
}
