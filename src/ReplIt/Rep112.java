package ReplIt;

public class Rep112 {
	
	boolean numbers(int a, int b) {
		
		boolean flag;
		if(a%2==0 && b%2==0) {
			
			flag=true;
		} else {
			flag=false;
		}
		return flag;	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rep112 obj=new Rep112();
		boolean result=obj.numbers(23, 24);
		System.out.println(result);

	}

}
