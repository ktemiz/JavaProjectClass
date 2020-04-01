package ReplIt_99to129;

public class Rep113 {
	
	int sumEvenToX(int x) {
		
		int sum=0;
		
		for(int i=0; i<=x; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rep113 obj=new Rep113();
		
		System.out.println(obj.sumEvenToX(8));

	}

}
