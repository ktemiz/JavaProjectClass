package ReplIt_130to160;

public class Rep160 {

	public static void main(String[] args) {

		Animal160 obj1 = new Cat160("Cat");
		Animal160 obj2 = new Kitten1("kitten1");
		Animal160 obj3 = new Kitten1("kitten2");
		Animal160 obj4 = new Kitten1("kitten3");
		
		Animal160[] array = {obj1,obj2,obj3,obj4};
		
		for(int i=0; i<array.length;i++) {
			switch (i) {
			case 0 : 
				array[i].eat("");
				array[i].sleep();
				break;
			case 1 : 
				array[i].eat("milk");
				array[i].sleep();
				break;
			case 2 : 
				array[i].eat("snacks");
				array[i].sleep();
				break;
			case 3 : 
				array[i].eat("everything");
				array[i].sleep();
				break;
			}
		}

	}
}

class Animal160 {

	String type;

	public Animal160(String type) {
		this.type = type;
	}

	public void eat(String food) {
		System.out.println(type + " eats " + food);
	}

	public void sleep() {
		System.out.println(type + " sleeps a lot");
	}
}

class Cat160 extends Animal160 {

	public Cat160(String type) {
		super(type);
	}

	public void eat(String food) {

		System.out.println(type + " eats " + food);
	}

	public void sleep() {
		System.out.println(type + " sleeps a lot");
	}

}

class Kitten1 extends Cat160 {

	public Kitten1(String type) {
		super(type);
	}

	public void eat(String food) {

		System.out.println(type + " eats " + food);
	}

	public void sleep() {
		System.out.println(type + " sleeps a lot");
	}
}

class Kitten2 extends Cat160 {

	public Kitten2(String type) {
		super(type);
	}

	public void eat(String food) {

		System.out.println(type + " eats " + food);
	}

	public void sleep() {
		System.out.println(type + " sleeps a lot");
	}
}

class Kitten3 extends Cat160 {

	public Kitten3(String type) {
		super(type);
	}

	public void eat(String food) {

		System.out.println(type + " eats " + food);
	}

	public void sleep() {
		System.out.println(type + " sleeps a lot");
	}
}
