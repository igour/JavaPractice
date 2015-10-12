package org.gour.indrajeet.overridingMrng1;

public class Main {
	public static void main(String[] args) {
		A a = new B();
		a.m1(); // overriding is not possible as method m1 in class A has
				// different signature from the method m1 declared in class
				// B(extra argument int a passed), so complier will consider m1
				// from class B is totally different method.

		// if we create the B class object then only the we will able to call m1
		// passed parametered with int a
		B b = new B();
		b.m1(12);
	}
}
