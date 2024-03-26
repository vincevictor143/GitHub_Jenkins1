package pages;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage
{	
	WebDriver driver;
	@FindBy(xpath="//*[@class=\"a-carousel-card\"]//img[@alt=\"Home & kitchen\"]")
	
	private WebElement blackFridayDeal;
	
	@FindBy(xpath="//*[@id=\"nav-cart-text-container\"]")
	
	private WebElement carticon;
	
	@FindBy(xpath="//span[text()=\"Account & Lists\"]")
	
	private WebElement accountSign;
	
	@FindBy(xpath="//div[@id=\"nav-tools\"]//*[@data-nav-role=\"signin\"]")
	
	private WebElement signinbutton;
	
	@FindBy(xpath="//input[@id=\"ap_email\"]")
	
	private WebElement emailField;
	
	@FindBy(xpath="//input[@id=\"continue\"]")
	
	private WebElement continueButton;
	
	@FindBy(xpath="//input[@id=\"ap_password\"]")
	
	private WebElement passwordEnter;
	
	@FindBy(xpath="//input[@id=\"signInSubmit\"]")
	
	private WebElement signButton;
	
	WebDriverWait wait;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); // Driver variable we want to initialize and those should be class level
		wait=new WebDriverWait(driver,Duration.ofSeconds(100));
	}
	
	public String getTitleOfpage()
	{
		String title = driver.getTitle();  // Title of page 
		
		return title;
	}
	
	public boolean verifyCart()
	{
		boolean isdisplay=carticon.isDisplayed();
		
		return isdisplay;
	}
	
	public void gotoSignPage()
	{
		Actions act=new Actions(driver);
		
		act.moveToElement(accountSign).perform();
		
		signButton.click();
		
	}
	
	public void enterUsername(String uname) // Taking value from user 
	{
		emailField.sendKeys(uname);
		continueButton.click();
		
	}
	
	public void finalSign(String pass)
	{
		passwordEnter.sendKeys(pass);
		signButton.click();
		
	}
	
	public void blackFridayDeal()
	{
		wait.until(ExpectedConditions.visibilityOf(blackFridayDeal));
		blackFridayDeal.click();
	}
	

	
	

}
