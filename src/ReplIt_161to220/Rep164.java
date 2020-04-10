package ReplIt_161to220;

public class Rep164 {
	
	public static void main(String[] args) {
		int[] a = {2,7,3,8,4};
		System.out.println(avgElements(a)); //should print 4.8
	}
	static double avgNum=0;
	static double total=0;
	public static final double avgElements(int[] a) {
		for(int num:a) {
			total+=num;
			avgNum=total/(a.length);
		}
		return avgNum;
	}

}
