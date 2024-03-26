package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\applicationtest\\Hooks.feature"},
		glue= {"steps","hooks"},
		plugin={"pretty"}
		
)
public class Hooks_RunnerClass extends AbstractTestNGCucumberTests 
{
  
}
