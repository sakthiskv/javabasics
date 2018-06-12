package com.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSplit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<String>();
		int n = 3;
		System.out.println("enter names");
		for (int i = 0; i < n; i++) {
			name.add(sc.next());
		}
		String name1[] = SplitString(name.get(0));
		String name2[] = SplitString(name.get(1));
		String name3[] = SplitString(name.get(2));

		String op1 = name1[0] + name2[1] + name3[2];
		String op2 = name1[1] + name2[2] + name3[0];
		String op3 = name1[2] + name2[0] + name3[1];

		System.out.println("op1=" + op1);
		System.out.println("op2=" + op2);

		System.out.println("op3=" + op3.toUpperCase());

	}

	public static String[] SplitString(String a) {
		int remainder = a.length() % 3;
		int div = a.length() / 3;
		String fname = "";
		String mname = "";
		String lname = "";
		if (remainder == 1) {
			fname = a.substring(0, div);
			mname = a.substring(fname.length(), fname.length() + div + remainder);
			lname = a.substring(mname.length() + fname.length(), a.length());
			System.out.println(fname + "" + mname + "" + lname);
		}
		if (remainder == 2) {

			fname = a.substring(0, div + 1);
			mname = a.substring(fname.length(), fname.length() + div + remainder);
			lname = a.substring(mname.length() + fname.length(), a.length());
			System.out.println(fname + "" + mname + "" + lname);
		}
		if (remainder == 0) {
			fname = a.substring(0, div);
			mname = a.substring(fname.length(), fname.length() + div + remainder);
			lname = a.substring(mname.length() + fname.length(), a.length());
			System.out.println(fname + "" + mname + "" + lname);
		}
		return new String[] { fname, mname, lname };
	}
}