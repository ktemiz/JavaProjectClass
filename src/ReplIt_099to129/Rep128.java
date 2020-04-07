package ReplIt_099to129;

public class Rep128 {
	
	static int counter;
	
	static int countVowels(String s) {
		
		String vowels=s.replaceAll("[^aAeEiIOoUu]","");
		counter=vowels.length();
		return counter;
	}

	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countVowels("obama")); //3
		System.out.println(countVowels("happy friday! i love weekends")); //9
	}

}
