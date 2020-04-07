package ReplIt_099to129;

public class Rep115 {
	
	String censorLetter(String word, char mark) {
		
		String lastWord=word.replace(mark, '*');
		
		return lastWord;
	}

	public static void main(String[] args) {
		
		Rep115 obj=new Rep115();
		System.out.println(obj.censorLetter("computer science", 'e'));
		System.out.println(obj.censorLetter("trick or treat", 't'));
		
	
	}
}
