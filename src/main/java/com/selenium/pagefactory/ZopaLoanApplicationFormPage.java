package com.selenium.pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ZopaLoanApplicationFormPage {

	//Selenium web driver
	WebDriver driver;
	
	/**
	 * All WebElements are identified by @FindBy annotationapplications_loan_apply[title]
	 */
	@FindBy(xpath="//input[@name='member[email]']")
	WebElement email;
	
	@FindBy(xpath="//*[@id='content']/div/div/div/form/fieldset/div[2]/p[1]/span/label") 
	List<WebElement> title;
	
	@FindBy(xpath="//input[@name='applications_loan_apply[first_name]']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name='applications_loan_apply[last_name]']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@name='applications_loan_apply[home_phone]']")
	WebElement phone;
	
	@FindBy(xpath="//input[@name='date_of_birth_day']")
	WebElement dateOfBirthDay;
	@FindBy(xpath="//input[@name='date_of_birth_month']")
	WebElement dateOfBirthMonth;
	@FindBy(xpath="//input[@name='date_of_birth_year']")
	WebElement dateOfBirthYear;
	
	@FindBy(xpath="//a[@href='#additional-loan-purposes']")
	WebElement moreReason;
	
	@FindBy(xpath="//*[@id='content']/div/div[1]/div/form/fieldset[1]/div[5]/p[1]/span/label")
	List<WebElement> loanReasons;
	
	@FindBy(xpath=".//*[@id='additional-loan-purposes']/span/label")
	List<WebElement> moreLoanReasons;
	
	@FindBy(xpath="//input[@name='address[postcode]']")
	WebElement postCode;
	
	@FindBy(xpath="//input[@name='find_address']")
	WebElement lookUpAddress;
	
	@FindBy(xpath="//*[@id='content']/div/div[1]/div/form/fieldset[3]/div[1]/p/span/label")
	List<WebElement> financialDetails;
	
	@FindBy(xpath="//input[@name='applications_loan_apply[salary]']")
	WebElement anualIncome;
	
	@FindBy(xpath=".//*[@id='content']/div/div[1]/div/form/fieldset[3]/div[3]/p[1]/span/label")
	List<WebElement> homeStatus;
	
	@FindBy(xpath="//input[@name='applications_loan_apply[rent]']")
	WebElement monthlyContribution;
	
	@FindBy(xpath="//input[@name='member[password]']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='show_password']")
	WebElement showPassword;
	
	@FindBy(xpath="//button[@name='button']")
	WebElement calculateRate;

	public ZopaLoanApplicationFormPage(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public void setTitle(String title) { 
		for(WebElement _title :this.title) { 
			if(title.equals(_title.getText())) {
				_title.click();
			} 
		}
	}

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public void setPhone(String phone) {
		this.phone.sendKeys(phone);
	}

	public void setDateOfBirthDay(String dateOfBirthDay) {
		this.dateOfBirthDay.sendKeys(dateOfBirthDay);
	}

	public void setDateOfBirthMonth(String dateOfBirthMonth) {
		this.dateOfBirthMonth.sendKeys(dateOfBirthMonth);
	}

	public void setDateOfBirthYear(String dateOfBirthYear) {
		this.dateOfBirthYear.sendKeys(dateOfBirthYear);
	}

	public void clickMoreReason() {
		this.moreReason.click();
	}

	public void setLoanReasons(String loanReason) {
		boolean selected = false;
		for(WebElement _loanReason :this.loanReasons) { 
			if(loanReason.equals(_loanReason.getText())) {
				_loanReason.click();
			}
		} 
		
		if(selected) { return; }
		
		this.clickMoreReason();
		for(WebElement _moreLoanReason :this.moreLoanReasons) { 
			if(loanReason.equals(_moreLoanReason.getText())) {
				_moreLoanReason.click();
			}
		} 
		
		
	}

	public void setPostCode(String postCode) {
		this.postCode.sendKeys(postCode); 
	}

	public void clickLookUpAddress(String lookUpAddress) {
		this.lookUpAddress.click();
	}

	public void setFinancialDetails(String financialDetail) { 
		for(WebElement _financialDetail :this.financialDetails) { 
			if(financialDetail.equals(_financialDetail.getText())) {
				_financialDetail.click();
			}
		} 
	}

	public void setAnualIncome(String anualIncome) {
		this.anualIncome.sendKeys(anualIncome);
	}

	public void setHomeStatus(String homeStatus) { 
		for(WebElement _homeStatus :this.homeStatus) { 
			if(homeStatus.equals(_homeStatus.getText())) {
				_homeStatus.click();
			}
		} 
	}

	public void setMonthlyContribution(String monthlyContribution) {
		this.monthlyContribution.sendKeys(monthlyContribution);
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public void clickShowPassword() {
		this.showPassword.click();;
	}

	public void clickCalculateRate() {
		this.calculateRate.click();
	}


	/**
	 * This POM method will be exposed in test case to complete loan application form for the loan application process
	 * @param email
	 * @param title
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param dateOfBirthDay
	 * @param dateOfBirthMonth
	 * @param dateOfBirthYear
	 * @param loanReason
	 * @param postCode
	 * @param lookUpAddress
	 * @param financialDetail
	 * @param anualIncome
	 * @param monthlyContribution
	 * @param homeStatus
	 * @param password
	 */
	public void doLoanStep2(String email, String title, String firstName, String lastName,
			String phone, String dateOfBirthDay, String dateOfBirthMonth, String dateOfBirthYear, String loanReason,
			String postCode, String financialDetail, String anualIncome,
			String monthlyContribution, String homeStatus, String password){
		
		this.setEmail(email); 
		
		this.setTitle(title); 
		
		this.setFirstName(firstName);
		
		this.setLastName(lastName); 
		
		this.setPhone(phone); 
		
		this.setDateOfBirthDay(dateOfBirthDay);
		
		this.setDateOfBirthMonth(dateOfBirthMonth);
		
		this.setDateOfBirthYear(dateOfBirthYear);
		
		this.setLoanReasons(loanReason);
		
		this.setPostCode(postCode); 
		
		this.setFinancialDetails(financialDetail);
		
		this.setAnualIncome(anualIncome);
		
		this.setMonthlyContribution(monthlyContribution);
		
		this.setHomeStatus(homeStatus);
		
		this.setPassword(password);
		
		//this.clickCalculateRate();
		 	
	}
	 
}
