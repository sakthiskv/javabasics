package com.basic;
import java.util.Scanner;  

public class RunTimeInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println( "MONA" );
			case 2:
			System.out.println( "Sakthivel;" );
			break;
			default:
			System.out.println( "The number is not 1 or 2" );
			break;
		}
		
	}

}
