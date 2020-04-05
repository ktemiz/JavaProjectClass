package ReplIt_130to160;

public class Rep150 {
	
	public static void main(String[] args) {
		
		B150 obj=new B150();
		obj.display();
	}
}

class A150 {
	
	int i=10;
	
	public void display() {
		System.out.println(i);
	}
}

class B150 extends A150 {
	
	int i=20;
	
	public void display() {
		System.out.println(i);
		super.display();
	}
}
