package com.personal;

public class SakthiProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		// TODO Auto-generated method stub
		System.out.println(ProfileConst.FIRST_NAME+"SAKTHI");
		System.out.println(ProfileConst.LAST_NAME+"VEL");
		System.out.println(ProfileConst.AGE+"20");
		}

	@Override
	public void myHobbies() {
		// TODO Auto-generated method stub
System.out.println("1.Playing chess\n2.cricket\n3.Hearing Songs");
	}

}
