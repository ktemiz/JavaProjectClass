package ReplIt_130to160;

public class Rep158 {
	
	public static void main(String[] args) {
		
		Child158 obj=new Child158();
		obj.method();
		obj.method2();
		obj.method3();
	}

}

class Parent158 {
	
	public void method() {
		System.out.println("I am parent public/protected/default/private method");
	}
	void method3() {
		System.out.println("I am parent public/protected/default/private method");
	}
	private void method4() {
		System.out.println("I am parent public/protected/default/private method");
	}
	protected void method2() {
		System.out.println("I am parent public/protected/default/private method");
	}
	
}

class Child158 extends Parent158 {
	
	public void method() {
		System.out.println("I am a child public method");
	}
	protected void method2() {
		System.out.println("I am a child protected method");
	}
	void method3() {
		System.out.println("I am a child default method");
	}
	private void method4() {
		System.out.println("I am a child private method");
	}
}
