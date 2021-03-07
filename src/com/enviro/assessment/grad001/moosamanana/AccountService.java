package com.enviro.assessment.grad001.moosamanana;

import java.math.BigDecimal;

public interface AccountService {
	public String withdraw(String accountNum,BigDecimal amountToWithdraw) throws AccountNotFountException;
}
