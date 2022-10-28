package com.testleaf.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificationMethod extends AbstractTestNGCucumberTests{
	public static final  ThreadLocal<ChromeDriver> t1Driver=new  ThreadLocal<ChromeDriver>();
	//	public static ChromeDriver driver;
	public void setDriver(ChromeDriver driver)
	{
		t1Driver.set(driver);
	}
	public ChromeDriver getDriver()
	{
		return t1Driver.get();
	}
	public static Properties prop1;

	@BeforeMethod
	public void preCondition() throws IOException {
		WebDriverManager.chromedriver().setup();
		setDriver(new ChromeDriver());
		getDriver().manage().window().maximize();
		//multilingual language
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(new File("src/main/resources/config.properties"));
		prop.load(fis);
		String url = prop.getProperty("url");
		getDriver().get(url);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		//get languge
		String lang = prop.getProperty("lang");
		prop1=new Properties();
		FileInputStream fis1=new FileInputStream(new File("src/main/resources/"+lang+".properties"));
		prop1.load(fis1);
        //Login
		getDriver().findElement(By.id("username")).sendKeys("DemoSalesManager");	
		getDriver().findElement(By.id("password")).sendKeys("crmsfa");
		getDriver().findElement(By.className("decorativeSubmit")).click();
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		getDriver().findElement(By.linkText(prop1.getProperty("Leads_link"))).click();

	}
	@AfterMethod
	public void postCondition() {
		getDriver().close();
	}

}