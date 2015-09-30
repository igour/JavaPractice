package gour.indrajeet.hackerrank.oop;

 class test{
	void m1(){
		System.out.println("test class m1!!");
	}
	void m2(){
		System.out.println("test class m2!!");
	}
	
}
  class testSub extends test {
	void m1( ) {
		//super.m1();
		super.m2();
		System.out.println("testSub m1 !!");
	}
	
}
  class Main{

		public static void main(String[] args) {
			testSub a = new testSub();
			a.m1();
			test tst = new test();
			
			if (tst instanceof testSub) {
				//testSub new_name = (//testSub) a;
				System.out.println("testSub of type object");
			}
		}
  }