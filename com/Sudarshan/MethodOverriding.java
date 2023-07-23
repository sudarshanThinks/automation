package com.Sudarshan;

public class MethodOverriding {
	
	int interestRate() {
		
		System.out.println("Parent class interest rate is:");
		return 7;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		MethodOverriding m=new MethodOverriding();
		
		System.out.println(m.interestRate());
	}

}
