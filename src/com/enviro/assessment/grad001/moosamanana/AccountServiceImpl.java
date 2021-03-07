package com.enviro.assessment.grad001.moosamanana;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class AccountServiceImpl implements AccountService{

	@Override
	public String withdraw(String accountNum, BigDecimal amountToWithdraw) throws AccountNotFountException {
		//this is an implementation method from AccountService interface 
		DecimalFormat df2 = new DecimalFormat("#.##"); //formating our variable to decimal
		
		try {
			Account account = SystemDB.getInstance().getAccount(accountNum);  //getting instance of our DB and retrieving specific account
			if(account.isCurrentAccoun()) { //checking if is a current account
				
				
				if(account.getBalance().subtract(amountToWithdraw).doubleValue() >= (0 - account.getOverDraft().doubleValue()) ) { // check if user is able to withdraw
					account.setBalance(account.getBalance().subtract(amountToWithdraw));
					System.out.println("Balance = :"+ df2.format(account.getBalance()));
					System.out.println("Availabe Balance to Withdraw :"+ df2.format(account.getBalance().add(account.getOverDraft())));
					return "Success";
				}else { //decline and give a decline message
					System.out.println("Balance  = :"+ df2.format(account.getBalance()));
					System.out.println("Availabe Balance to Withdraw :"+ df2.format(account.getBalance().add(account.getOverDraft())));
					return "Decline";
				}
			}else { //checking if is savings account
				if(account.getBalance().subtract(amountToWithdraw).doubleValue() >= 1000 ) { // check if user is able to withdraw
					account.setBalance(account.getBalance().subtract(amountToWithdraw));
					System.out.println("Balance = :"+ df2.format(account.getBalance()));
					System.out.println("Availabe Balance to Withdraw :"+ df2.format(account.getBalance().subtract(new BigDecimal(1000))));
					return "Success";
				}else { //decline and give a decline message
					System.out.println("Balance = :"+ df2.format(account.getBalance()));
					System.out.println("Availabe Balance to Withdraw :"+ df2.format(account.getBalance().subtract(new BigDecimal(1000))));
					return "Decline";
				}
			}
			
		}catch (NullPointerException e) {
			throw new AccountNotFountException("Account not found"); //throw an account that doesn't exit
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return "";
	}

}
