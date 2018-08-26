package com.heroku.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "html:target/cucumber-heroku-report",
				"json:target/cucumber-heroku.json",
				"rerun:target/rerun.txt"
		},

		tags = "@a",
		features = {"src/test/resources/com/features/back-end-features","src/test/resources/com/features/ui-features"},
		glue= {"com/heroku/steps_definitions", "com/herokuBackend/steps_definitions"}
		,dryRun =false

		)


public class CukesRunner {

}


