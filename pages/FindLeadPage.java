package com.testleaf.pages;

import org.openqa.selenium.By;
import com.testleaf.base.ProjectSpecificationMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class FindLeadPage extends ProjectSpecificationMethod{

	@And("Click phone tab")
	public FindLeadPage clickPhone()
	{
		getDriver().findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	@And("Enter phone number (.*)$")
	public FindLeadPage enterPhoneNumber(String phoneNumber)
	{
		getDriver().findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
		return this;
	}
	@And("Click FindLead Button")
	public FindLeadPage clickFindLeadsButton() throws InterruptedException
	{
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();		
		Thread.sleep(2000);
		return this;
	}
	@When("Choose first value for lead id")
	public ViewLeadPage clickLeadListFirstValue()
	{
		getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage();
	}
}

