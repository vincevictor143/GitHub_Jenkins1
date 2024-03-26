package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\applicationtest\\TaggedHook.feature"},
		glue= {"steps","hook1"},
		plugin={"pretty"}
)
public class TaggedHook_RunnerClass extends AbstractTestNGCucumberTests 
{

}
