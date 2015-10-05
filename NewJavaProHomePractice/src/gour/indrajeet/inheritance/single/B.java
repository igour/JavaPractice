package gour.indrajeet.inheritance.single;

class B extends A {
	int b = 2;
//	int a = 2;

	void mA() {
		System.out.println("B.mA");
//		System.out.println("access a from A class "+super.a);
	}

	void mB() {
		System.out.println("B.mB");
	}

}
