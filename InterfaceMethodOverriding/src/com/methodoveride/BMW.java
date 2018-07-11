package com.methodoveride;

public class BMW extends Car{
	public void Speed() {
		System.out.println("100km/hr");
		}
	public static void main(String[] args) {
		Car C=new BMW() ;
			C.Start();
			C.Stops();
			C.Speed();
		
			
		}
	}


