package org.gour.indrajeet.accesspecifiers;

public class A {
	// to investigate for default access specifier
	public int a;// = 10; // default initialized by zero
				// not necessary for initialize for use.

	void m1() {
		int ab = 0; // if you want to initialized than only you can use
					// else don't initialized and donot use that would also work.
					// means local variable will not need initialization to use.
		System.out.println("Method A.m1 with var " + ab);

	}
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		System.out.println(a.a);
	}
}
