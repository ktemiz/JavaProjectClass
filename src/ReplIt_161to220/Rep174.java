package ReplIt_161to220;

public class Rep174 {
	
	public static void main(String[] args) {
		
		EncapsulationDemo174 obj = new EncapsulationDemo174();
		obj.setEmpName("Mario");
		obj.setEmpAge(32);
		System.out.println("Employee Name: "+ obj.getEmpName());
		System.out.println("Employee Age: "+ obj.getEmpAge());
	}

}


class EncapsulationDemo174 {
	
	private String empName;
	private int empAge;

	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	
	public int getEmpAge() {
		return empAge;
	}
	
	public void setEmpAge(int empAge) {
		this.empAge=empAge;
	}
}

