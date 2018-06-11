package com.basic;
public class Password {
	public static void main(String[] args) {
		int pass[]= {12,133,3232,23,122};
	int[] stable=new int[pass.length];
	int[] unstable=new int[pass.length];
		int t=0,p=0;
		int password,m=0;
		for(int k=0;k<pass.length;k++)	
		{
			String a=""; 
			int count=0;
			
		String s=String.valueOf(pass[k]);
			
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					if(i!=j)
					{
						count++;
						a+=s.charAt(i);
					}
				}
			}
		}
		
		if(count==0)
		{
			System.out.println(s);
			stable[p]=Integer.parseInt(s);
			p++;			
		}
		else {
			
		}
		if(a.length()==s.length() )
		{
			System.out.println(s);
			stable[p]=Integer.parseInt(s);
			p++;
		}
		else if(count!=0)
		{
		
			unstable[t]=Integer.parseInt(s);
			t++;
			password=Integer.parseInt(s);
			
			m=m+password;
			
			
			//System.out.println(password);
		}
	
		}
		
		System.out.println("unstable number total:"+m);
		System.out.println("p="+p);
		System.out.println("t="+t);
//		for(int u=0;u<=unstable.length-1;u++)
//		{
//			System.out.println("unstable="+unstable[u]);
//		}
		int maxval=stable[0];
		for(int r=1;r<=stable.length-1;r++)
		{
			if(stable[r]>maxval)
			{
				maxval=stable[r];	
			}
		}
		System.out.println("max value"+maxval);
		int minval=unstable[0];
		for(int z=1;z<=unstable.length-1;z++)
		{
			if(unstable[z]<minval && unstable[z]!=0)
			{
				minval=unstable[z];	
			}
		}
		System.out.println("min value"+minval);
		System.out.println("Passwor="+(minval+maxval));
		System.out.println("Update new Password="+((t*10)+p));
	}
	

}



