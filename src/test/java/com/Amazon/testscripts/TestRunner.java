package com.Amazon.testscripts;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
							glue= {"com.Amazon"},
							publish=true,plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cucumber.xml"},
							tags="@SmokeTest" 	)
public class TestRunner {
	
	

}
