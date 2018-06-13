import java.util.ArrayList;
import java.util.Scanner;
public class Identify {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char s1[]= sc.next().toCharArray();
//	for(int i=s1.length-1;i>=0;i--)
//	{
//		System.out.println(s1[i]);
//	}
	String ans="";
	ans+=s1[s1.length-1];
	int n;
	System.out.println("Enter room no between 100 to 999");
	n=sc.nextInt();
	if(n<=999 && n>=100)
	{
	int m=n,digit,sum=0;
	n=n/10;
	int a=n%10;
	ans+=a;
	char symbols[]= {')','!','@','#','$','%','^','&','*','('};

	ans+=symbols[a];
	for(int j=m;j!=0;j=j/10)
	{
		digit=j%10;
		sum=sum+digit;
	
	}
	if(sum%2!=0)
		sum=sum-1;
	
	ans+=sum;
	System.out.println(ans);
	}
	else
	{
		System.out.println("n is not in range");
	}
}
}