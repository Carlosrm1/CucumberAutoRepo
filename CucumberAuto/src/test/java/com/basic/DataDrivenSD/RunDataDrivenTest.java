package com.basic.DataDrivenSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
	
			monochrome=true,
			//dryRun=true,
			features = {"src/test/resources/com/basic/DataDrivenFF/"},
			glue = {"com/basic/DataDrivenSD"},	
			
			plugin={"pretty",
					"html:target/cucumber-htlmreport",
					"json:target/cucumber-report.json1",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtenReport1.html",
			}
			)
	
	public class RunDataDrivenTest{
	
}
