package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory 
{
	static WebDriver driver; // To avoid the nullpointer exception
	// method 1 - for browser launch 
	// method 2 - action related to web driver 
	
	// call this method when we want to launch the browser as well as object need 
	public WebDriver initBrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		return driver;
		
		// We want to use this driver object to perform the different actions 
		// for ex : driver.get(),driver.navigate() etc.. hence we have used the return keyword 
		// return keyword we use in method when we want to use any value of method in future 
		
	}
	
	// call this method only when we want to call object 
	// We made this method static because when I want to call this method no need to create object of class 
	public static WebDriver getDriver() // getter Method used to get the value 
	{
		return driver;
	}
	
	// Static keyword 
	// Static variable - fixed >> Static variable value memory will not get release even if object work 
	// is done . Static variable memory will not get release until the class will not get unload 
	// Non-Static variable - Runtime >> Once the job done of Object it will release the 
	// memory acquired by non-static variable object 

}
