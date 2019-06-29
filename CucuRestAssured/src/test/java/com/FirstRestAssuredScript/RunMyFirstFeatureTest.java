package com.FirstRestAssuredScript;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/com/basic/FirstRestAssuredScript/"},
		glue={"com/FirstRestAssuredScript/"}
		
		)

public class RunMyFirstFeatureTest {
	

}
