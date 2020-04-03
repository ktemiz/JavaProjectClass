package ReplIt_130to160;

public class Rep146 {
	
	public static void main(String[] args) {
		
		Child obj=new Child("Vienna");
	}
}

class Parent {
	
	String city;
	
	public Parent(String city) {
		this.city=city;
		System.out.println(city);
	}
	public Parent() {
		System.out.println("Parent Constructor");
	}
	
}

class Child extends Parent {
	
	public Child(String city) {
		super(city);
	}
	
	
}
