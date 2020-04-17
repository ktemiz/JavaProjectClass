package ReplIt_161to220;

public class Rep172 {

	public static void main(String[] args) {
		
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setEmpAge(30);
		obj.setEmpName("John");
		System.out.println("Employee Name: "+obj.getEmpName());
		System.out.println("Employee Age: "+obj.getEmpAge());
	}
}

class EncapsulationDemo {
	
	private String empName;
	private int empAge;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	
	
}
