package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\applicationtest\\login.feature"},
		glue= {"steps"},
		publish=true,
		plugin= {"pretty"}
)
public class RunnerClass extends AbstractTestNGCucumberTests
{
    
}
