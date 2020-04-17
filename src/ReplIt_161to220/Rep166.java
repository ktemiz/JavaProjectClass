package ReplIt_161to220;

public class Rep166 extends Parent166{

	public static void main(String[] args) {
		
		Rep166 obj = new Rep166();
		obj.m2();
		obj.m1();
	
	}

	@Override
	public void m1() {
		System.out.println("Parent class providing implementation");
	}
	@Override
	public void m2() {
		super.m2();
		System.out.println("Child class providing implementation");
	}

	
}

abstract class Parent166 {
	
	public void m2() {
		
	}
	public abstract void m1();
}
