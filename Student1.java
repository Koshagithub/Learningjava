package com.gpr.apps;

class Studentchild {
	int id=101;
	String name="KOSHA";
	
	public void calc()
	{
		System.out.println("Print calculator");
	}
}

public class Student1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentchild s1=new Studentchild();
		Studentchild s2=new Studentchild();
		System.out.println(s2.id);
		System.out.println(s1.name);
		s1.calc();
		System.out.println(s1.id+" "+s2.name);
		

	}

}
