package ReplIt_99to129;

public class Rep103 {
	
	String breed;
	String name;
	String color;
	
	void bark(String breed) {
		System.out.println(breed+" can bark");
	};
	
	void run(String breed) {
		System.out.println(breed+" can run");
	};
	
	void play(String breed) {
		System.out.println(breed+" can play");
	};
	


	public static void main(String[] args) {
		
		Rep103 typeHusky = new Rep103();
		
		typeHusky.bark("Husky");
		typeHusky.run("Husky");
		typeHusky.play("Husky");
		
		Rep103 typeBulldog = new Rep103();
		
		typeBulldog.bark("Bulldog");
		typeBulldog.run("Bulldog");
		typeBulldog.play("Bulldog");
		
		Rep103 typeLabrador = new Rep103();
		
		typeLabrador.bark("Labrador");
		typeLabrador.run("Labrador");
		typeLabrador.play("Labrador");
		
	
	}

}
