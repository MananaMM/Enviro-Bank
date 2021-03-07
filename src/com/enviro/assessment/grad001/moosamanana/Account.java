package com.enviro.assessment.grad001.moosamanana;

import java.math.BigDecimal;

public class Account {
	private int id;
	private String accountNum;
	private BigDecimal balance;
	private boolean currentAccoun;
	private BigDecimal overDraft;
	
	public Account() {
	}

	public Account(int id, String accountNum, BigDecimal balance, boolean currentAccoun, BigDecimal overDraft) {
		super();
		this.id = id;
		this.accountNum = accountNum;
		this.balance = balance;
		this.currentAccoun = currentAccoun;
		this.overDraft = overDraft;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public boolean isCurrentAccoun() {
		return currentAccoun;
	}

	public void setCurrentAccoun(boolean currentAccoun) {
		this.currentAccoun = currentAccoun;
	}

	public BigDecimal getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(BigDecimal overDraft) {
		this.overDraft = overDraft;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNum=" + accountNum + ", balance=" + balance + ", currentAccoun="
				+ currentAccoun + ", overDraft=" + overDraft + "]";
	}

	
}
