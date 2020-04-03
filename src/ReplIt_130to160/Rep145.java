package ReplIt_130to160;

public class Rep145 extends Method {
	
	public static void main(String[] args) {
		
		Method obj=new Method();
		
		
	}

}

class Method {
	
	
	static int[][] a;
	
	public static void methodSum(int[][] a) {
		
		int total=0;
		
		for(int i=0; i<a.length; i++) {
			
			for (int j=0; j<a[0].length; j++) {
				total=total+a[i][j];
			}
					
		}
		System.out.println(total);
	}
}
