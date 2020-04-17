package ReplIt_161to220;

public class Rep169 implements FirstInterface, SecondInterface {

	public static void main(String[] args) {

		FirstInterface obj = new Rep169();
		obj.firstMethod();
		
		SecondInterface obj1 = new Rep169();
		obj1.secondMethod();
	}

	public void firstMethod() {
		System.out.println("First Method implementing multiple Inheritance");
	}

	public void secondMethod() {
		System.out.println("Second Method implementing multiple Inheritance");
	}

}

interface FirstInterface {

	void firstMethod();
}

interface SecondInterface {

	void secondMethod();
}
