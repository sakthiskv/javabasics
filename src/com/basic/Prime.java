package com.basic;

public class Prime {
	public static void main(String[] args) {
		int n=50;
	int q,p=0;
		
		int arr[]=new int[n];
		for(int j=2;j<n;j++)
		{
			int f=0;
		
     	 for(int i=2;i<=n;i++)
	   {
		   if(j%i==0) 
		  f=f+1; 
	   }
     	 if(f==1)
     	 {
     	 arr[p]=j;
     	 p++;
     	 }


	}
		for(int k=0;k<arr.length-1;k++)
		{
			if(arr[k]!=0)
		System.out.println("prime numbers="+arr[k]);
		}
		for(int k=0;k<=arr.length-1;k++)
		{
			for(int l=1;l<=arr.length-1;l++)
			{
				 q= arr[k]+ arr[l];
				if(q==n)
					System.out.println(arr[k]+" "+arr[l]+"\n");
			}
		}
	}	
	}