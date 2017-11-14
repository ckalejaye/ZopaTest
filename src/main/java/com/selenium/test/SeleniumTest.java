package com.selenium.test;
  
import java.util.ArrayList; 
import java.util.Iterator; 
import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.runtime.java.guice.ScenarioScoped;

import com.google.inject.Inject;
import com.selenium.pagefactory.ZopaHomePage;
import com.selenium.pagefactory.ZopaLoanApplicationFormPage;
import com.selenium.pagefactory.ZopaLoanQuotePage; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



/**
 * 
 * @author Cynthia
 * This class create a cucumber Runner for Selenium Testing
 */ 
@ScenarioScoped
public class SeleniumTest { 
	private WebDriver driver;
	
	private ZopaHomePage homePage;
	private ZopaLoanQuotePage loanQuotePage;
	private ZopaLoanApplicationFormPage applicationFormPage;
	
	private ArrayList<TestData> testDatas;
	private int numberOfTest;
	
	/**
	 * Constructor for method for Selenium Test Class
	 */ 
	@Inject
	public SeleniumTest(){  
		//sets driver part for selenium
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\eclipse-workspace\\SeleniumTest\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
 
	
    /**
	 *  This step sets the web address
	 */
	@Given("^Website: (.*)$")
    public void setWebAddress(String address) throws Throwable { 
		driver.get(address);
		homePage =  new ZopaHomePage(driver);
    }
	
	/**
	 *  This step generates n number of test data to be used
	 */
	@And("^Number of Random Data (\\d+)$")
    public void generateRandomTestData(int number) throws Throwable { 
		this.numberOfTest = number; 
		
		this.testDatas = new ArrayList<TestData>();
		for(int i=0; i<this.numberOfTest; i++) {
			TestData _t = new TestData();
			this.testDatas.add(_t); 
		}
    }
	
	
	/**
	 *  This step executes each test using test data
	 */
	@Then("^for each random data go to the site, get a quote and complete the application form$")
    public void doLoanApplicationWithRadomData() throws Throwable { 
		
		//initialize selenium driver for pages
		this.loanQuotePage = new ZopaLoanQuotePage(driver);
		this.applicationFormPage = new ZopaLoanApplicationFormPage(driver);
		 
		//loops through generated test data
		Iterator<TestData> it = this.testDatas.iterator();
	    while (it.hasNext()) {
	    		//selects test data to use
	    		TestData testData = (TestData)it.next();

	    		//navigates to homepage
	        this.homePage.goToLoanPage();
	        
	        //perform step 1 by filling the loan quote information
	        this.loanQuotePage.doLoanStep1(testData.getLoanAmount(), testData.getLoanTerms());
	        
	        //perform step two by filling the loan application form
	        this.applicationFormPage.doLoanStep2(testData.getEmail(), testData.getTitle(), testData.getFirstName(), testData.getLastName(),
	        		testData.getPhone(), testData.getDateOfBirthDay(), testData.getDateOfBirthMonth(), testData.getDateOfBirthYear(), 
	        		testData.getLoanReason(), testData.getPostCode(), testData.getFinancialDetails(), 
	        		testData.getAnualIncome(), testData.getMonthlyContribution(), testData.getHomeStatus(), testData.getPassword());
	    }
		
	    //writes test data used to CSV
	    Helper.writeToCSV(this.testDatas);
    }
	
}
