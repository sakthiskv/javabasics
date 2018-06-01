package com.basic;

public class Reverse {
	public static void main(String[] args) {
		int a=1234;
		int d=0;
		int[] arr=new int[10];
	for(int i=0;i<arr.length;i++)
		{
			int t=a%10;
			arr[d]=(d*10)+t;
		
			System.out.print(arr[d]);
	a=a/10;
		}
	
	
		
	}
}
