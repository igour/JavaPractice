package org.gour.indrajeet.overridingMrng;

public class A {

	public static void main(String[] args) {

		Student s = new Student();
		s.age = 26;
		s.loc = "ET";
		System.out.println(s); // when you call reference toString method will
								// call automatically and give you package name
								// with class name @ and then hashcode value

		B b = new B();
		b.m1(s); // here also toString method will be called because because
					// method m1 will take the reference of class Student and
					// their you have wrote the syso of reference passed and
					// override the method toString in Student class to print
					// age and loc
	}

}
