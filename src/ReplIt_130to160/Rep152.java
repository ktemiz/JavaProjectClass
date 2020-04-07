package ReplIt_130to160;

public class Rep152 {
	
	public static void main(String[] args) {
		
		Rep152 obj=new Rep152();
		obj.sub(100, 10, 40, 10);
		obj.sub(100, 10, 60);
		obj.sub(70, 50);
		
	}
	
	public void sub(int a, int b, int c, int d) {
		System.out.println(a-b-c-d);
	}
	
	public void sub(int a, int b, int c) {
		System.out.println(a-b-c);
	}
	
	public void sub(int a, int b) {
		System.out.println(a-b);
	}

}
