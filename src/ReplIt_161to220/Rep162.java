package ReplIt_161to220;

public class Rep162 {

	public static void main(String[] args) {
		
		Rep162 obj= new Rep162();
		obj.method1(true);
		obj.method1("test");
		

	}

	public final void method1(boolean m) {
		System.out.println("Final method with boolean parameter");
	}

	public final void method1(String m1) {
		System.out.println("Final method with String parameter");
	}
}
