package com.enviro.assessment.grad001.moosamanana;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class SystemDB {
	private static Map<String,Account> accounts;
	private SystemDB() {
		//instantiate our in-memory DB and prepopulate the values
		accounts = new HashMap<String, Account>();
		accounts.put("1", new Account(101, "1",new BigDecimal(2000), false, new BigDecimal(0)));
    	accounts.put("2", new Account(102, "2",new BigDecimal(5000), false, new BigDecimal(0)));
    	accounts.put("3", new Account(103, "3",new BigDecimal(1000), true, new BigDecimal(10000)));
    	accounts.put("4", new Account(104, "4",new BigDecimal(-5000), true, new BigDecimal(20000)));
    
	}
	
	private static SystemDB INSTANCE; //this variable will hold instance of this class

    public static SystemDB getInstance() throws Throwable {//this class will create intance and assign it to the INTANCE variable
        if (INSTANCE == null) {
            INSTANCE = new SystemDB();
        }
        return INSTANCE;
    }
    
    public Account getAccount(String accountNum) {//we use this to get the specific account
    	return accounts.get(accountNum);
    }

}
