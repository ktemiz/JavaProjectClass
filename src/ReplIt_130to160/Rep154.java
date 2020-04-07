package ReplIt_130to160;

public class Rep154 {
	
	public static void main(String[] args) {
		
		Rep154 obj=new Rep154();
		obj.m1();
		obj.m1(3);
	}
	
	private void m1() {
		System.out.println("private m1 method");
	}
	private void m1(int x) {
		System.out.println("private m1 method with int parameter");
	}

}
