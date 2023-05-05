package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class API_pomclass {
	public static WebDriver driver1;
	
	public API_pomclass(WebDriver driver1) {
		this.driver1 = driver1;
		PageFactory.initElements(driver1, this);
		
	}
	@FindBy (xpath = "//span[@class='url']")
	public WebElement getapi;



	public WebElement getGetapi() {
		return getapi;
	}
}
