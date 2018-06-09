import java.util.Scanner;
public class Password {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pass[]= {12,1033,3232,23,122};
	
		
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
		}
		else {
			
		}
		if(a.length()==s.length() )
		{
			System.out.println(s);
		}
		else if(count!=0)
		{
		
		
			password=Integer.parseInt(s);
			m=m+password;
			//System.out.println(password);
		}
	
		}
		
		System.out.println("unstable number total:"+m);
	}
	

}
