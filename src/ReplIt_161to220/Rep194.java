package ReplIt_161to220;
import java.util.*;

public class Rep194 {

	public static void main(String[] args) {
		
		Set<Student> callMethod = new LinkedHashSet<>();
		callMethod.add(new Student(101, "Samir", "Jawaid"));
		callMethod.add(new Student(102, "Asel", "Umurzakova"));
		callMethod.add(new Student(103, "Diego", "Juarez"));
		callMethod.add(new Student(104, "Sohil", "Aryan"));
		callMethod.add(new Student(105, "Alijon", "Nazarov"));
		
		for(Student m:callMethod) {
			m.display();
		}

	}
}

	 class Student {

		int studentId;
		String name;
		String lastName;

		public Student(int studentId, String name, String lastName) {
			this.studentId=studentId;
			this.name=name;
			this.lastName=lastName;

		}

		public void display() {

			System.out.println("Student details: " + name + " " + lastName + " with id: " + studentId);
		}

	}


