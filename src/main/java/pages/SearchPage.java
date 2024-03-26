package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage 
{
	WebDriver driver;
	@FindBy(xpath="//input[@id=\"twotabsearchtextbox\"]")
	private WebElement searchProductBox;
	
	@FindBy(xpath="//*[@id=\"nav-search-submit-text\"]")
	private WebElement searchButtonProduct;
	
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void searchProduct(String text)
	{
		searchProductBox.sendKeys(text);
		searchButtonProduct.click();
	}
	
	public void searchClick()
	{
		searchButtonProduct.click();
	}
	

}
