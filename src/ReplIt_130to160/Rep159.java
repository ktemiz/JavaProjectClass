package ReplIt_130to160;

public class Rep159 {
	
	public static void main(String[] args) {
		
		Parent159 obj1 = new Child1591();
		Parent159 obj2 = new Child1592();
		Parent159 obj3 = new Child1593();
		
		Parent159[] array = {obj1,obj2,obj3};
		
		for (Parent159 m:array) {
			m.hello();
		}
		
	}

}

class Parent159{
	
	public void hello() {
		System.out.println("method in Parent class");
	}
}

class Child1591 extends Parent159 {

	@Override
	public void hello() {
		System.out.println("method in Child1 class");
	}
}
class Child1592 extends Parent159 {

	@Override
	public void hello() {
		System.out.println("method in Child2 class");
	}
}
class Child1593 extends Parent159 {

	@Override
	public void hello() {
		System.out.println("method in Child3 class");
	}
}
