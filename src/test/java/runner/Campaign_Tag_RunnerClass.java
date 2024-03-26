package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\applicationtest\\CampaignStatus.feature"},
		glue= {"steps","AppHooks"},
		plugin= {"pretty"}
)
public class Campaign_Tag_RunnerClass extends AbstractTestNGCucumberTests 
{
   
}
