package com.basic.tagsSDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
	
			monochrome=true,
			//dryRun=true,
			//tags = {"@Important"}, // All scenario executed it this is tag for feature 
			// tags = {"@Smoke"},	// Only tags @smoke
			//tags = {"@Smoke", "@Regresion"},// And condition las que cumplen las dos	
			tags = {"@Smoke, @Regresion"}, // or Condition
			
			features = {"src/test/resources/com/basic/tagsFF/"},
			glue = {"com/basic/tagsSDD"},	
			
			plugin={"pretty",
					"html:target/cucumber-htlmreport",
					"json:target/cucumber-report.json8",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtenReport8.html",
			}
			)
	
	public class RunTagsTest{
	
}
