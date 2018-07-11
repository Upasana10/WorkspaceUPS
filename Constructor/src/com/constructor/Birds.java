package com.constructor;

public class Birds {
	public Birds() {
		System.out.println("this is birds");
	}
	public Birds( int a) {
		this();
		System.out.println("this is birds int a");
	}
	public Birds( int a,int b) {
		this();
		System.out.println("this is birds int a and b");
	}
	public Birds( int a,double b) {
		this();
		System.out.println("this is birds int a and  doubleb");
	}
	public static void main(String[]Args) {
		Birds birds = new Birds(9,10);
		
	}
}
