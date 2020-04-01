package ReplIt_130to160;

public class Rep138_1 {
	
	String label;
	double price;
	String category;
	boolean hasExpiration;
	int stock;
	
	Rep138_1(String label,double price,String category,boolean hasExpiration,int stock){
		this.label=label;
		this.price=price;
		this.category=category;
		this.hasExpiration=hasExpiration;
		this.stock=stock;
	}

	Rep138_1(String label,double price,int stock){
		
		this.label=label;
		this.price=price;
		category="misc";
		hasExpiration=false;
		this.stock=stock;
	}
	
	Rep138_1(String label,double price){
		
		this.label=label;
		this.price=price;
		stock=0;
	}
	public void display() {
		System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	}
	

}
