package util;

import org.openqa.selenium.WebElement;

public class Reusable {
	
	
	public void enterTest(WebElement element,String name) {
		
		if(element.isDisplayed()) {
			
			element.sendKeys(name);
		}
		
	}

}
