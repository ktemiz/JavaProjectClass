package ReplIt_130to160;

public class Rep134 {
	
	protected static String maxLength(String[] arr) {

		String maxWord="";
		for(int i=1; i<arr.length; i++) {
			
			String indexWord=arr[i];
			int tempMax=arr[0].length();
			
			if(tempMax<indexWord.length()) {
				maxWord=arr[i];
			}
			else {
				maxWord=arr[0];
			}
		}
		
		return maxWord;
	}
	
	public static void main(String[] args) {
		String[] arr = {"hey","yolo","hi","this is long"};
		System.out.println(maxLength(arr));
		//should print "this is long"
	}
}
