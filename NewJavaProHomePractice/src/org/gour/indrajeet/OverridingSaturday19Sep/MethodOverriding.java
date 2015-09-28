package org.gour.indrajeet.OverridingSaturday19Sep;


public class MethodOverriding
{
    public static void main(String[] args)
    {
        SuperClass superclass = new SuperClass();
        superclass.methodOfSuperClass();         //Output : From Super Class
        SubClass subclass = new SubClass();
        subclass.methodOfSuperClass();          //Output : From Sub Class
    }
}