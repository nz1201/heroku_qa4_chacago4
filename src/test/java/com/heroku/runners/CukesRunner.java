package com.heroku.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { 
				"pretty",
				"html:target/cucumber-heroku-report",
				"json:target/cucumber.json",
				"rerun:target/rerun.txt"
		},

		tags = "@db5",
		features = {"src/test/resources/com/features/back-end-features","src/test/resources/com/features/ui-features"},
		glue= {"com/heroku/steps_definitions", "com/herokuBackend/step_definitions"}
//		,dryRun =true
		)


public class CukesRunner {

}


