package com.testleaf.runner;

import org.testng.annotations.DataProvider;

import com.testleaf.base.ProjectSpecificationMethod;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/main/java/com/testleaf/features/CreateLead.feature",
		                    "src/main/java/com/testleaf/features/Edit_delete_duplicate.feature",
                            "src/main/java/com/testleaf/features/MergeLead.feature"},
                     glue="com/testleaf/pages",
               monochrome=true,
                  publish=true)

public class runner extends ProjectSpecificationMethod {
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
