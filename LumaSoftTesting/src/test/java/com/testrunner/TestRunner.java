package com.testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Feature/Signin.feature"},
glue={"com.stepdefinitionLuma"},dryRun=false,monochrome=true,plugin= {"pretty","html:src/test/resources/Feature/report.html","json:src/test/resources/Feature/report.json"})
public class TestRunner {

}
