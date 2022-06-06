package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{

	public ViewLeadPage() {

	}

	public ViewLeadPage verifyLeadId() {
		
		String LeadId = driver.findElement(By.id("viewLead_companyName_sp")).getText().replaceAll("[^0-9]", "");
		System.out.println("The LeadId is " + LeadId);
		return this;
	}
	
	public LeadsPage clickDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();
		return new LeadsPage();
	}
	
	public EditLeadPage clickEditButton() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage();
		
	}
	
	public DuplicateLeadPage clickDuplicateButton() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage();
		
	}
}
