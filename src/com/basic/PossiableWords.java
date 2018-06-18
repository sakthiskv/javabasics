package com.basic;
import java.util.Scanner;
public class PossiableWords {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input1");
    String s1=sc.next();
   s1=s1.toUpperCase();
    System.out.println(s1);
    System.out.println("Input2");
	String s2=sc.next();
	s2=s2.toUpperCase();
	String[] s3;
	s3=s2.split(":");
	for(int i=0;i<s3.length;i++)
	{
		System.out.print(s3[i]+" ");
	}
	System.out.println();
	System.out.println("outputs");

	for(int j=0;j<s3.length;j++)
	{
		for(int k=65;k<91;k++)
		{
			String s4=s1;
			char a=(char) k;
			 s4=s4.replace('_',a);
			if(s4.equals(s3[j]))
			{
				System.out.println(s4);
			}
		}
	}
	
}
}
