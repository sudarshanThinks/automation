package com.Sudarshan;

public class ChildOverriding extends MethodOverriding {
	
	int interestRate() {
		
		System.out.println("child class interest rate  is:");
		return 8;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding mo;
		
		mo=new MethodOverriding();
		System.out.println(mo.interestRate());
		
		mo=new ChildOverriding();
		System.out.println(mo.interestRate());
		

	}

}
