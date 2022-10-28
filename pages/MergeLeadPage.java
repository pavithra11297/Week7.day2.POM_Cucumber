package com.testleaf.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import com.testleaf.base.ProjectSpecificationMethod;
import io.cucumber.java.en.And;

public class MergeLeadPage extends ProjectSpecificationMethod {

	@And("Choose From Lead")
	public MergeLeadPage clickFromLead() throws InterruptedException
	{
		getDriver().findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> allWindows = getDriver().getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		getDriver().switchTo().window(allhandles.get(1));
		getDriver().findElement(By.xpath("//input[@name='firstName']")).sendKeys("B");

		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();	
		getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();		   
		getDriver().switchTo().window(allhandles.get(0));
		return this;
	}
	@And("Choose To Lead")
	public MergeLeadPage clickLeadId() throws InterruptedException {
		getDriver().findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

		Set<String> allWindows2 = getDriver().getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		getDriver().switchTo().window(allhandles2.get(1));
		getDriver().findElement(By.xpath("//input[@name='firstName']")).sendKeys("a");

		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		getDriver().switchTo().window(allhandles2.get(0));
		return this;
	}
	@And("Click on Merge button")
	public MergeLeadPage clickMerge()
	{
		getDriver().findElement(By.xpath("//a[text()='Merge']")).click();
		getDriver().switchTo().alert().accept();	
		return this;
	}
}

