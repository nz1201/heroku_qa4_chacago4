package com.heroku.runners;

import cucumber.api.CucumberOptions;

@CucumberOptions(
		plugin = { "html:target/cucumber-heroku-report",
				"json:target/cucumber-heroku.json",
				"rerun:target/rerun.txt"
		},
		tags = "@temp",
		features = {"src/test/resources/heroku/features"},
		glue="com/heroku/steps_definitions",
				dryRun =false
		)


public class CukesRunner {

}
