package ReplIt;

public class Rep127 {
	
	static int countA(String s) {
		
		int counter=0;
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)=='a' || s.charAt(i)=='A') {
				counter++;
			}
		}
		return counter;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countA("aaA")); //3
		System.out.println(countA("aaBBdf8k3AAadnklA")); //6
	}

}
