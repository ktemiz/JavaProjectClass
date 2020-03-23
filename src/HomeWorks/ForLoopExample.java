package HomeWorks;


public class ForLoopExample {

	public static void main(String[] args) {
	  	

	 for(int a = 1; a<=7; a++) {
		 
		 int c =1;
		 
		 for(int b = 7; b>=a; b--) {
			 
			 System.out.print(c);
			 
			 c=c+1;
		 }
		 System.out.println();
	}
	 for(int a = 8; a<=13; a++) {
		 
		 int c =1;
		 for(int b = 1; b<=(a-6); b++) {
			 
			 System.out.print(c);
			 
			 c=c+1;
			 
		 }
		 System.out.println();
	 }
	 

	}
}