package ReplIt_161to220;

public class Rep171 implements Functions {
		
	
	public static void main(String[] args) {
		
		Functions obj = new Rep171();
		System.out.println("Result is ::: "+obj.adding(100.00, 20.00));
		
		Functions obj1 = new Rep171();
		System.out.println("Result is ::: "+obj1.subtracting(100.00, 20.00));
		
		Functions obj2 = new Rep171();
		System.out.println("Result is ::: "+obj2.multiply(100.00, 20.00));
		
		Functions obj3 = new Rep171();
		System.out.println("Result is ::: "+obj3.dividing(100.00, 20.00));
		
	}
	
		

	public double adding(double firstNumber, double secondNumber) {

		double result = firstNumber + secondNumber;
		return result;
	}

	public double subtracting(double firstNumber, double secondNumber) {

		double result = firstNumber - secondNumber;
		return result;
	}

	public double multiply(double firstNumber, double secondNumber) {

		double result = firstNumber*secondNumber;

		return result;
	}

	public double dividing(double firstNumber, double secondNumber) {

		double result = firstNumber/secondNumber;

		return result;
	}

	public void display() {
		
	}
}


interface Outputs {

	public void display();
	
}

interface Functions extends Outputs {

	public double adding(double firstNumber, double secondNumber);

	public double subtracting(double firstNumber, double secondNumber);

	public double multiply(double firstNumber, double secondNumber);

	public double dividing(double firstNumber, double secondNumber);
}
