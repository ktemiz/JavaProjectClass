package HomeWorks;

public class ArraySum1 {

	public static void main(String[] args) {
		
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		
		for(int i=0; i<4; i++) {
			
			int sum=0;
			
			for(int j=0; j<3; j++) {
				sum+=a[i][j];
				
			}
			System.out.println(sum);
		}
		
	}

}
