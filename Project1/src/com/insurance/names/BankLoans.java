package com.insurance.names;

public class BankLoans extends Bank {

	@Override
	public void goldLoan() {
		System.out.println("20%");
		
	}
	public static void name (String [] args) {
	BankLoans B =new BankLoans();
	B.goldLoan();
	B.personalLoan();
	B.homeLoan();
	
	}
	
		
	}
	


