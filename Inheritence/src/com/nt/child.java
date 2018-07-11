package com.nt;

import multilevel.Parent;

public class child  extends Parent{
public void tc_2() {
	System.out.println("this is child");
}
	public static void main(String[] args) {
		child c=new child();
		c.tc_1();
		c.tc_2();

	}

}
