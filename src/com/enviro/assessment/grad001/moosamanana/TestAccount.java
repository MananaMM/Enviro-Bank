package com.enviro.assessment.grad001.moosamanana;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class TestAccount {
	AccountService accountService = new AccountServiceImpl(); //Instantiate business logic class
	AccountServices accountServices = new AccountServices(accountService); //Instantiate presentation layer
	
	 @Test
	   public void testCurentAccount() { //Test case current account
		 String SuccesMessage = "Success";
	     String DeclineMessage = "Decline";
			
	      assertEquals(SuccesMessage, accountServices.withdraw("4", new BigDecimal(800.50))); //checking a valid withdrawal
	      assertEquals(DeclineMessage, accountServices.withdraw("4", new BigDecimal(16000)));//checking a invalid withdrawal
	   }
	 
	 @Test
	   public void testSavingsAccount() { //Test case savings account
	     String SuccesMessage = "Success";
	     String DeclineMessage = "Decline";
			
	      assertEquals(SuccesMessage, accountServices.withdraw("1", new BigDecimal(800))); //checking a valid withdrawal
	      assertEquals(DeclineMessage, accountServices.withdraw("1", new BigDecimal(800))); //checking a invalid withdrawal
	   }
	 
	 @Test
	   public void testInvalidAccount() { //Test case invalid account
	     String InvalidMessage = "Account not found";
	     			
	      assertEquals(InvalidMessage, accountServices.withdraw("5", new BigDecimal(800))); //passing withdrawing from invalid account number
	   }

}