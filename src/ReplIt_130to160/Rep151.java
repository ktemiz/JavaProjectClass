package ReplIt_130to160;

public class Rep151 {
	
	public static void main(String[] args) {
		
		Child151 obj=new Child151();
		obj.m2();
	}

}

class Parent151 {
	
	public void m1() {
		System.out.println("m1 method in parent class");
	}
}

class Child151 extends Parent151 {
	
	public void m1() {
		System.out.println("m1 method in child class");
	}
	
	public void m2() {
		this.m1();
		super.m1();

	}
}