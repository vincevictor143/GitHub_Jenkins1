package appfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions
	(
			features= {"src\\test\\resources\\appfeature\\HomePage.feature"},
			glue= {"appfeature"},
			plugin={"pretty","html:target/cucumber-reports/amazonreports.html"}
	)
			
	 public class AmazonRunnerClass extends AbstractTestNGCucumberTests
	 {
				
	 }
			
	

