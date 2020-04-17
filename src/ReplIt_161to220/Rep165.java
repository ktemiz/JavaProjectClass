package ReplIt_161to220;

public class Rep165 {
	public static void main(String[] args) {
		
		Subclass165 obj = new Subclass165();
		obj.m1();
		obj.m1("parameter");
		
	}

}

abstract class Parent165 {
	String word;
	
	 abstract void m1();
	 abstract void m1(String word);
}

class Subclass165 extends Parent165 {

	@Override
	void m1() {
		System.out.println("m1 without parameters");
		
	}

	@Override
	void m1(String word) {
		super.word=word;
		System.out.println("m1 method with parameter");
		
	}
	
}
