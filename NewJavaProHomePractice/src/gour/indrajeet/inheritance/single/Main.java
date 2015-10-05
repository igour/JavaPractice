package gour.indrajeet.inheritance.single;

public class Main {

	public static void main(String[] args) {
		// example for creating the object of sub class and assign into the
		// supper class so a is eligible to call everything of class A (left
		// hand side operator) and new B() [right hand side] class can only
		// partecipent when the same method from class has been defined into
		// class B, so every time the same method from class B will call.
		A a = new B();
		a.mA(); // O/P - will be mA() will going to call of class B because new
				// B() will override.
		((B) a).mB(); // this question is for sir.
		/*
		 * just one method have been override from class A to B mA and others
		 * call was the simple call only. A a = new A(); a.mA();
		 * System.out.println(a.a);
		 * 
		 * B b = new B(); b.mB(); System.out.println(b.b);
		 * System.out.println("calling B's a " + b.a);
		 * 
		 * b.mA();
		 */
		/*
		 * scenarios covered in extends from A to B
		 */

		/*
		 * simple scenarios from simple two class A and B A a = new A(); // a.a;
		 * System.out.println(a.a); // System.out.println(a.b); a.m1(); B b =
		 * new B(); System.out.println(b.b); b.m2();
		 */
	}
}
