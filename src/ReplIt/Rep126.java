package ReplIt;

public class Rep126 {
	
	static String thirdLetter(String s) {
		
		String word="";
		for(int i=0; i<s.length(); i++) {
			word+=s.charAt(i);
			i+=2;
		}
		return word;
	}

	
	//test case below (dont change):
		public static void main(String[] args){
			System.out.println(thirdLetter("hello there")); //"hltr"
			System.out.println(thirdLetter("technology")); //"thly"
		}

}
