package com.basic;
class Smp{
	static double interst;
	
	private double balance;
	
	public Smp(float bal) {
		this.balance = bal;
	}
	public void cal() {
		double s=(balance*interst)/12;
		balance = balance + s;
		
	}
	public static void setInterest(double interest) {
		Smp.interst = interest;
	}
	public void getcus() {
		System.out.println(" Saver2 Annuall interst 4% increase="+balance);
	}
	
	
	
}
public class SavingAccount {
	
	public static void main(String[] args) {
Smp saver1=new Smp(3000);
Smp saver2=new Smp(200);
Smp.setInterest(0.04);
saver1.cal();
saver1.getcus();
 saver2.cal();
 saver2.getcus();
	}
}
