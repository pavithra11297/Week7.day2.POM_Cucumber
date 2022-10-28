package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testleaf.base.ProjectSpecificationMethod;
import io.cucumber.java.en.And;

public class EditLeadPage extends ProjectSpecificationMethod {
	
	@And("update the company name (.*)$")
	public EditLeadPage updatecompanyName(String editCompName) {
		WebElement  comName= getDriver().findElement(By.id("updateLeadForm_companyName"));
		comName.clear();
		comName.sendKeys(editCompName);
		return this;
	}
	@And("click on Update button")
	public EditLeadPage clickUpdateButton()
	{
		getDriver().findElement(By.name("submitButton")).click();
		return this;
	}
}
