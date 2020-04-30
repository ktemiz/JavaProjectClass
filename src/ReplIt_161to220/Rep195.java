package ReplIt_161to220;
import java.util.*;

public class Rep195 {
	
	public static void main(String[] args) {
		
		Set<Employee> empType = new LinkedHashSet<>();
		empType.add(new Employee("John Doe", "123456789", 80000.0));
		empType.add(new Employee("Jane Smith","987654321",90000.0));
		empType.add(new Employee("Jackie Chan","0",1000000.0));
		
		for(Employee m:empType) {
			m.display();
		}
	}

}
class Employee {
	
	private String fullName;
	private String ssn;
	private double salary;
	
	public Employee (String fullName, String ssn, double salary){
		this.fullName=fullName;
		this.ssn=ssn;
		this.salary=salary;
	}
	
	public void display() {
		System.out.println(fullName+"\n"+ssn+"\n"+salary);
	}
	
	
	
	
	
}

 