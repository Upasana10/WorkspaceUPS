package com.ac;

public class Public {
	int z =10;
public void add() {
	System.out.println("public");
}
  public static void main(String[]args) {
	Public a=new Public();
	a.add();
	System.out.println(a.z);
}
}
