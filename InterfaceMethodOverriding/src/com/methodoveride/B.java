package com.methodoveride;

public class B extends A {
public void sub() {
	System.out.println("this is sub");
}
	public static void main(String[] args) {
		/*B b=new B();
		b.add();
        b.sub();*/
       /* A a=new A();
		a.add();
        a.sub();*///-------------------wont execute as it takes A class obj wd A ref
      /*  A a=new B();
		a.add();
        a.sub();
        *///-------------------wont execute as it takes B class obj wd A ref
		  B b1=new A();
			b1.add();
	        b1.sub();
	}
