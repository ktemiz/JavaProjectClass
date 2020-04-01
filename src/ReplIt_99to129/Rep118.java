package ReplIt_99to129;

public class Rep118 {
	
	String nameCountry,capital;
	int size;
	
	void test() {
		System.out.println("The capital of "+nameCountry+" is "+capital+" and population is "+size);
	}
	

	public static void main(String[] args) {
		
		Rep118 obj1=new Rep118();
		obj1.nameCountry="USA";
		obj1.capital="Washington DC";
		obj1.size=330000000;
		obj1.test();
		
		
		Rep118 obj2=new Rep118();
		obj2.nameCountry="Kazakhstan";
		obj2.capital="Astana";
		obj2.size=18500000;
		obj2.test();
	}

}
