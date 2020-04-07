package ReplIt_130to160;

public class Rep157 {
	
	public static void main(String[] args) {
		
		Parent157 obj=new Parent157();
		obj.methjod();
		
		Child157 obj1=new Child157();
		obj1.methjod();
		
	}
}

class Parent157 {
	
	public void methjod() {
		System.out.println("Parent method");
	}
}

class Child157 extends Parent157 {
	
	public void methjod() {
		System.out.println("Child method");
	}
}
