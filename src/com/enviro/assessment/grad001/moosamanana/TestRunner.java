package com.enviro.assessment.grad001.moosamanana;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner  {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(TestAccount.class); //Calling the test class
		
	      for (Failure failure : result.getFailures()) { //looping through failures and display them
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful()); //Printing true or false based on the test cases
		
		
	}

}
