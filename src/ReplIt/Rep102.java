package ReplIt;

public class Rep102 {
	
	String carColor;
	int carYear;
	String carMake;
	
	void assign() {
		System.out.println("Car color is "+ carColor + " and car year is "+carYear+" and car model is "+carMake);
	};

	public static void main(String[] args) {
		
		Rep102 test1 = new Rep102();
		
		test1.carColor="Black";
		test1.carYear=2019;
		test1.carMake="BMW";
		
		Rep102 test2 = new Rep102();
		test2.carColor="White";
		test2.carYear=2018;
		test2.carMake="Toyota";
		
		
		test1.assign();
		test2.assign();
		
	}

}
