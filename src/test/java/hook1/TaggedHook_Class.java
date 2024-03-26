package hook1;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHook_Class 
{
	@Before
    public void beforescenario(){
        System.out.println("This will run before the every Scenario");
    }

	@After
    public void afterscenario(){
        System.out.println("This will run after the every Scenario");
    }

	@Before()
    public void beforefirst(){
        System.out.println("This will run only before the First Scenario");
    }	

	@Before()
    public void beforesecond(){
        System.out.println("This will run only before the Second Scenario");
    }	

	@Before()
    public void beforethird(){
        System.out.println("This will run only before the Third Scenario");
    }

	@After()
    public void afterfirst(){
        System.out.println("This will run only after the First Scenario");   
    }	

	@After()
    public void aftersecond(){
        System.out.println("This will run only after the Second Scenario");   
    }	

	@After()
    public void afterthird(){
        System.out.println("This will run only after the Third Scenario");   
    }
}
