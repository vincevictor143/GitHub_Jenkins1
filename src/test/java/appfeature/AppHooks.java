package appfeature;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.DriverFactory;

public class AppHooks 
{
	WebDriver driver;
	DriverFactory df;
	@Before
	public void launchBrowser() throws IOException
	{
		Properties prop=new Properties();
		
		String path=System.getProperty("user.dir")+"//src//test//resources//config.properties";
		
		FileInputStream fis=new FileInputStream(path);
		
		prop.load(fis);
		
		String browsername1 = prop.getProperty("browser");
		
		df=new DriverFactory();
		
		// initbrowser method will provide the driver 
		driver = df.initBrowser(browsername1);
		
		// maximum browser 
		
		driver.manage().window().maximize();
	
	}
	
	@After(order=2) 
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			String scenarioName=scenario.getName();
			String name=scenarioName.replaceAll(" ", "");
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] source=ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(source, "image/png", name);
		}
		
	}
	
	@After(order=1)
	
	public void quitBrowser()
	{
		driver.quit();
	}

}
