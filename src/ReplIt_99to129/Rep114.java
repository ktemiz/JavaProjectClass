package ReplIt_99to129;

public class Rep114 {
	
	String spaceOut(String word) {
		
		String spaceWord="";
		
		for(int i=0; i<word.length(); i++) {
			spaceWord+=word.charAt(i)+" ";
		}
		return spaceWord;
	}
	
	public static void main(String[] args) {
		
		Rep114 obj=new Rep114();
		String word1=obj.spaceOut("hello");
		String word2=obj.spaceOut("technology");
		System.out.println(word1);
		System.out.println(word2);
	}

}
