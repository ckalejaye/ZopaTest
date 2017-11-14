package com.selenium.test;

 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 

/**
 * 
 * @author Cynthia
 * This is the main class for the selenium test project
 */
@RunWith(Cucumber.class)
@CucumberOptions( format = {"pretty", "html:target/test-results"},
	    features = {"Feature"})
public class SeleniumTestApplication { 
	
	public static void main(String[] args) { 
		
	}
}