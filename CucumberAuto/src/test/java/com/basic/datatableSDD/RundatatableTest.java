package com.basic.datatableSDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
	
			monochrome=true,
			//dryRun=true,
			features = {"src/test/resources/com/basic/datatableFF/"},
			glue = {"com/basic/datatableSDD"},	
			
			plugin={"pretty",
					"html:target/cucumber-htlmreport",
					"json:target/cucumber-report.json2",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtenReport2.html",
			}
			)
	
	public class RundatatableTest{
	
}
