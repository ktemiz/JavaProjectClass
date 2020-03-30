package OBB_1;

public class Book {
	
	String nameBook;
	int pageBook;
	String author;
	
	Book(String nameBook, int pageBook) {
		this.nameBook=nameBook;
		this.pageBook=pageBook;
	}
	Book(String author) {
		this("Mehmet",5);
		System.out.println("I like "+author+ " books and especially" + pageBook+" "+ nameBook);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book obj=new Book("Ahmet",34);
		
		

	}

}
