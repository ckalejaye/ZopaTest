package com.selenium.pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ZopaLoanQuotePage {

	/**
	 * Selenium web driver
	 */
	WebDriver driver;
	
	/**
	 * All WebElements are identified by @FindBy annotation
	 *
	 * This finds and set the TextBox to enter the loan amount
	 * 
	 */
	@FindBy(xpath="//form[@action='/borrow']//input[@id='amount']")
	WebElement loanAmount;
	
	/** 
	 * This finds all options available for loan term and set them to the field @loanTerms
	 */
	@FindBy(xpath="//*[@id='slider_calc_results']/table/tbody/tr")
	List<WebElement> loanTerms;
	
	/**
	 * This finds and set the submit button for the loan quote form
	 */
	@FindBy(id="submit-loan-button")
	WebElement submit;
	
	public ZopaLoanQuotePage(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Set loan amount in TextBox
	 * @param strAmount
	 */
	public void setLoanAmount(String strAmount){
		loanAmount.sendKeys(strAmount); 
	}
	
	/**
	 * Set loan term in option
	 * @param noYear
	 */
	public void setLoanTerm(int noYear){
		int counter = 1; 
		for(WebElement loanTerm :loanTerms) { 
			if(counter == noYear) {
				loanTerm.click(); 
			}
			counter++;
		}
	} 
	
	/**
	 * Click on submit button
	 */
	public void clickSubmit(){
		submit.click();
	}
	
	/**
	 * This POM method will be exposed in test case to submit loan quote form for the loan application  
	 * process
	 * @param strAmount
	 * @param noYear
	 * @return
	 */
	public void doLoanStep1(String strAmount,int noYear){
		//Fill loan Amount
		this.setLoanAmount(strAmount);
		//Fill Loan Term
		this.setLoanTerm(noYear); 
		//Click Submit button
		this.clickSubmit();		
	}
	
}
