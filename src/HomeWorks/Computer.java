package HomeWorks;

public class Computer {
	
	String make;
	int portUsb;
	
	public void keyboard(String make) {
		System.out.println(make+ "has a keyboard");
	}
	public void port(int portUsb) {
		System.out.println(make+" has a "+portUsb);
	}
}

class Apple extends Computer {
	
	public void keyboard(String make) {
		System.out.println(make+ "has a keyboard");
	}
	public void port(int portUsb) {
		System.out.println(make+" has a "+portUsb);
	}
	
}

class Lenova extends Computer {
	public void keyboard(String make) {
		System.out.println(make+ "has a keyboard");
	}
	
	
}