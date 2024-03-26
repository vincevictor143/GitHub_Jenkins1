package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks 
{
	@Before("@sanity")
	public void beforeHook()
	{
		System.out.println("This is Scenario based hook");
	}
	
	@After("@regression")
	public void afterHook()
	{
		System.out.println("This is After hook");
	}
}
