package com.hierarchial;

import multilevel.Parent;

public class B extends A {
	public void tc_2() {
		System.out.println("this is B");
	}
		public static void main(String[] args) {
		B b=new B();
			b.tc_1();
			b.tc_2();

		}
}
