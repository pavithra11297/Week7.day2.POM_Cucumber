package com.testleaf.pages;

import org.openqa.selenium.By;
import com.testleaf.base.ProjectSpecificationMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LeadPage extends ProjectSpecificationMethod {

	@When("Click on Create Lead")
	public CreateLeadPage clickCreateLead() {
	getDriver().findElement(By.linkText(prop1.getProperty("Create_leads_link"))).click();
//		getDriver().findElement(By.xpath("//a[text()='Create Lead']")).click();
		return new CreateLeadPage();
	}
	@Given("Click on FindLead link")
	public FindLeadPage clickFindLeads() {
		getDriver().findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage();
	}
	@Given("Click on Merge Lead link")
	public MergeLeadPage clickMergeLead() {
		getDriver().findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadPage();
	}
}
