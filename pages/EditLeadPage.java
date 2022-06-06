package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{

	public EditLeadPage() {

	}
	
	public EditLeadPage updateCompanyName(String companyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		return this;
	}
	
	public ViewLeadPage clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}
	
	
	
	}
