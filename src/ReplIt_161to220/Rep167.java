package ReplIt_161to220;

public class Rep167 {
	public static void main(String[] args) {
		Tea obj = new LemonTea("Lemon Tea");
		obj.addSugar();
		
		Tea obj1 = new ChaiTea("Chai Tea");
		obj1.addSugar();
	}

}

 abstract class Tea {
	
	 String teaType;
	 
	 public Tea(String teaType) {
		this.teaType = teaType;
	}

	public abstract void addSugar();
	
}
 
 class LemonTea extends Tea {
	 
	 public LemonTea(String teaType) {
		 super(teaType);
	 }
	 
	 public void addSugar() {
		 System.out.println("For "+teaType+" we need 2 spoons of sugar");
	 }
 }

class ChaiTea extends Tea {

	public ChaiTea(String teaType) {
		super(teaType);
		
	}
	public void addSugar() {
		System.out.println("For "+teaType+" we need 1 spoons of sugar");
	}
	 
 }