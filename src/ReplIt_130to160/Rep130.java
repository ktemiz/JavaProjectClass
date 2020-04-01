package ReplIt_130to160;

public class Rep130 {
	
	private void test1() {
		System.out.println("This is Private Method");
	}
	void test2() {
		System.out.println("This is Default Method");
	}
	protected void test3() {
		System.out.println("This is Protected Method");
	}
	public void test4() {
		System.out.println("This is Public Method");
	}

	public static void main(String[] args) {
		
		Rep130 obj=new Rep130();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		

	}

}
