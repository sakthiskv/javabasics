package com.basic;

import java.util.Scanner;

class Emp {
	private String firstname,lastname;
	private Double salary;
	private int id;
	
	
	
public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
public void empId() {
	System.out.println(id);
}
	public void salaryCal() {
		if(salary>0)
		{
			System.out.println("yearly salary="+salary*12);
			System.out.println("10% increase salary="+(((salary*1.1)+salary)*12));
		}
		else
			System.out.println("invalid salary");
	}

 }
 public class Employee1 {
	 public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
		 Emp emp=new Emp();
		 Emp emp1=new Emp();
		 emp.setFirstname(sc.next());
		 emp.setLastname(sc.next());
		 emp.setId(sc.nextInt());
		 emp.setSalary(sc.nextDouble());
		 
		 
		 System.out.println(emp.getFirstname());
			System.out.print(emp.getLastname());
			System.out.println(emp.getId());
			System.out.println(emp.getSalary());
			emp.salaryCal();
			
			emp1.setFirstname(sc.next());
			 emp1.setLastname(sc.next());
			 emp1.setId(sc.nextInt());
			 emp1.setSalary(sc.nextDouble());
			 
			 System.out.println(emp1.getFirstname());
				System.out.print(emp1.getLastname());
				System.out.println(emp1.getId());
				System.out.println(emp1.getSalary());
				emp1.salaryCal();
	 }
		 
	 }
