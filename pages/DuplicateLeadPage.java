package com.testleaf.pages;

import org.openqa.selenium.By;
import com.testleaf.base.ProjectSpecificationMethod;
import io.cucumber.java.en.And;

public class DuplicateLeadPage extends ProjectSpecificationMethod {

	@And("Enter duplicate company name (.*)$")
	public DuplicateLeadPage enterDuplicateCompanyName(String duplicateCmpName) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(duplicateCmpName);
		return this;
	}

	@And("Enter duplicate First name (.*)$")
	public DuplicateLeadPage enterDuplicateFirstName(String duplicateFirstName) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(duplicateFirstName);
		return this;
	}
	@And("Enter duplicate last name (.*)$")
	public DuplicateLeadPage enterDuplicateLastName(String duplicateLastName) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(duplicateLastName);
		return this;
	}
	
	@And("Click on create lead button in duplicate screen")
	public ViewLeadPage clickDuplicateCreateLeadSubmit() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}
}
