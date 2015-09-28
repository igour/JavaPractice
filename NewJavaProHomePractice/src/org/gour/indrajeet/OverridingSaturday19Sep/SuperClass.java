package org.gour.indrajeet.OverridingSaturday19Sep;

public class SuperClass {
	
	void methodOfSuperClass()
    {
        System.out.println("From Super Class");
    }
}
class SubClass extends SuperClass
{
    void methodOfSuperClass()
    {
        //SuperClass method is overrided
        //We can keep any tasks here according to our requirements.
        System.out.println("From Sub Class");
    }
}
