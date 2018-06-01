package com.basic;
import java.util.Scanner;
class  Shape{
	float len,wid;
	
	

	public float getLen() {
		return len;
	}



	public void setLen(float len) {
		if(len>=0.0&&len<=2.0)
		this.len = len;
		else
			System.out.println("len not between range");
	}



	public float getWid() {
		return wid;
	}



	public void setWid(float wid) {
		if(wid>=0.0&&wid<=2.0)
		this.wid = wid;
		else
			System.out.println("wid not between range");
			
	}



	public float Perimeter(){
		float p=2*(len+wid);
		return p;
		
	}
	public float Area() {
	 float a=len*wid;
	 return a;
	}
}
public class Rectangle {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		Shape m=new Shape();
		
		System.out.println("Enter len");
		m.setLen(sc.nextFloat());
		System.out.println("Enter wid");
		m.setWid(sc.nextFloat());
		

		System.out.println("len"+m.getLen());
		System.out.println("wid"+m.getWid());
		System.out.println("perimeter"+m.Perimeter());
		System.out.println("Area"+m.Area());
		
		
		
	}

}
