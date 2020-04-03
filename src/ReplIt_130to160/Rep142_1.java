package ReplIt_130to160;

public class Rep142_1 {
	
	String item;
	double price;
	int quantity;
	
	public Rep142_1(String item,double price,int quantity) {
		this.item=item;
		this.price=price;
		this.quantity=quantity;
	}
	public double itemTotalPrice() {
		
		double totalValueStock=price*quantity;
		System.out.println(item+" Total Value "+totalValueStock);
		
		return totalValueStock;
	}

}
