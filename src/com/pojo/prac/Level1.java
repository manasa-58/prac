package com.pojo.prac;

public class Level1 {
	public void m1() {
		Student s1 = new Student();
		s1.setStdId(100);
		s1.setName("manu");
		s1.setCollegeName("niama");

		Level2 l2 = new Level2();
		l2.m2(s1);
	}

}
