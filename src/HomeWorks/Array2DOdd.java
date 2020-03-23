package HomeWorks;

public class Array2DOdd {

	public static void main(String[] args) {
		
//		Write a program that prints the total number of 
//		elements that are negative AND odd
		
		int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};
		
		int c=0;
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<4; j++) {
				
				int b=a[i][j];
				
				if(b<0 && b%2!=0) {
					c= c+1;
				}
			}
	
	}
		System.out.println(c);

}
}
