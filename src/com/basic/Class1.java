package com.basic;
import java.util.Scanner;
class Employee {
	String firstname,lastname;
	Double salary;
	Scanner sc=new Scanner(System.in);
	public void getvalue() {
		System.out.println("Enter the first name");
		firstname=sc.next();
		lastname=sc.next();
		salary=sc.nextDouble();
	}
	public void printvalue() {

		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(salary);
	}
}
public class Class1{
public static void main(String[] args){ 
	Employee emp=new Employee();
	emp.getvalue();
	emp.printvalue();
}
	
}
