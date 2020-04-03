package ReplIt_130to160;

public class Rep143 {
	
	public static void main(String[] args) {
		
		B obj=new B();
		obj.test1();
		obj.test2();
	}

}

class A{
	
	public void test1() {
		System.out.println("Class A");
	}
	
}

class B extends A{
	
	public void test2() {
		System.out.println("Class B");
	}
	
}
