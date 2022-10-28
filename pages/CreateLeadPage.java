package com.testleaf.pages;

import org.openqa.selenium.By;
import com.testleaf.base.ProjectSpecificationMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class CreateLeadPage extends ProjectSpecificationMethod{

	@Given("Enter Company name (.*)$")
	public CreateLeadPage enterCompanyName(String companyName) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		return this;
	}
	@And("Enter First Name (.*)$")
	public CreateLeadPage enterFirstName(String firstName) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;
	}
	@And("Enter Last Name (.*)$")
	public CreateLeadPage enterLastName(String lastName) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}
	@And("Click on Create Lead button")
	public ViewLeadPage clickCreateLeadSubmit() {
		getDriver().findElement(By.name("submitButton")).click();

		return new ViewLeadPage();
	}

	//	@Then("verify lead is created")
	//	public void verifyLeadCreation(String firstName) {
	//		String actual_FrstName = getDriver().findElement(By.id("viewLead_firstName_sp")).getText();
	//		Assert.assertEquals(actual_FrstName, firstName);
}

