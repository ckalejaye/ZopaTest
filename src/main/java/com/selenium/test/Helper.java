package com.selenium.test;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Random;

public class Helper {
	
	private static final String CSV_SEPARATOR = ",";
	
	public static String generateRandomNumber(int lowerBound, int upperBound) {
		Random random = new Random();
		int randomNumber = random.nextInt(upperBound - lowerBound) + lowerBound;
		return String.valueOf(randomNumber);
	}
	
	public static String generateRandomString(int length) { 
		String alphabet = 
		        new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"); //9
		int n = alphabet.length(); //10

		String result = new String(); 
		Random r = new Random(); //11

		for (int i=0; i<length; i++) //12
		    result = result + alphabet.charAt(r.nextInt(n)); //13

		return result;
	}
	
	public static String generateRandomEmail() {
		String ret = Helper.generateRandomString(6)+"@"+Helper.generateRandomString(6)
						+ "."+ Helper.generateRandomString(3);
		return ret;
	}
	
	public static String generateRandomPostCode() {
		return  Helper.generateRandomString(5);
	}
	
	public static String generateRandomTitle() {
		final String[] proper_noun = {"Mr", "Ms", "Mrs", "Miss"};
		Random random = new Random();
		int index = random.nextInt(proper_noun.length);
		return proper_noun[index];
	}
	
	public static String generateRandomReason() {
		final String[] proper_noun = {"Car", "Home improvements", "Debt consolidation", "Credit cards",
				"Business", "Christmas expenses", "Land purchase"};
		Random random = new Random();
		int index = random.nextInt(proper_noun.length);
		return proper_noun[index];
	}

	public static String generateRandomFinancialDetails() {
		final String[] proper_noun = {"Employed full-time", "Self employed", "Director of a limited company", 
								"Employed part-time", "Currently unemployed", "Retired, not working", "Housewife, househusband or homemaker"};
		Random random = new Random();
		int index = random.nextInt(proper_noun.length);
		return proper_noun[index];
	}
	
	public static String generateRandomHomeStatus() {
		final String[] proper_noun = {"Yes, outright owner", "Yes, with a mortgage", "No"};
		Random random = new Random();
		int index = random.nextInt(proper_noun.length); 
		return proper_noun[index];
	}
	
	
    public static void writeToCSV(ArrayList<TestData> testDatas)
    {
        try
        {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("testData.csv"), "UTF-8"));
            for (TestData testData : testDatas)
            {
                StringBuffer oneLine = new StringBuffer();
                
                oneLine.append(testData.getLoanAmount());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(testData.getLoanTerms());
                

                oneLine.append(CSV_SEPARATOR);
                oneLine.append(testData.getEmail());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(testData.getTitle());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(testData.getFirstName());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(testData.getLastName());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(testData.getPhone());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(testData.getDateOfBirthDay()+"-"+testData.getDateOfBirthMonth()
                					+"-"+testData.getDateOfBirthYear());

                oneLine.append(CSV_SEPARATOR);
                oneLine.append(testData.getLoanReason());
                
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(testData.getPostCode());
                

                oneLine.append(CSV_SEPARATOR);
                oneLine.append(testData.getFinancialDetails());               
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(testData.getAnualIncome());
                
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(testData.getHomeStatus());                
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(testData.getMonthlyContribution());
                
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(testData.getPassword());
                
                bw.write(oneLine.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        }
        catch (UnsupportedEncodingException e) {}
        catch (FileNotFoundException e){}
        catch (IOException e){}
    }
    
}
