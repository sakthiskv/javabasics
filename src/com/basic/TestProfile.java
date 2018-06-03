package com.personal;

public class TestProfile {
public static  void printProfile(IProfile profile) {
	profile.myBasicInfo();
	profile.myHobbies();
}
public static void main(String[] args) {
	IProfile myprofile=new SakthiProfile();
	IProfile Friendprofile=new MonaProfile();
	System.out.println("My Profile");
	System.out.println("----------");
	printProfile(myprofile);
	System.out.println("\nMy friend Profile");
	System.out.println("-------------------");
	printProfile(Friendprofile);
	

}
}
