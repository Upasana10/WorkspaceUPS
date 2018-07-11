package com.ac;

public class PRIVVATE {
	private int o=100;
	private void add() {
		System.out.println("public");
	}
	  public static void main(String[]args) {
		  PRIVVATE a=new PRIVVATE();
		a.add();
		System.out.println(a.o);
	}

}
