package ReplIt;

public class Rep101 {

	 String name;
	   int roll_no;
	   
	   void assign(String name,int roll_no) {
	     System.out.println("Name is "+name+ " and roll number is "+ roll_no);
	   }
	   
	  public static void main(String[] args) {
	    
	    Rep101 test= new Rep101();
	   
	    test.assign("John", 2);
	
	}

}
