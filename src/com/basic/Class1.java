package com.basic;
import java.util.Scanner;
class Employee {
	String firstname,lastname;
	Double salary;
	Scanner sc=new Scanner(System.in);
	public void getvalue() {
		System.out.println("Enter Details");
		
		firstname=sc.next();
		lastname=sc.next();
		salary=sc.nextDouble();
		}
	
	public void printvalue() {
		if(salary>0)
		{
		System.out.println(firstname);
		System.out.println(lastname);

		System.out.println("yearly salary="+salary*12);
		System.out.println("10% increase salary="+(((salary*0.1)+salary)*12));
		
		}
		else
		System.out.println("invalid salary");
		}
		
	}
public class Class1{
public static void main(String[] args){ 
	Employee emp=new Employee();
	Employee emp1=new Employee();
	emp.getvalue();
	emp.printvalue();
	emp1.getvalue();
	emp1.printvalue();
	
	
}
	
}
