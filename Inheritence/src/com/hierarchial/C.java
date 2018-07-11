package com.hierarchial;

import multilevel.child;

public class C  extends B{
	public void tc_3() {
		System.out.println("this is c");
	}
	public void display() {
		super.tc_1();
		super.tc_2();
	}
	
		public static void main(String[] args) {
			C c=new C();
			c.display();
			c.tc_3();

		}

}
