package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\applicationtest\\Registration.feature"},
		glue= {"steps"},
		plugin= {"pretty"}
)
public class Registration_RunnerClass extends AbstractTestNGCucumberTests
{

}
