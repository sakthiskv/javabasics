package com.basic;
class Smp{
	static float a1=2000;
	static float a2=3000;
	static {
		System.out.println("Account bal="+a1+ "Account bal="+a2);
	}
	public float cal() {
		float s=(a1*4/100)*12;
		return s;
	}
	
	public float cal1() {
		float b=(a1*5/100)*12;
		return b;
		
	}
	public static void getcus() {
		float m=(a2*4/100)*12;
		System.out.println(" Saver2 Annuall interst 4% increase="+m);
		float p=(a2*5/100)*12;
		System.out.println(" Saver2 Annuall interst 5% increase="+p);
	}
	
	
	
}
public class SavingAccount {
	public static void main(String[] args) {
Smp saver1=new Smp();
Smp saver2=new Smp();
 System.out.println("saver1 Annuall interst 4% increase="+saver1.cal());
 System.out.println("saver1 Annuall interst 5% increase="+saver1.cal1());
 saver2.getcus();
	}
}
