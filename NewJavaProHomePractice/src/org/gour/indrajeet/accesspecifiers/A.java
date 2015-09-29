package org.gour.indrajeet.accesspecifiers;

public class A {
// to investigate for default access specifier
	public int a = 10;
	void m1(){
		System.out.println("Method A.m1 with var "+a);
	}
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		System.out.println(a.a);;
	}
}
