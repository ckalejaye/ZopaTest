package com.selenium.test;

public class TestData {

	public String loanAmount;
	
	public int loanTerms;
	
	public String email;
	
	public String title;
	
	public String firstName;
	
	public String lastName;
	
	public String phone;
	
	public String dateOfBirthDay;
	
	public String dateOfBirthMonth;
	
	public String dateOfBirthYear;
	
	public String loanReason;
	
	public String postCode; 
	
	public String financialDetails;
	
	public String anualIncome;
	
	public String monthlyContribution;
	
	public String homeStatus;
	
	public String password; 
	
	public TestData() {
		super();
		this.generateRandomData();
	}

	public TestData(String loanAmount, int loanTerms, String email, String title, String firstName, String lastName,
			String phone, String dateOfBirthDay, String dateOfBirthMonth, String dateOfBirthYear, String loanReason,
			String postCode, String financialDetails, String anualIncome,
			String monthlyContribution, String homeStatus, String password) {
		super();
		this.loanAmount = loanAmount;
		this.loanTerms = loanTerms;
		this.email = email;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.dateOfBirthDay = dateOfBirthDay;
		this.dateOfBirthMonth = dateOfBirthMonth;
		this.dateOfBirthYear = dateOfBirthYear;
		this.loanReason = loanReason;
		this.postCode = postCode; 
		this.financialDetails = financialDetails;
		this.anualIncome = anualIncome;
		this.monthlyContribution = monthlyContribution;
		this.homeStatus = homeStatus;
		this.password = password; 
	}
	
	public void generateRandomData() {
		this.loanAmount = Helper.generateRandomNumber(1000, 25000);
		this.loanTerms = Integer.parseInt(Helper.generateRandomNumber(1, 5));
		this.email = Helper.generateRandomEmail();
		this.title = Helper.generateRandomTitle();
		this.firstName = Helper.generateRandomString(5);
		this.lastName = Helper.generateRandomString(5);
		this.phone = Helper.generateRandomString(5);
		this.dateOfBirthDay = Helper.generateRandomNumber(1, 28);
		this.dateOfBirthMonth = Helper.generateRandomNumber(1, 12);
		this.dateOfBirthYear = Helper.generateRandomNumber(1970, 2001);
		this.loanReason = Helper.generateRandomReason();
		this.postCode = Helper.generateRandomPostCode(); 
		this.financialDetails = Helper.generateRandomFinancialDetails();
		this.anualIncome = Helper.generateRandomNumber(100, 1000000);
		this.monthlyContribution = Helper.generateRandomNumber(100, 5000);
		this.homeStatus = Helper.generateRandomHomeStatus();
		this.password = Helper.generateRandomString(8); 
	}

	public String getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getLoanTerms() {
		return loanTerms;
	}

	public void setLoanTerms(int loanTerms) {
		this.loanTerms = loanTerms;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDateOfBirthDay() {
		return dateOfBirthDay;
	}

	public void setDateOfBirthDay(String dateOfBirthDay) {
		this.dateOfBirthDay = dateOfBirthDay;
	}

	public String getDateOfBirthMonth() {
		return dateOfBirthMonth;
	}

	public void setDateOfBirthMonth(String dateOfBirthMonth) {
		this.dateOfBirthMonth = dateOfBirthMonth;
	}

	public String getDateOfBirthYear() {
		return dateOfBirthYear;
	}

	public void setDateOfBirthYear(String dateOfBirthYear) {
		this.dateOfBirthYear = dateOfBirthYear;
	}

	public String getLoanReason() {
		return loanReason;
	}

	public void setLoanReason(String loanReason) {
		this.loanReason = loanReason;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getFinancialDetails() {
		return financialDetails;
	}

	public void setFinancialDetails(String financialDetails) {
		this.financialDetails = financialDetails;
	}

	public String getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(String anualIncome) {
		this.anualIncome = anualIncome;
	}

	public String getMonthlyContribution() {
		return monthlyContribution;
	}

	public void setMonthlyContribution(String monthlyContribution) {
		this.monthlyContribution = monthlyContribution;
	}

	public String getHomeStatus() {
		return homeStatus;
	}

	public void setHomeStatus(String homeStatus) {
		this.homeStatus = homeStatus;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "TestData [loanAmount=" + loanAmount + ", loanTerms=" + loanTerms + ", email=" + email + ", title="
				+ title + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone
				+ ", dateOfBirthDay=" + dateOfBirthDay + ", dateOfBirthMonth=" + dateOfBirthMonth + ", dateOfBirthYear="
				+ dateOfBirthYear + ", loanReason=" + loanReason + ", postCode=" + postCode + ","
				+ " financialDetails=" + financialDetails + ", anualIncome=" + anualIncome
				+ ", monthlyContribution=" + monthlyContribution + ", homeStatus=" + homeStatus + ", password="
				+ password + "]";
	}
	
}
