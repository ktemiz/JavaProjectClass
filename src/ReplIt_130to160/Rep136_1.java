package ReplIt_130to160;

public class Rep136_1 {
	
	String schoolName;
	int batch;
	int year;
	String lastDayOfClass;
	
	public Rep136_1() {
		
	}
	public Rep136_1(String schoolName,int batch,int year,String lastDayOfClass) {
	
		this.schoolName=schoolName;
		this.batch=batch;
		this.year=year;
		this.lastDayOfClass=lastDayOfClass;
	}
	
	public void display() {
		System.out.println(schoolName+" "+batch+ " "+year+" "+lastDayOfClass);
	}
	
}
