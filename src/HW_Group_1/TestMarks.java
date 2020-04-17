package HW_Group_1;

public class TestMarks {

	public static void main(String[] args) {
		
		Marks obj = new A(60, 80, 100);
		System.out.println(obj.getPercentage());
		
		Marks obj1 = new B(50, 100, 80, 60);
		System.out.println(obj1.getPercentage());
	}
}
