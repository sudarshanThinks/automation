package com.Sudarshan;

public class Cardetails {
	
	String brand;
	String model;
	String colour;
	
	void speed() {
		System.out.println("brand is:"+brand);
	}

	void getModel() {
		System.out.println("model is:"+model);
	}
	void getColour() {
		System.out.println("colour is:"+colour);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cardetails cd=new Cardetails();
		Cardetails cd1=new Cardetails();
		cd.brand="maruti";
		cd.model="Ertiga";
		cd.colour="Mehroon";
		cd1.brand="Mahindra";
		cd1.model="XUV500";
		cd1.colour="Black";
		
		cd.speed();
		cd.getModel();
		cd.getColour();
		
		cd1.speed();
		cd1.getModel();
		cd1.getColour();

	}

}
