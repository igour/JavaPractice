package org.gour.indrajeet.overridingMrng;

public class Student {

	public String loc;
	public int age;

	@Override
	public String toString() {
		// generally we override toString method is to do display all the
		// property of class on testing
		return age + " " + loc;
	}

}
