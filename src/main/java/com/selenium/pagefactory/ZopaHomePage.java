package com.selenium.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZopaHomePage {

	/**
	 * Selenium web driver
	 */
	WebDriver driver;
	
	/**
	 * This finds and set the link element on the home-page to loan-page
	 */
	@FindBy(linkText="Get a Zopa loan")
	WebElement link2loanPage;
	
	public ZopaHomePage(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * This method use web driver to navigates to loan page 
	 * @param
	 * @return
	 */
	public void goToLoanPage(){
		link2loanPage.click();
	}
	
}
