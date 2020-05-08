package ReplIt_161to220;

public class Rep210 {
	/*Create a custom Exception class
		In main class create a method that will check students grade
		if students grade is >90 then below exception should be thrown
		if students grade is below 90 print "You are a great student"
		
		In main method calls method gradeCheck and handle an Exception
			 * 
	 */

	public static void main(String[] args) {
		try {
		gradeCheck(97);
		}
		catch (SyntaxStudentException m) {
			System.out.println(m);
		}
	}

	public static void gradeCheck(int grade) {
			
		if(grade>90) {
		throw new SyntaxStudentException("You are an exceptionally awesome student");
		}else {
			System.out.println("You are great student");
		}
	}

}
class SyntaxStudentException extends RuntimeException {
	
	public SyntaxStudentException (String message) {
		super(message);
	}
}
