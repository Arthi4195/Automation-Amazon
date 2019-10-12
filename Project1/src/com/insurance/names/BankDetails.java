package com.insurance.names;

public class BankDetails extends Bank {

	@Override
	public void goldLoan() {
		System.out.println("20%");
		
	}
	
	
		

	public static void main(String[] args) {
		BankDetails bd = new BankDetails();
		bd.goldLoan();
		bd.homeLoan();
		bd.personalLoan();

	}

}
