package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class API_pomclass {
	public static WebDriver pomdriver;
	
	public API_pomclass(WebDriver driver1) {
		this.pomdriver = driver1;
		PageFactory.initElements(driver1, this);
		
	}
	@FindBy (xpath = "//span[@class='url']")
	public WebElement getapi;


	public WebElement getGetapi() {
		return getapi;
	}
	
	
}
