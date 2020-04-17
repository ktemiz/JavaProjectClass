package ReplIt_161to220;

public class Rep168 implements MyInterface {

	public static void main(String[] args) {
		Rep168 obj = new Rep168();
		obj.method1();
		obj.method2();
	}

	public void method1() {
		System.out.println("implementation of method1");
	}

	public void method2() {
		System.out.println("implementation of method2");
	}

}

interface MyInterface {

	void method1();

	void method2();

}
