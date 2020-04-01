package ReplIt_99to129;

public class Rep110 {
	
	void multip(int a, int b) {
		System.out.println("Multiplication "+a*b);
	}
	void addit(int a, int b) {
		System.out.println("Addition "+ (a+b));
	}
	void subs(int a, int b) {
		System.out.println("Subtraction "+ (a-b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rep110 obj=new Rep110();
		obj.addit(20, 10);
		obj.multip(10, 3);
		obj.subs(30, 10);

	}

}
