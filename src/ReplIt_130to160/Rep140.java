package ReplIt_130to160;

public class Rep140 {
	
	public static void main(String[] args) {
	
	Rep140_1 obj=new Rep140_1();
	System.out.println(obj.name+" "+obj.lastName+" "+obj.employeeId+" "+obj.startDate+" "+obj.salary);
	
	Rep140_1 obj1=new Rep140_1("Joe","Smith",12345,"01/01/1970",35000);
	System.out.println(obj1.name+" "+obj1.lastName+" "+obj1.employeeId+" "+obj1.startDate+" "+obj1.salary);
	}

}
