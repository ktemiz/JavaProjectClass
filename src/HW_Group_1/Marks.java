package HW_Group_1;

public abstract class Marks {

	 int math,phy,bio;
	 	
	 Marks (int math, int phy, int bio){
		this.math = math;
		this.phy = phy;
		this.bio = bio;
		
	 }

	public abstract double getPercentage();
}

 class A extends Marks {
	
	 A(int math, int phy, int bio){
		super(math,phy,bio);
		
	 }

	@Override
	public double getPercentage() {
		
		int averageA = (math+phy+bio)/3;
		
		return averageA;
	}
	
}

class B extends Marks {
	
	int sci;

	B(int math, int phy, int bio, int sci){
		 super(math,phy,bio);
		 this.sci = sci;
	 } 

	@Override
	public double getPercentage() {
		
		int averageA = (math+phy+bio+sci)/4;
		
		return averageA;
	}
	
}