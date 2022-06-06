package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods{

	public WelcomePage() {

	}
	
	public HomePage clickCRMSFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage();
	}

}
