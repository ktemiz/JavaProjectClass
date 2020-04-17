package ReplIt_161to220;

public class Rep173 {
	
	public static void main(String[] args) {
		
		EncapsulationDemo173 obj = new EncapsulationDemo173();
		System.out.println("Employee Name: "+ obj.getEmpName());
		System.out.println("Employee Age: "+ obj.getEmpAge());
	}

}

class EncapsulationDemo173 {
	
	private String empName="John";
	private int empAge=30;

	public String getEmpName() {
		return empName;
	}
	
	public int getEmpAge() {
		return empAge;
	}
}
