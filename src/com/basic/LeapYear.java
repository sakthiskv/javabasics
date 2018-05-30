package com.basic;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		if(a%4==0)
			System.out.println("leap year"+a);
		else
			System.out.println("not a leap year"+a);
		
	}

}
