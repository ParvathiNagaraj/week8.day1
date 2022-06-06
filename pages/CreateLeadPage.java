package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{

	public CreateLeadPage() {

	}

	public CreateLeadPage enterCompanyName(String cName) {
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String fName) {
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lName) {
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}
}
