package ReplIt_130to160;

public class Rep131 {
	
	static public String name;
	static String city;
	static protected String nameSchool;
	static private int batchNo;
	
	public static void test() {
		System.out.println("My name is "+name+" and I live in "+city+".I study at "+nameSchool+" in batch "+batchNo);
	}

	public static void main(String[] args) {
		
		name="John";
		city="Miami";
		nameSchool="Syntax";
		batchNo=6;
		test();
		

	}

}
