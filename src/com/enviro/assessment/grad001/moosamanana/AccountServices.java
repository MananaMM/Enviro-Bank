package com.enviro.assessment.grad001.moosamanana;

import java.math.BigDecimal;

public class AccountServices {
	
	AccountService accountService;
	
	public AccountServices(AccountService accountService) {
		super();
		this.accountService = accountService;
	}

	public String withdraw(String accountNum, BigDecimal amountToWithdraw) {
		try {
			return accountService.withdraw(accountNum, amountToWithdraw);
		} catch (AccountNotFountException e) {
			return e.getMessage();
		}
	}

}
