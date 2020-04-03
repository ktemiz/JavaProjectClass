package ReplIt_130to160;

public class Rep142 {
	
	public static void main(String[] args) {
		
		Rep142_1 obj=new Rep142_1("Blanket", 99.98,1);
		Rep142_1 obj2=new Rep142_1("Mattress", 439.18,1);
		
		System.out.println("You purchased "+(obj.itemTotalPrice()+obj2.itemTotalPrice())+" Today");
	}

}
