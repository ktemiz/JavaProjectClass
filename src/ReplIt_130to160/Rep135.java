package ReplIt_130to160;

public class Rep135 {

	protected static int maxValue(int[] arr) {
		
		int maxNum=0;
		int tempMax=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			
			if(tempMax<arr[i]) {
				maxNum=arr[i];
			}
			else {
				maxNum=arr[0];
			}
				
		}
		return maxNum;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,12,-3,7,3,22};
		System.out.println(maxValue(arr)); //should print 22
	}
}
