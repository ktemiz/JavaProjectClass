package ReplIt;

public class Rep122 {
	
	static int counter=0;
	
     public int numberInstances () {
		
		counter++;
		
		return counter;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rep122 obj=new Rep122();
		obj.numberInstances();
		Rep122 obj1=new Rep122();
		obj1.numberInstances();
		Rep122 obj2=new Rep122();
		obj2.numberInstances();
		System.out.println(counter);
		
	
		
		

	}

}
