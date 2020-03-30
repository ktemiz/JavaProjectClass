package OBB_1;

public class Student {
	
	String name;
	String address;
	
	Student(String name,String address) {
		this.name=name;
		this.address=address;
	}
	public void displayInfo() {
		System.out.println("student name " + name+ " and address "+address);
		
	}
	

	public static void main(String[] args) {
		
		Student obj=new Student("Ahmet", "123 street, Virginia");
		obj.displayInfo();

	}

}
