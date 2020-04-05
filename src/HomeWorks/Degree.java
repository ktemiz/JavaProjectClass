package HomeWorks;

public class Degree {
	
	public void getPrerequisite() {
		System.out.println("To get a degree you need high school diploma");
	}

}

class Bachelors extends Degree {
	
	public void getPrerequisite() {
		System.out.println("I have Bachelors degree");

}
}

class Masters extends Degree {
	
	public void getPrerequisite() {
		System.out.println("I have Masters degree");
	}
	
}
