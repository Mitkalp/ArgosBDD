package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.ArgosHomePage;
import utill.SeleniumDriver;

public class ArgosHomePageAction {

	ArgosHomePage argos=null;
	
	
	public ArgosHomePageAction() {
		

		 this.argos=new ArgosHomePage();
		//ArgosHomePageAction argos=new ArgosHomePage();
		
		
		//three different way we can write same line of code
		PageFactory.initElements(SeleniumDriver.getDriver(), argos);
		//PageFactory.initElements(SeleniumDrive.getDriver(), this);
		//PageFactory.initElements(SeleniumDrive.getDriver(), ArgosHomePageAction.class);
		
		
	}
	
	
	public void enterText(String text) {
		argos.searchBox.click();
		argos.searchBox.sendKeys(text);
		
		
		
	}
	public void serarchButton() {
		argos.seachButton.click();
	}
	
	public void clearText() {
		
		
		argos.searchBox.clear();
	}
	
}
