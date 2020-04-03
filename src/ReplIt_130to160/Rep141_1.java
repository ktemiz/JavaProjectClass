package ReplIt_130to160;

public class Rep141_1 {
	
	String model;
	double price;
	int quantity;
	
	public Rep141_1(String model,double price,int quantity) {
		this.model=model;
		this.price=price;
		this.quantity=quantity;
	}
	
	public void carStockValue() {
		
		double stockValue=price*quantity;
		System.out.println(model+" Stock Value "+stockValue);
	
	}

}
