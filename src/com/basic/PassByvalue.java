package com.basic;

public class PassByvalue {
	public static void main(String[] args) {
		
		Pass s1=new Pass();
		int s=100;
		s1.abc(s);
		System.out.println(s);
		
		
	}

}
class Pass

{
	public int abc(int s) {
	
	s=20;
	System.out.println(s);
	return s;
}
}