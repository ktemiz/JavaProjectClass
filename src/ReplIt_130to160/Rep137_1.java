package ReplIt_130to160;

public class Rep137_1 {
	
	String make;
	String model;
	int numberOfDoors;
	int topSpeed;
	double price;
	
	Rep137_1(String make,String model,int numberOfDoors,int topSpeed,double price){
		this.make=make;
		this.model=model;
		this.numberOfDoors=numberOfDoors;
		this.topSpeed=topSpeed;
		this.price=price;
	}
	Rep137_1(String make,String model,int topSpeed,double price){
		this.make=make;
		this.model=model;
		numberOfDoors=4;
		this.topSpeed=topSpeed;
		this.price=price;
	}
	Rep137_1(int numberOfDoors,int topSpeed,double price){
		
		this.make="unknown";
		this.model="unknown";
		this.numberOfDoors=numberOfDoors;
		this.topSpeed=topSpeed;
		this.price=price;
	}
	Rep137_1(String make,String model,int numberOfDoors){
		this.topSpeed=90;
		this.price=0;
		this.make=make;
		this.model=model;
		this.numberOfDoors=numberOfDoors;
		
	}
	public void display() {
		System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
	

}
