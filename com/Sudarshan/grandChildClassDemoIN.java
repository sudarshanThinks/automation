package com.Sudarshan;

public class grandChildClassDemoIN extends childClassDemoIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClassDemoIN ccd;
		ccd=new grandChildClassDemoIN();
		ccd.getInfo();
		ccd.showName();
		ccd.showAge();
		ccd.showAddress();
		ccd.showCity();
		ccd.showZipcode();
		

	}
	
	public void showZipcode() {
		System.out.println("my zip code is:413 405");
	}
	
	public void showCity() {
		
		System.out.println("my city is Dharashiv");
	}

}
