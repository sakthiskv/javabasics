package com.basic;

public class Class {
	//public class Class1{
		String firstname,lastname;
		Double salary;
		public String setfirstname() {
			return firstname;
		}
	
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


		public static void main(String[] args){ 
			 Class emp=new Class();
			 emp.setfirstname();
			 emp.setlastname();
			 emp.setsalary();
			 emp.getfirstname();
			 emp.getlastname();
			 emp.getsalary();
			  
		  }
			  
		  }
		
		
		
		

