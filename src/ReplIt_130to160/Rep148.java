package ReplIt_130to160;

public class Rep148 {
	
	public static void main(String[] args) {
		
		Child148 obj=new Child148();
		
		Child148 obj1=new Child148(10);
	}

}

class Parent148 {
	
	int number=20;
	
	public Parent148() {
		
		System.out.println("Parent Constructor without argument");
	}
	public Parent148(int number){
		this.number=number;
		System.out.println(number);
	}
}
class Child148 extends Parent148 {
	
	public Child148() {
		System.out.println("Child Constructor without argument");
	}
	public Child148(int number) {
		super(number);
		
	}
}



