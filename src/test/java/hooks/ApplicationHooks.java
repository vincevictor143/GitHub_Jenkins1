package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks 
{
	@Before(order=2)
	public void beforeHook1()
	{
		System.out.println("Before hook1 is executing");
	}
	
	@After(order=2)
	public void afterHook1()
	{
		System.out.println("After hook1 is executing");
	}
	
	@Before(order=1)
	public void beforeHook2()
	{
		System.out.println("Before hook2 is executing");
	}
	
	@After(order=1)
	public void afterHook2()
	{
		System.out.println("After hook2 is executing");
	}
}
