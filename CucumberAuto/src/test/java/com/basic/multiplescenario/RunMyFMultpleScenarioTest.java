package com.basic.multiplescenario;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
	
			monochrome=true,
			//dryRun=true,
			features = {"src/test/resources/com/basic/MultipleScenarioFF/"},
			glue = {"com/basic/multiplescenario"},	
			
			plugin={"pretty",
					"html:target/cucumber-htlmreport",
					"json:target/cucumber-report.json6",
			}
			)
	
	public class RunMyFMultpleScenarioTest{
	
}
