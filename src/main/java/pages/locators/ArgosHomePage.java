package pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArgosHomePage {

	
	@FindBy(id="searchTerm")
	public WebElement searchBox;
	
	
	
	@FindBy(xpath="//button[@type='submit']")
		public WebElement seachButton;	
}

