package com.personal;

public class MonaProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		// TODO Auto-generated method stub
		System.out.println(ProfileConst.FIRST_NAME+"MOHAN");
		System.out.println(ProfileConst.LAST_NAME+"RAJ");
		System.out.println(ProfileConst.AGE+"20");
	}

	@Override
	public void myHobbies() {
		// TODO Auto-generated method stub
		System.out.println("1.Books\n2cricket AND\n3.Hearing Songs");
	}

}
