package com.app.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\practical_application\\Login.feature"},
		glue= {"com.app.stepdef"},
		plugin= {"pretty"}
)
public class RunnerClass_Practical extends AbstractTestNGCucumberTests 
{
  
}
