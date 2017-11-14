Feature: Selenium Web Test
  This Feature is to test a loan application process on zopa.com

  Scenario: Complete Loan Application Process
    Given Website: https://www.zopa.com
    And Number of Random Data 5 
    Then for each random data go to the site, get a quote and complete the application form
   
