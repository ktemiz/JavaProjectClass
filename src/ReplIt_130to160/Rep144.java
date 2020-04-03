package ReplIt_130to160;

public class Rep144 {
	
	public static void main(String[] args) {
		
		Employee obj=new Employee();
		Student obj1=new Student();
		Retiree obj2=new Retiree();
		
		obj.test1("Joe", "Smith", 35, 3500);
		obj1.test1("Adam", "Smith", 15, 10);
		obj2.test1("Frank", "Smith", 15, "tour");

	}

}

class Person {
	
	String name;
	String lastName;
	int age;
	
	public void test1(String name, String lastName, int age) {
		
		System.out.println(name+" "+lastName+" "+age);
	}
}

class Employee extends Person {
	
	int salary;
	public void test1(String name, String lastName, int age, int salary) {
		System.out.println(name+" "+lastName+" "+age+" "+salary);
	}
	
}

class Student extends Employee {
	
	int grade;
	public void test1(String name, String lastName,int age, int grade) {
		System.out.println(name+" "+lastName+" "+age+" "+grade);
		
		}
	}

class Retiree extends Student {
	
	String seniorActivity;
	public void test1(String name, String lastName,int age, String seniorActivity) {
		System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
	}
	
}
