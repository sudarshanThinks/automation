package com.Sudarshan;

public class Overloading {
	
	static void addition(int a, int b) {
		
		int c=a+b;
		System.out.println("The value of c is:"+c);
	}
	
	static void addition (int a, int b, int c) {
		
		int d=a+b+c;
		System.out.println("The value of d is:"+d);
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition(30,1);
		addition(30,1,99);
	}

}

