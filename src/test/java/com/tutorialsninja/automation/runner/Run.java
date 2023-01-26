package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"classpath:FeatureFiles/Search1.feature" },
		glue={"classpath:com.tutorialsninja.automation.stepdef"},
		plugin={"html:target/cucumber_html_report"}
		)
public class Run {

}
