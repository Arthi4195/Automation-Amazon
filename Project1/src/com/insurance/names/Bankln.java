package com.insurance.names;

public class Bankln implements Bank2 {
	@Override
	public void homeLoan() {
		System.out.println(10);
		// TODO Auto-generated method stub
		
	}@Override
	public void goldLoan() {
		System.out.println(20);
		// TODO Auto-generated method stub
		
	}@Override
	public void personalLoan() {
		System.out.println(24);
		// TODO Auto-generated method stub
	
	}
	public static void main(String[] args) {
		Bankln bk = new Bankln();
		bk.homeLoan();
		bk.goldLoan();
		bk.personalLoan();
	}

}
