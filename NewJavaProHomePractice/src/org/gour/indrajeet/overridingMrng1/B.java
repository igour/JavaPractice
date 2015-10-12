package org.gour.indrajeet.overridingMrng1;

public class B extends A {
	public void m1(int a) { // this is totally new method because we have added
							// the parameter to pass and considered the new
							// method on the overridden method m1 from class A
							// which has zero parameter to pass
		System.out.println("B.m1");
	}
}
