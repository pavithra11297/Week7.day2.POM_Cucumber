package com.testleaf.pages;

import org.openqa.selenium.By;
import com.testleaf.base.ProjectSpecificationMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ViewLeadPage extends ProjectSpecificationMethod{
	@And("click on Edit Button")
	public EditLeadPage clickEditButton()
	{
		getDriver().findElement(By.linkText("Edit")).click();
		return new EditLeadPage();
	}
	@And("click on Delete Button")
	public LeadPage clickDeleteButton()
	{
		getDriver().findElement(By.linkText("Delete")).click();
		return new LeadPage();
	}
	@When("click on Duplicate Button")
	public DuplicateLeadPage clickDuplicateButton()
	{
		getDriver().findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage();
	}


}
