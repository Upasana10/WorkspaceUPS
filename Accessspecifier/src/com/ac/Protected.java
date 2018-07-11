package com.ac;

public class Protected {
	protected int o=100;
	protected void add() {
		System.out.println("protected");
	}
	  public static void main(String[]args) {
		  Protected a=new Protected();
		a.add();
		System.out.println(a.o);
	}

}
