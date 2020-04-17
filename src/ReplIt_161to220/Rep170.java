package ReplIt_161to220;

public class Rep170 implements ParentInterface,ChildInterface {
	
	public static void main(String[] args) {
		
		Rep170 obj = new Rep170();
		obj.parentMethod();
		obj.childMethod();
	
	}
	
	public void parentMethod() {
		System.out.println("Parent Method-welcome to Syntax");
	}
	
	public void childMethod() {
		System.out.println("Child Method-hello Syntax");
	}

}

interface ParentInterface {
	
	public void parentMethod();
}

interface ChildInterface extends ParentInterface {
	
	public void childMethod();
}
