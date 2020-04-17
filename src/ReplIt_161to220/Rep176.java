package ReplIt_161to220;

public class Rep176 {
	
	public static void main(String[] args) {
		
		Person176 obj = new Person176("John", "Doe", 10, 25, 1900, "123-45-6789");
		System.out.println(obj.getFirstname());
		System.out.println(obj.getLastname());
		System.out.println(obj.formatBirtday());
		System.out.println(obj.getSsn());
	}

}

class Person176 {
	
	private String firstname;
	private String lastname;
	private int birthmonth;
	private int birthday;
	private int birthyear;
	private String ssn;
	
	public Person176(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthmonth = birthmonth;
		this.birthday = birthday;
		this.birthyear = birthyear;
		this.ssn = ssn;
		
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getBirthmonth() {
		return birthmonth;
	}
	public void setBirthmonth(int birthmonth) {
		this.birthmonth = birthmonth;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String formatBirtday() {
		
		String birtday= (this.getBirthmonth()+"/" +this.getBirthday()+"/"+this.getBirthyear());		
		return birtday;
	}

	
}