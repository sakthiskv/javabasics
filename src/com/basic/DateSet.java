package com.basic;
 class Date {
	 int day,month,year;
	 public Date(int day,int month,int year) {
		 this.day=day;
		 this.month=month;
		 this.year=year;
	 }
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void print() {
		System.out.println(day+"/"+ month+"/"+ year);
	}
	}
 public class DateSet{
	 public static void main(String[] args) {
		 Date s=new Date(27,10,1997);
		 s.print();
		 
	 }
 }


