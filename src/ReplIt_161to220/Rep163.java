package ReplIt_161to220;

public class Rep163 {
	
	public static void main(String[] args) {
		
		Rep163 obj=new Rep163();
		System.out.println( obj.method("hello"));
		
	}
	
	String reverseword="";
	
	public final String method(String word) {
		
		 for(int i=word.length()-1; i>=0; i--) {
			 reverseword+=word.charAt(i);
		 }
		return reverseword;
		
	}

}
