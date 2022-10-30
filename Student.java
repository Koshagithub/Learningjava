package com.gpr.apps;

public class Student {
	int id;
	String name;
	public void calc(){
		System.out.println("Print calculator");
	}

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.id=101;
		s2.name="Kosha";
		s2.calc();
		System.out.println(s1.id+" "+ s2.name);
		
	
		// TODO Auto-generated method stub

	}

}
