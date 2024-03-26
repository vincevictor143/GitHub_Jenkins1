package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "path of driver");
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
	}

}
